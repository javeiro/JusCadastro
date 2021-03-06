/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acrs.juscadastro.view.dialog;

import com.acrs.juscadastro.control.ContatoControl;
import com.acrs.juscadastro.view.interfaces.IPnlContato;
import com.acrs.juscadastro.view.interfaces.ITxtPaginador;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author acrs
 */
public class DlgBalanco extends javax.swing.JDialog /*implements IPnlAgenda, ITxtPaginador*/ {

    /**
     * Creates new form TelaContato
     */
    public DlgBalanco(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        desabilitar();
        limpar();
       // AgendaTelefonicaControl.mostrarPrimeiroRegistro(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAgenda = new javax.swing.JPanel();
        tlbAgenda = new javax.swing.JToolBar();
        btnIncluir = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        txtRegistroCorrente = new javax.swing.JTextField();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        pnlBalanco1 = new com.acrs.juscadastro.view.panel.PnlBalanco();
        pnlNota1 = new com.acrs.juscadastro.view.panel.PnlTexto();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agenda Telefônica");
        setIconImage(new ImageIcon(getClass().getResource("/com/acrs/juscadastro/view/img/contatos_32x32.png")).getImage());
        setMinimumSize(new java.awt.Dimension(782, 633));

        pnlAgenda.setPreferredSize(new java.awt.Dimension(596, 532));

        tlbAgenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tlbAgenda.setFloatable(false);
        tlbAgenda.setRollover(true);

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/acrs/juscadastro/view/img/incluir_48x48.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.setFocusable(false);
        btnIncluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIncluir.setMaximumSize(new java.awt.Dimension(73, 73));
        btnIncluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });
        tlbAgenda.add(btnIncluir);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/acrs/juscadastro/view/img/excluir_48x48.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setFocusable(false);
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.setMaximumSize(new java.awt.Dimension(73, 73));
        btnExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        tlbAgenda.add(btnExcluir);

        btnVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/acrs/juscadastro/view/img/visualizar_48x48.png"))); // NOI18N
        btnVisualizar.setText("Visualizar");
        btnVisualizar.setFocusable(false);
        btnVisualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVisualizar.setMaximumSize(new java.awt.Dimension(73, 73));
        btnVisualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });
        tlbAgenda.add(btnVisualizar);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/acrs/juscadastro/view/img/imprimir_48x48.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setFocusable(false);
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setMaximumSize(new java.awt.Dimension(73, 73));
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        tlbAgenda.add(btnImprimir);

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/acrs/juscadastro/view/img/fechar_48x48.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.setFocusable(false);
        btnFechar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFechar.setMaximumSize(new java.awt.Dimension(73, 73));
        btnFechar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        tlbAgenda.add(btnFechar);

        btnPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/acrs/juscadastro/view/img/primeiro_16x16.png"))); // NOI18N
        btnPrimeiro.setText("Primeiro");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/acrs/juscadastro/view/img/anterior_16x16.png"))); // NOI18N
        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        txtRegistroCorrente.setEditable(false);
        txtRegistroCorrente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistroCorrente.setText("1/1");

        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/acrs/juscadastro/view/img/proximo_16x16.png"))); // NOI18N
        btnProximo.setText("Próximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/acrs/juscadastro/view/img/ultimo_16x16.png"))); // NOI18N
        btnUltimo.setText("Último");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        pnlNota1.setBorder(javax.swing.BorderFactory.createTitledBorder("Histórico"));
        pnlNota1.setPreferredSize(new java.awt.Dimension(596, 530));

        javax.swing.GroupLayout pnlAgendaLayout = new javax.swing.GroupLayout(pnlAgenda);
        pnlAgenda.setLayout(pnlAgendaLayout);
        pnlAgendaLayout.setHorizontalGroup(
            pnlAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tlbAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlAgendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBalanco1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlAgendaLayout.createSequentialGroup()
                        .addComponent(btnPrimeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegistroCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUltimo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlAgendaLayout.setVerticalGroup(
            pnlAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgendaLayout.createSequentialGroup()
                .addComponent(tlbAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBalanco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNota1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnAnterior)
                    .addComponent(txtRegistroCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProximo)
                    .addComponent(btnUltimo))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        DlgAgendaTelefonicaEditar d = new DlgAgendaTelefonicaEditar(this, true);
        d.setVisible(true);
//        AgendaTelefonicaControl.mostrarPrimeiroRegistro(this);
  //      AgendaTelefonicaControl.atualizarPaginador(this);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
  //      AgendaTelefonicaControl.mostrarPrimeiroRegistro(this);
        desabilitar();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
  //      AgendaTelefonicaControl.mostrarAnteriorRegistro(this);
        desabilitar();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
   //     AgendaTelefonicaControl.mostrarProximoRegistro(this);
   //     desabilitar();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
  //      AgendaTelefonicaControl.mostrarUltimoRegistro(this);
  //      desabilitar();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       /* int opcao = JOptionPane.showConfirmDialog(this,
                "Ao excluir esse contato, todos os processos, compromissos, notas,"
                + "\nbalancos serão perdidos. Tem certeza que deseja excluir?");
        if (opcao == JOptionPane.OK_OPTION) {
            AgendaTelefonicaControl.excluirRegistro(this);
            AgendaTelefonicaControl.mostrarPrimeiroRegistro(this);
            AgendaTelefonicaControl.atualizarPaginador(this);
        }*/
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        DlgAgendaTelefonicaTabela f = new DlgAgendaTelefonicaTabela(this, true);        
        f.setVisible(true);        
     /*   AgendaTelefonicaControl.mostrarAtualRegistro(this);
        AgendaTelefonicaControl.atualizarPaginador(this);*/
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        DlgAgendaTelefonicaImprimir f = new DlgAgendaTelefonicaImprimir(this, true);
        f.setVisible(true);        
    }//GEN-LAST:event_btnImprimirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
        }

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgBalanco dialog = new DlgBalanco(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JPanel pnlAgenda;
    private com.acrs.juscadastro.view.panel.PnlBalanco pnlBalanco1;
    private com.acrs.juscadastro.view.panel.PnlTexto pnlNota1;
    private javax.swing.JToolBar tlbAgenda;
    private javax.swing.JTextField txtRegistroCorrente;
    // End of variables declaration//GEN-END:variables

    private Integer idContato;

    public void limpar() {
/*        pnlPessoal.limpar();
        pnlEndereco.limpar();
        pnlContato.limpar();
        pnlAdvogado.limpar();
        pnlNota.limpar();*/
    }

    private void desabilitar() {
    /*    pnlPessoal.desabilitar();
        pnlEndereco.desabilitar();
        pnlContato.desabilitar();
        pnlAdvogado.desabilitar();
        pnlNota.desabilitar();*/
    }

    /*@Override
    public PnlAdvogado getPnlAdvogado() {
        return pnlAdvogado;
    }

    @Override
    public PnlContato getPnlContato() {
        return pnlContato;
    }

    @Override
    public PnlEndereco getPnlEndereco() {
        return pnlEndereco;
    }

    @Override
    public PnlNota getPnlNota() {
        return pnlNota;
    }

    @Override
    public PnlPessoal getPnlPessoal() {
        return pnlPessoal;
    }

    @Override
    public JTextField getTxtRegistroCorrente() {
        return txtRegistroCorrente;
    }*/

    private void DlgAgendaEditar(DlgBalanco aThis, boolean b, Integer idAgendaTelefonica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
