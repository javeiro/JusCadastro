/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acrs.juscadastro.util;

import java.sql.Connection;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author allan
 */
public class JPAUtil {
    
    private static EntityManager em = null;
    
    public static EntityManager getInstance() {
        if (em == null)
            em = Persistence.createEntityManagerFactory("JusCadastroPU").createEntityManager();
        return em;
    }
    
    public static Connection getConnection() {
        EntityManager em = JPAUtil.getInstance();        
        return em.unwrap(Connection.class);        
    }
    
    private JPAUtil() {}
}
