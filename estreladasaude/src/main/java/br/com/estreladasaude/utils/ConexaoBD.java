
package br.com.estreladasaude.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ConexaoBD {
    
    private static final EntityManagerFactory factory =
                        Persistence.createEntityManagerFactory("estreladasaude");
  
    public static EntityManager getEntityManager(){
        return factory.createEntityManager();
    }
}
