/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acrs.juscadastro.view.panel;

import com.acrs.juscadastro.util.MaxLengthTextDocument;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author acrs
 */
public class PnlProcesso extends javax.swing.JPanel {

    /**
     * Creates new form PContato
     */
    public PnlProcesso() {
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

        bgpTipo = new javax.swing.ButtonGroup();
        lblComarca = new javax.swing.JLabel();
        txtComarca = new javax.swing.JTextField();
        lblVara = new javax.swing.JLabel();
        txtVara = new javax.swing.JTextField();
        lblOrigem = new javax.swing.JLabel();
        txtOrigem = new javax.swing.JTextField();
        rbtReu = new javax.swing.JRadioButton();
        rbtAutor = new javax.swing.JRadioButton();
        lblAcao = new javax.swing.JLabel();
        txtAcao = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblRegional = new javax.swing.JLabel();
        txtRegional = new javax.swing.JTextField();
        lblDistribuição = new javax.swing.JLabel();
        dtcDataDistribuicao = new com.toedter.calendar.JDateChooser();
        lblEscrevente = new javax.swing.JLabel();
        txtEscrevente = new javax.swing.JTextField();
        lblOficial = new javax.swing.JLabel();
        txtOficial = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Processo"));

        lblComarca.setDisplayedMnemonic('m');
        lblComarca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblComarca.setLabelFor(txtComarca);
        lblComarca.setText("Comarca:");

        txtComarca.setDocument(new MaxLengthTextDocument(100));
        txtComarca.setText("123456789012345");
        txtComarca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtComarcaFocusGained(evt);
            }
        });

        lblVara.setDisplayedMnemonic('c');
        lblVara.setLabelFor(txtVara);
        lblVara.setText("Vara:");

        txtVara.setDocument(new MaxLengthTextDocument(14));
        txtVara.setText("123456789012345");
        txtVara.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtVaraFocusGained(evt);
            }
        });

        lblOrigem.setDisplayedMnemonic('a');
        lblOrigem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOrigem.setText("Origem:");

        txtOrigem.setDocument(new MaxLengthTextDocument(100));
        txtOrigem.setText("Processo Penal Homicídio Juvenil");
        txtOrigem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOrigemFocusGained(evt);
            }
        });

        rbtReu.setSelected(true);
        rbtReu.setText("Réu");

        rbtAutor.setText("Autor");

        lblAcao.setDisplayedMnemonic('c');
        lblAcao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAcao.setLabelFor(txtVara);
        lblAcao.setText("Ação:");

        txtAcao.setDocument(new MaxLengthTextDocument(14));
        txtAcao.setText("123456789012345");
        txtAcao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAcaoFocusGained(evt);
            }
        });

        lblNumero.setDisplayedMnemonic('c');
        lblNumero.setLabelFor(txtVara);
        lblNumero.setText("Numero:");

        txtNumero.setDocument(new MaxLengthTextDocument(14));
        txtNumero.setText("123456789012345");
        txtNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumeroFocusGained(evt);
            }
        });

        lblRegional.setDisplayedMnemonic('r');
        lblRegional.setLabelFor(txtRegional);
        lblRegional.setText("Regional:");

        txtRegional.setDocument(new MaxLengthTextDocument(50));
        txtRegional.setText("Analista de Sistemas");
        txtRegional.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRegionalFocusGained(evt);
            }
        });

        lblDistribuição.setDisplayedMnemonic('s');
        lblDistribuição.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDistribuição.setLabelFor(txtOrigem);
        lblDistribuição.setText("Distribuição:");

        lblEscrevente.setDisplayedMnemonic('r');
        lblEscrevente.setLabelFor(txtRegional);
        lblEscrevente.setText("Escrevente:");

        txtEscrevente.setDocument(new MaxLengthTextDocument(50));
        txtEscrevente.setText("Vicente Nasário Gomes do Nascimento");
        txtEscrevente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEscreventeFocusGained(evt);
            }
        });

        lblOficial.setDisplayedMnemonic('s');
        lblOficial.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOficial.setLabelFor(txtOrigem);
        lblOficial.setText("Oficial:");

        txtOficial.setDocument(new MaxLengthTextDocument(50));
        txtOficial.setText("Vicente Nasário Gomes do Nascimento");
        txtOficial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOficialFocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblComarca, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtComarca, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblVara)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtVara, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblOrigem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOrigem, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtReu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtAutor))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblDistribuição, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dtcDataDistribuicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRegional)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRegional))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEscrevente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEscrevente))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblOficial, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOficial)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComarca)
                    .addComponent(txtComarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVara)
                    .addComponent(txtVara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrigem)
                    .addComponent(txtOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtReu)
                    .addComponent(rbtAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegional)
                    .addComponent(txtRegional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAcao)
                    .addComponent(txtAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDistribuição)
                        .addComponent(lblEscrevente)
                        .addComponent(txtEscrevente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dtcDataDistribuicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOficial)
                    .addComponent(txtOficial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtComarcaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtComarcaFocusGained
        txtComarca.selectAll();
    }//GEN-LAST:event_txtComarcaFocusGained

    private void txtVaraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVaraFocusGained
        txtVara.selectAll();
    }//GEN-LAST:event_txtVaraFocusGained

    private void txtOrigemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOrigemFocusGained
        txtOrigem.selectAll();
    }//GEN-LAST:event_txtOrigemFocusGained

    private void txtRegionalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegionalFocusGained
        txtRegional.selectAll();
    }//GEN-LAST:event_txtRegionalFocusGained

    private void txtAcaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAcaoFocusGained
        txtAcao.selectAll();
    }//GEN-LAST:event_txtAcaoFocusGained

    private void txtNumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroFocusGained
        txtNumero.selectAll();
    }//GEN-LAST:event_txtNumeroFocusGained

    private void txtEscreventeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEscreventeFocusGained
        txtEscrevente.selectAll();
    }//GEN-LAST:event_txtEscreventeFocusGained

    private void txtOficialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOficialFocusGained
        txtOficial.selectAll();
    }//GEN-LAST:event_txtOficialFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgpTipo;
    private com.toedter.calendar.JDateChooser dtcDataDistribuicao;
    private javax.swing.JLabel lblAcao;
    private javax.swing.JLabel lblComarca;
    private javax.swing.JLabel lblDistribuição;
    private javax.swing.JLabel lblEscrevente;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblOficial;
    private javax.swing.JLabel lblOrigem;
    private javax.swing.JLabel lblRegional;
    private javax.swing.JLabel lblVara;
    private javax.swing.JRadioButton rbtAutor;
    private javax.swing.JRadioButton rbtReu;
    private javax.swing.JTextField txtAcao;
    private javax.swing.JTextField txtComarca;
    private javax.swing.JTextField txtEscrevente;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtOficial;
    private javax.swing.JTextField txtOrigem;
    private javax.swing.JTextField txtRegional;
    private javax.swing.JTextField txtVara;
    // End of variables declaration//GEN-END:variables

    private Integer idProcesso;

    public void limpar() {
        idProcesso = null;
        txtComarca.setText("");
        txtVara.setText("");
        txtAcao.setText("");
        txtNumero.setText("");
        txtOrigem.setText("");
        txtRegional.setText("");
        txtOficial.setText("");
        dtcDataDistribuicao.setCalendar(null);
        txtEscrevente.setText("");
        rbtAutor.setSelected(true);
    }

    public void habilitar() {
        editar(true);
    }
    
    public void desabilitar() {
        editar(false);
    }
            
    private void editar(boolean op) {
        dtcDataDistribuicao.setEnabled(op);
        txtVara.setEditable(op);
        txtRegional.setEditable(op);
        txtOrigem.setEditable(op);
        txtComarca.setEditable(op);
    }

    public Integer getIdProcesso() {
        return idProcesso;
    }

    public void setIdProcesso(Integer idProcesso) {
        this.idProcesso = idProcesso;
    }

    public JRadioButton getRbtAutor() {
        return rbtAutor;
    }

    public JRadioButton getRbtReu() {
        return rbtReu;
    }

    public JTextField getTxtAcao() {
        return txtAcao;
    }

    public JTextField getTxtComarca() {
        return txtComarca;
    }

    public JTextField getTxtEscrevente() {
        return txtEscrevente;
    }

    public JTextField getTxtNumero() {
        return txtNumero;
    }

    public JTextField getTxtOficial() {
        return txtOficial;
    }

    public JTextField getTxtOrigem() {
        return txtOrigem;
    }

    public JTextField getTxtRegional() {
        return txtRegional;
    }

    public JTextField getTxtVara() {
        return txtVara;
    }
         
}
