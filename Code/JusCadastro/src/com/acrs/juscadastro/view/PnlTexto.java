/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acrs.juscadastro.view;

import com.acrs.juscadastro.view.interfaces.IPnlNota;
import javax.swing.JTextArea;

/**
 *
 * @author acrs
 */
public class PnlTexto extends javax.swing.JPanel implements IPnlNota{

    /**
     * Creates new form PnlNota
     */
    public PnlTexto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrlNotas = new javax.swing.JScrollPane();
        txaTexto = new javax.swing.JTextArea();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Texto"));

        txaTexto.setColumns(20);
        txaTexto.setRows(5);
        txaTexto.setText("Vamos resolver o seu processo. Conte conosco!!!");
        scrlNotas.setViewportView(txaTexto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrlNotas, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrlNotas, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scrlNotas;
    private javax.swing.JTextArea txaTexto;
    // End of variables declaration//GEN-END:variables

    public void limpar() {
        txaTexto.setText("");
    }

    public void habilitar() {
        editar(true);
    }
    
    public void desabilitar() {
        editar(false);
    }
            
    private void editar(boolean op) {
        txaTexto.setEditable(op);
    }

    public JTextArea getTxaTexto() {
        return txaTexto;
    }    
}
