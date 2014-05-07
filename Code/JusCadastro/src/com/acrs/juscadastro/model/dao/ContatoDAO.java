/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acrs.juscadastro.model.dao;

import com.acrs.juscadastro.model.entity.Contato;
import com.acrs.juscadastro.util.JPAUtil;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author acrs
 */
public class ContatoDAO {

    public void salvar(Contato at) {
        EntityManager em = JPAUtil.getInstance();
        em.getTransaction().begin();
        em.persist(at);
        em.getTransaction().commit();
    }

    public void atualizar(Contato c) {
        EntityManager em = JPAUtil.getInstance();
        em.getTransaction().begin();
        em.merge(c);
        em.getTransaction().commit();
    }

    public Contato buscarPorId(Integer id) {
        EntityManager em = JPAUtil.getInstance();
        TypedQuery query = em.createNamedQuery("Contato.get", Contato.class).setParameter("id", id);
        return !query.getResultList().isEmpty()?(Contato) query.getSingleResult():null;        
    }
    
    public List<Integer> buscarTodosIds() {
        EntityManager em = JPAUtil.getInstance();
        TypedQuery query = em.createNamedQuery("Contato.getAllIds", Integer.class);
        List<Integer> ids = query.getResultList();
        return !ids.isEmpty()?ids:null;        
    }

    public Contato buscarPorNome(String nome) {
        EntityManager em = JPAUtil.getInstance();
        TypedQuery query = em.createNamedQuery("Contato.getByNome", Contato.class).setParameter("nome", nome);
        return !query.getResultList().isEmpty()?(Contato) query.getSingleResult():null;        
    }

    public Contato buscarPorCpfj(String cpfj) {
        EntityManager em = JPAUtil.getInstance();
        TypedQuery query = em.createNamedQuery("Contato.getByCpfj", Contato.class).setParameter("cpfj", cpfj);
        return !query.getResultList().isEmpty()?(Contato) query.getSingleResult():null;
    } 

    public List<Integer> buscarPorNomeIds(String nome) {
        EntityManager em = JPAUtil.getInstance();
        TypedQuery query = em.createNamedQuery("Contato.getAllNameIds", Contato.class).setParameter("nome", "%" + nome + "%");
        List<Integer> ids = query.getResultList();
        return !ids.isEmpty()?ids:null;
    }

    public List<Integer> buscarPorEmpresaIds(String empresa) {
        EntityManager em = JPAUtil.getInstance();
        TypedQuery query = em.createNamedQuery("Contato.getAllCompanyIds", Contato.class).setParameter("empresa", "%" + empresa + "%");
        List<Integer> ids = query.getResultList();
        return !ids.isEmpty()?ids:null;
    }

    public List<Integer> buscarPorNascimentoIds(Calendar dataNascimento) {
        EntityManager em = JPAUtil.getInstance();
        TypedQuery query = em.createNamedQuery("Contato.getAllAgeIds", Contato.class).setParameter("dataNascimento", dataNascimento);
        List<Integer> ids = query.getResultList();
        return !ids.isEmpty()?ids:null;
    }

    public List<Integer> buscarPorNotasIds(String nota) {
        EntityManager em = JPAUtil.getInstance();
        TypedQuery query = em.createNamedQuery("Contato.getAllNotesIds", Contato.class).setParameter("notas", "%" + nota + "%");
        List<Integer> ids = query.getResultList();
        return !ids.isEmpty()?ids:null;
    }

    public void excluir(Integer id) {
        
        
        EntityManager em = JPAUtil.getInstance();
        em.getTransaction().begin();
        Query query = em.createQuery("DELETE FROM Contato c WHERE c.id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
        em.getTransaction().commit();
    }
}
