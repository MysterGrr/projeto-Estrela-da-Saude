
package br.com.estreladasaude.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

//DAO ==> DATA Acess Object
public class PacienteDAO {
    
    private final EntityManager em;

    public PacienteDAO(EntityManager em) {
        this.em = em;
    }
    
    public void cadastrar(Paciente paciente){
        em.persist(paciente);
    }
    
    public void alterar(Paciente paciente){
        em.merge(paciente);
    }
    
    public void remover(Paciente paciente){
        paciente = em.merge(paciente);
        em.remove(paciente);
    }
    
    public Paciente buscarPorId(Integer id){
        return em.find(Paciente.class, id);
    }
    
    public Paciente buscarPorTelefone (String cell){
        String jpql = "SELECT c FROM Paciente c WHERE c.cell = :cell";
        return em.createQuery(jpql, Paciente.class)
                .setParameter("cell", cell)
                .getSingleResult();
    }
    
    public Paciente buscarPorCPF (String cpf){
        String jpql = "SELECT c FROM Paciente c WHERE c.cpf = :cpf";
        return em.createQuery(jpql, Paciente.class)
                .setParameter("cpf", cpf)
                .getSingleResult();
    }
    
    public List<Paciente> buscarTodos(){
        String jpql = "SELECT c FROM Paciente c";
        return em.createQuery(jpql, Paciente.class).getResultList();
    }
    
    public List<Paciente> listarPaciente() {
        List<Paciente> lista = new ArrayList();
        //Linguagem de consulta do HIBERNATE
        String jpql = "SELECT c FROM Paciente c";
        lista = em.createQuery(jpql, Paciente.class).getResultList();        
        return lista;
    }
}
