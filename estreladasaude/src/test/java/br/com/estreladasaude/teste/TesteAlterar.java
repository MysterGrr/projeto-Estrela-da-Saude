
package br.com.estreladasaude.teste;

import br.com.estreladasaude.modelo.Paciente;
import br.com.estreladasaude.modelo.PacienteDAO;
import br.com.estreladasaude.utils.ConexaoBD;
import javax.persistence.EntityManager;


public class TesteAlterar {
   public static void main(String[] args) {
       Paciente novo = new Paciente("Juca", "27754068745",
                                    "21976681328", "juca@hotmail.com.br", "bradesco");
      
       EntityManager em = ConexaoBD.getEntityManager();
       
       em.getTransaction().begin();
       PacienteDAO dao = new PacienteDAO(em);
       dao.alterar(novo);
       em.getTransaction().commit();
       em.close();
        
   }
}
