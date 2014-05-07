/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acrs.juscadastro.util;

import java.awt.GraphicsEnvironment;
import java.sql.Connection;
import java.util.Map;
import javax.swing.JDialog;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;

/**
 *
 * @author acrs
 */
public class LoadReport {

    public static void showPreview(Map<String, Object> parametros, String report, Connection con, JDialog parent) throws JRException {
        JasperPrint jp = JasperFillManager.fillReport(report, parametros, con);        
        JRViewer jrv = new JRViewer(jp);
        JDialog d = new JDialog(parent);
        d.setTitle("Visualizar");
        d.setBounds(GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds()); 
        d.setContentPane(jrv);
        d.setVisible(true);
    }

    public static void createPdf(Map<String, Object> parametros, String report, Connection con, String file) throws JRException {
        JasperPrint jp = JasperFillManager.fillReport(report, parametros, con);
        JasperExportManager.exportReportToPdfFile(jp, file);
    }
}
