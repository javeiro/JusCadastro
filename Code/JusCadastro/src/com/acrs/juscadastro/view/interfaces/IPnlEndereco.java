/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acrs.juscadastro.view.interfaces;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *
 * @author acrs
 */
public interface IPnlEndereco {
    public JComboBox getCbxUF();
    public JFormattedTextField getTxfCEP();
    public JTextField getTxtBairro();
    public JTextField getTxtCidade();
    public JTextField getTxtComplemento();
    public JTextField getTxtLogradouro();
    public JTextField getTxtNumero();
}
