/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acrs.juscadastro.view.interfaces;

import com.acrs.juscadastro.view.PnlAdvogado;
import com.acrs.juscadastro.view.PnlContactar;
import com.acrs.juscadastro.view.PnlEndereco;
import com.acrs.juscadastro.view.PnlTexto;
import com.acrs.juscadastro.view.PnlPessoal;

/**
 *
 * @author acrs
 */
public interface IPnlContato {
    public PnlAdvogado getPnlAdvogado();
    public PnlContactar getPnlContato();
    public PnlEndereco getPnlEndereco();
    public PnlTexto getPnlNota();
    public PnlPessoal getPnlPessoal();

    public void limpar();
    
}