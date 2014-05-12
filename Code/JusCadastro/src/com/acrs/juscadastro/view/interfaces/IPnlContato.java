/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acrs.juscadastro.view.interfaces;

import com.acrs.juscadastro.view.panel.PnlAdvogado;
import com.acrs.juscadastro.view.panel.PnlContactar;
import com.acrs.juscadastro.view.panel.PnlEndereco;
import com.acrs.juscadastro.view.panel.PnlTexto;
import com.acrs.juscadastro.view.panel.PnlPessoal;

/**
 *
 * @author acrs
 */
public interface IPnlContato {
    public PnlPessoal getPnlPessoal();
    public PnlEndereco getPnlEndereco();
    public PnlContactar getPnlContactar();
    public PnlAdvogado getPnlAdvogado();
    public PnlTexto getPnlNota();

    public void limpar();    
}