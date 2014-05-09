/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acrs.juscadastro.control;

import com.acrs.juscadastro.util.JPAUtil;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author acrs
 */
public class JusCadastroControl {

    // Propriedades ------------------------------------------------------------
    private final static String propriedades = "config.properties";

    private static String escritorio = "";

    private static String chave = "";

    // Construtores ------------------------------------------------------------
    static {
        ajustarAparencia();
        lerPropriedades();
    }

    // Getters-Setters ---------------------------------------------------------
    public static String getEscritorio() {
        return escritorio;
    }

    public static void setEscritorio(String e) {
        escritorio = e;
        gravarPropriedades();
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String c) {
        chave = c;
        gravarPropriedades();
    }

    // Metodos -----------------------------------------------------------------
    public static void iniciarORM() {
        /*try {*/
            JPAUtil.getInstance();
        /*} catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Base de dados indisponível.", "Erro:", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }*/
    }

    private static void lerPropriedades() {
        Properties prop = new Properties();
        FileInputStream input = null;

        try {
            input = new FileInputStream(propriedades);
            prop.load(input);
            escritorio = prop.getProperty("escritorio");
            chave = prop.getProperty("chave");
        } catch (FileNotFoundException ex) {
            iniciarPropriedades();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao ler config.properties.", "Erro:", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    private static void iniciarPropriedades() {
        escritorio = "Escritório JUSCADASTRO";
        chave = "0000";
        gravarPropriedades();
    }

    private static void gravarPropriedades() {
        Properties prop = new Properties();
        OutputStream output = null;
        try {
            output = new FileOutputStream(propriedades);
            prop.setProperty("escritorio", escritorio);
            prop.setProperty("chave", chave);
            prop.store(output, null);
        } catch (IOException io) {
            JOptionPane.showMessageDialog(null, "Falha ao gravar config.properties.", "Erro:", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void ajustarAparencia() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao ajustar aparencia.", "Erro:", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
}
