
package br.com.estreladasaude.teste;

import br.com.estreladasaude.modelo.Paciente;
import br.com.estreladasaude.modelo.PacienteDAO;
import br.com.estreladasaude.utils.ConexaoBD;
import java.util.List;
import javax.persistence.EntityManager;


public class TesteBuscar {
    public static void main(String[] args) {
        EntityManager em = ConexaoBD.getEntityManager();
        
        em.getTransaction().begin();
        PacienteDAO dao = new PacienteDAO(em);
        List<Paciente> lista = dao.buscarTodos();
        em.getTransaction().commit();
        em.close();
        
        for (Paciente paciente : lista){
            System.out.println(paciente);
        }
    }
    
}
