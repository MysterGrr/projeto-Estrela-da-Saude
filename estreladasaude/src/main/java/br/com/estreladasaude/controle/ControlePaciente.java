
package br.com.estreladasaude.controle;

import br.com.estreladasaude.modelo.Paciente;
import br.com.estreladasaude.modelo.PacienteDAO;
import br.com.estreladasaude.utils.ConexaoBD;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;


public class ControlePaciente {
    
    private Paciente paciente;
    private PacienteDAO dao;
    private EntityManager em;
    
    public void novoPaciente(String nome, String cpf, LocalDate dataN, String cell, String email, String convenio){
        //Cria a conexao com o bd
        em = ConexaoBD.getEntityManager();
        
        //Inicia uma transacao
        em.getTransaction().begin();
        dao = new PacienteDAO(em);
        paciente = new Paciente(null, nome, cpf, dataN, cell, email, convenio);
        
        //Persiste o cliente no bd
        dao.cadastrar(paciente);
        //Confirma a gravacao
        em.getTransaction().commit();
        //em.getTransaction().rollback();//Cancela as operacoes da transacao
       
        //Encerra a conexao com o bd
        em.close();
    }
    
    public void alterarPaciente(Integer codigo, String nome, String cpf, LocalDate dataN, String cell, String email, String convenio){
        em = ConexaoBD.getEntityManager();
        em.getTransaction().begin();
        dao = new PacienteDAO(em);
        paciente = new Paciente(codigo, nome, cpf, dataN, cell, email, convenio);
        
        dao.alterar(paciente);
        em.getTransaction().commit();
        em.close();
    }
    
    public List<Paciente> exibirPaciente(){
        List<Paciente> lista = new ArrayList();
        em = ConexaoBD.getEntityManager();
        em.getTransaction().begin();
        dao = new PacienteDAO(em);
        lista = dao.listarPaciente();
        em.getTransaction().commit();
        em.close();
        return lista;
    }
    
    public boolean buscarPacientePorCPF(String cpf){
    Paciente paciente = null;
    em = ConexaoBD.getEntityManager();
    em.getTransaction().begin();
    dao = new PacienteDAO(em);
    
    try {
        paciente = dao.buscarPorCPF(cpf);
    } catch (NoResultException e) {
        // Se NoResultException for lançada, isso significa que nenhum paciente foi encontrado
        paciente = null;
    }
    
    em.getTransaction().commit();
    em.close();
    
    // Se paciente for null, retorna false. Caso contrário, retorna true.
    return paciente != null;
}
    
    public Paciente buscarPacientePorCell(String cell){
        Paciente paciente = null;
        em = ConexaoBD.getEntityManager();
        em.getTransaction().begin();
        dao = new PacienteDAO(em);
        
        paciente = dao.buscarPorTelefone(cell);
        em.getTransaction().commit();
        em.close();
        return paciente;
    }
    
    public Paciente buscarPacientePorCodigo(String codigo){
        Paciente paciente = null;
        em = ConexaoBD.getEntityManager();
        em.getTransaction().begin();
        dao = new PacienteDAO(em);
        
        paciente = dao.buscarPorCPF(codigo);
        em.getTransaction().commit();
        em.close();
        return paciente;
    }
    
    public void apagaPaciente(Integer codigo){
        Paciente paciente = new Paciente();
        paciente.setCodigo(codigo);
        
        em = ConexaoBD.getEntityManager();
        em.getTransaction().begin();
        dao = new PacienteDAO(em);
        dao.remover(paciente);
        em.getTransaction().commit();
        em.close();           
    }
    
    public Paciente buscarPaciente(String cpf){
        Paciente paciente = null;
        EntityManager em = ConexaoBD.getEntityManager();

        em.getTransaction().begin();
        dao = new PacienteDAO(em);
        paciente = dao.buscarPorCPF(cpf);
        em.getTransaction().commit();
        em.close();
        return paciente;
    }
    
    public List<Paciente> listarClientes(){
        EntityManager em = ConexaoBD.getEntityManager();

        em.getTransaction().begin();
        dao = new PacienteDAO(em);
        List<Paciente> lista = dao.buscarTodos();
        em.getTransaction().commit();
        em.close();
        return lista;
    }
    
}
