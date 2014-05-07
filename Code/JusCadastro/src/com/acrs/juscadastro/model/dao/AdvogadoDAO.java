/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acrs.juscadastro.model.dao;

import com.acrs.juscadastro.model.entity.Advogado;
import com.acrs.juscadastro.util.JPAUtil;
import javax.persistence.EntityManager;

/**
 *
 * @author acrs
 */
public class AdvogadoDAO {

    public void salvar(Advogado adv) {
        EntityManager em = JPAUtil.getInstance();
        em.getTransaction().begin();
        em.persist(adv);
        em.getTransaction().commit();
    }   

    public void atualizar(Advogado adv) {
        EntityManager em = JPAUtil.getInstance();
        em.getTransaction().begin();
        em.merge(adv);
        em.getTransaction().commit();
    }

}
