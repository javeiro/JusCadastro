/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acrs.juscadastro.report;

import com.acrs.juscadastro.util.JPAUtil;
import com.acrs.juscadastro.util.LoadReport;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.swing.JDialog;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author acrs
 */
public class LoadReportContato {

    private static final String report = "rpt/AgendaTelefonica.jasper";
    
    private static Map setParametros(Collection<Integer> ids, String titulo) {
        Map parametros = new HashMap<>();
        parametros.put("TITULO", titulo);
        parametros.put("IDS", ids);
        return parametros;
    }
        
    public static void showPreview(String titulo, Collection<Integer> ids, JDialog p) throws JRException {        
        EntityManager em = JPAUtil.getInstance();
        em.getTransaction().begin();
        LoadReport.showPreview(setParametros(ids, titulo), report, JPAUtil.getConnection(),p);
        em.getTransaction().commit();
    }
    
    public static void createPdf(String titulo, Collection<Integer> ids, String file) throws JRException {
        EntityManager em = JPAUtil.getInstance();
        em.getTransaction().begin();
        LoadReport.createPdf(setParametros(ids, titulo), report, JPAUtil.getConnection(), file);
        em.getTransaction().commit();
    }
}
