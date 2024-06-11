
package br.com.estreladasaude.teste;

import br.com.estreladasaude.modelo.Paciente;
import br.com.estreladasaude.modelo.PacienteDAO;
import br.com.estreladasaude.utils.ConexaoBD;
import javax.persistence.EntityManager;


public class TesteCadastrar {
    public static void main(String[] args) {
        
       Paciente novo = new Paciente("Fitinha", "36083956013", 
                                    "21999637686","fitas@email.com", "Bradesco");
        
       EntityManager em = ConexaoBD.getEntityManager();
        
       em.getTransaction().begin();
       PacienteDAO dao = new PacienteDAO(em);
       dao.cadastrar(novo);
       em.getTransaction().commit();
       em.close();
        
    }
    
       
    
}
