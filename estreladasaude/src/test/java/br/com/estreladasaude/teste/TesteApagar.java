
package br.com.estreladasaude.teste;

import br.com.estreladasaude.modelo.Paciente;
import br.com.estreladasaude.modelo.PacienteDAO;
import br.com.estreladasaude.utils.ConexaoBD;
import javax.persistence.EntityManager;


public class TesteApagar {
    public static void main(String[] args) {
        Paciente novo = new Paciente("Salsa",   "48648348484", 
                                    "21984372465", "ghibinigameplay@gmail.com", "unimed");
        EntityManager em = ConexaoBD.getEntityManager();
        
        em.getTransaction().begin();
        PacienteDAO dao = new PacienteDAO(em);
        dao.remover(novo);
        em.getTransaction().commit();
        em.close();
        
    }
    
}
