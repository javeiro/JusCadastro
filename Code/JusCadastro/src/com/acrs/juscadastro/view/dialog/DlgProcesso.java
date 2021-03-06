/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acrs.juscadastro.view.dialog;

import com.acrs.juscadastro.control.ProcessoControl;
import com.acrs.juscadastro.view.panel.PnlEndereco;
import com.acrs.juscadastro.view.panel.PnlNome;
import com.acrs.juscadastro.view.panel.PnlProcesso;
import com.acrs.juscadastro.view.panel.PnlTexto;
import com.acrs.juscadastro.view.interfaces.IPnlProcesso;
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
public class DlgProcesso extends javax.swing.JDialog implements IPnlProcesso, ITxtPaginador {

    /**
     * Creates new form TelaContato
     * @param parent
     * @param modal
     */
    public DlgProcesso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        desabilitar();
        limpar();
        ProcessoControl.mostrarPrimeiroRegistro(this);
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
        btnLocalizar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnBalanco = new javax.swing.JButton();
        btnAgenda = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        txtRegistroCorrente = new javax.swing.JTextField();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlTabProcesso = new javax.swing.JPanel();
        pnlProcesso = new com.acrs.juscadastro.view.panel.PnlProcesso();
        pnlEndereco = new com.acrs.juscadastro.view.panel.PnlEndereco();
        pnlAndamento = new com.acrs.juscadastro.view.panel.PnlTexto();
        pnlTabContato = new javax.swing.JPanel();
        pnlCliente = new com.acrs.juscadastro.view.panel.PnlNome();
        pnlAdvogado = new com.acrs.juscadastro.view.panel.PnlNome();
        pnlTestemunha = new com.acrs.juscadastro.view.panel.PnlNome();
        pnlParteContraria = new com.acrs.juscadastro.view.panel.PnlNome();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acompanhamento de Processos");
        setIconImage(new ImageIcon(getClass().getResource("/com/acrs/juscadastro/view/img/processo_32x32.png")).getImage());
        setMinimumSize(new java.awt.Dimension(782, 633));

        tlbAgenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tlbAgenda.setFloatable(false);
        tlbAgenda.setRollover(true);

        btnLocalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/acrs/juscadastro/view/img/localizar_48x48.png"))); // NOI18N
        btnLocalizar.setText("Localizar");
        btnLocalizar.setFocusable(false);
        btnLocalizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLocalizar.setMaximumSize(new java.awt.Dimension(73, 73));
        btnLocalizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarActionPerformed(evt);
            }
        });
        tlbAgenda.add(btnLocalizar);

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

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/acrs/juscadastro/view/img/editar_48x48.png"))); // NOI18N
        btnEditar.setText("Alterar");
        btnEditar.setFocusable(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setMaximumSize(new java.awt.Dimension(73, 73));
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        tlbAgenda.add(btnEditar);

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

        btnBalanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/acrs/juscadastro/view/img/balanco_48x48.png"))); // NOI18N
        btnBalanco.setText("Balanço");
        btnBalanco.setFocusable(false);
        btnBalanco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBalanco.setMaximumSize(new java.awt.Dimension(73, 73));
        btnBalanco.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBalanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalancoActionPerformed(evt);
            }
        });
        tlbAgenda.add(btnBalanco);

        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/acrs/juscadastro/view/img/agenda_48x48.png"))); // NOI18N
        btnAgenda.setText("Agenda");
        btnAgenda.setFocusable(false);
        btnAgenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgenda.setMaximumSize(new java.awt.Dimension(73, 73));
        btnAgenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaActionPerformed(evt);
            }
        });
        tlbAgenda.add(btnAgenda);

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

        pnlAndamento.setBorder(javax.swing.BorderFactory.createTitledBorder("Andamento"));

        javax.swing.GroupLayout pnlTabProcessoLayout = new javax.swing.GroupLayout(pnlTabProcesso);
        pnlTabProcesso.setLayout(pnlTabProcessoLayout);
        pnlTabProcessoLayout.setHorizontalGroup(
            pnlTabProcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabProcessoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTabProcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlProcesso, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                    .addComponent(pnlEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAndamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTabProcessoLayout.setVerticalGroup(
            pnlTabProcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabProcessoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAndamento, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Processo", pnlTabProcesso);

        pnlCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes"));

        pnlAdvogado.setBorder(javax.swing.BorderFactory.createTitledBorder("Advogados"));

        pnlTestemunha.setBorder(javax.swing.BorderFactory.createTitledBorder("Testemunhas"));

        pnlParteContraria.setBorder(javax.swing.BorderFactory.createTitledBorder("Partes Contrárias"));

        javax.swing.GroupLayout pnlTabContatoLayout = new javax.swing.GroupLayout(pnlTabContato);
        pnlTabContato.setLayout(pnlTabContatoLayout);
        pnlTabContatoLayout.setHorizontalGroup(
            pnlTabContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTabContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                    .addComponent(pnlAdvogado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTestemunha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlParteContraria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTabContatoLayout.setVerticalGroup(
            pnlTabContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAdvogado, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTestemunha, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlParteContraria, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Contatos", pnlTabContato);

        javax.swing.GroupLayout pnlAgendaLayout = new javax.swing.GroupLayout(pnlAgenda);
        pnlAgenda.setLayout(pnlAgendaLayout);
        pnlAgendaLayout.setHorizontalGroup(
            pnlAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tlbAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlAgendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
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
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlAgendaLayout.setVerticalGroup(
            pnlAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgendaLayout.createSequentialGroup()
                .addComponent(tlbAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPrimeiro)
                        .addComponent(btnAnterior)
                        .addComponent(btnProximo)
                        .addComponent(btnUltimo))
                    .addComponent(txtRegistroCorrente))
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
        ProcessoControl.mostrarPrimeiroRegistro(this);
        ProcessoControl.atualizarPaginador(this);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        ProcessoControl.mostrarPrimeiroRegistro(this);
        desabilitar();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        ProcessoControl.mostrarAnteriorRegistro(this);
        desabilitar();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        ProcessoControl.mostrarProximoRegistro(this);
        desabilitar();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        ProcessoControl.mostrarUltimoRegistro(this);
        desabilitar();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Integer id = getPnlProcesso().getIdProcesso();
        if (id != null) {
            if (id >= 0) {
                DlgProcessoEditar d = new DlgProcessoEditar(this, true, id);
                d.setVisible(true);
                ProcessoControl.mostrarAtualRegistro(this);
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarActionPerformed
        DlgProcessoLocalizar d = new DlgProcessoLocalizar(this, true);
        d.setVisible(true);
        ProcessoControl.mostrarPrimeiroRegistro(this);
        ProcessoControl.atualizarPaginador(this);
    }//GEN-LAST:event_btnLocalizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this,
                "Ao excluir esse processo, todos os compromissos, notas,"
                + "\nbalancos serão perdidos. Tem certeza que deseja excluir?");
        if (opcao == JOptionPane.OK_OPTION) {
            ProcessoControl.excluirRegistro(this);
            ProcessoControl.mostrarPrimeiroRegistro(this);
            ProcessoControl.atualizarPaginador(this);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        DlgAgendaTelefonicaTabela f = new DlgAgendaTelefonicaTabela(this, true);        
        f.setVisible(true);        
        ProcessoControl.mostrarAtualRegistro(this);
        ProcessoControl.atualizarPaginador(this);
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        DlgProcessoImprimir f = new DlgProcessoImprimir(this, true);
        f.setVisible(true);        
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnBalancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalancoActionPerformed
        DlgBalanco f = new DlgBalanco(this, true);
        f.setVisible(true);
    }//GEN-LAST:event_btnBalancoActionPerformed

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgendaActionPerformed

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
                DlgProcesso dialog = new DlgProcesso(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBalanco;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnLocalizar;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.acrs.juscadastro.view.panel.PnlNome pnlAdvogado;
    private javax.swing.JPanel pnlAgenda;
    private com.acrs.juscadastro.view.panel.PnlTexto pnlAndamento;
    private com.acrs.juscadastro.view.panel.PnlNome pnlCliente;
    private com.acrs.juscadastro.view.panel.PnlEndereco pnlEndereco;
    private com.acrs.juscadastro.view.panel.PnlNome pnlParteContraria;
    private com.acrs.juscadastro.view.panel.PnlProcesso pnlProcesso;
    private javax.swing.JPanel pnlTabContato;
    private javax.swing.JPanel pnlTabProcesso;
    private com.acrs.juscadastro.view.panel.PnlNome pnlTestemunha;
    private javax.swing.JToolBar tlbAgenda;
    private javax.swing.JTextField txtRegistroCorrente;
    // End of variables declaration//GEN-END:variables

    private Integer idProcesso;

    public Integer getIdProcesso() {
        return idProcesso;
    }

    public void setIdContato(Integer idContato) {
        this.idProcesso = idProcesso;
    }

    public void limpar() {
        pnlProcesso.limpar();
        pnlEndereco.limpar();
        pnlAndamento.limpar();
        pnlCliente.limpar();
        pnlAdvogado.limpar();
        pnlTestemunha.limpar();
        pnlParteContraria.limpar();
    }

    private void desabilitar() {
        pnlProcesso.desabilitar();
        pnlEndereco.desabilitar();
        pnlAndamento.desabilitar();
        pnlCliente.desabilitar();
        pnlAdvogado.desabilitar();
        pnlTestemunha.desabilitar();
        pnlParteContraria.desabilitar();
    }

    public PnlNome getPnlAdvogado() {
        return pnlAdvogado;
    }

    public PnlNome getPnlCliente() {
        return pnlCliente;
    }

    public PnlEndereco getPnlEndereco() {
        return pnlEndereco;
    }

    public PnlNome getPnlParteContraria() {
        return pnlParteContraria;
    }

    public PnlProcesso getPnlProcesso() {
        return pnlProcesso;
    }

    public PnlTexto getPnlTexto() {
        return pnlAndamento;
    }

    public JTextField getTxtRegistroCorrente() {
        return txtRegistroCorrente;
    }

}
