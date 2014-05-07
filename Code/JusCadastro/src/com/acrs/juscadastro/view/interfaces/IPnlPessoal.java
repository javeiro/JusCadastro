/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acrs.juscadastro.view.interfaces;

import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;

/**
 *
 * @author acrs
 */
public interface IPnlPessoal {
    public JDateChooser getDtcNascimento();
    public JTextField getTxtCPFJ();
    public JTextField getTxtCargo();
    public JTextField getTxtEmpresa();
    public JTextField getTxtNome();
    public Integer getIdAgendaTelefonica();
    public void setIdAgendaTelefonica(Integer idContato);
}
