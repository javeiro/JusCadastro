/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acrs.juscadastro.control;

import com.acrs.juscadastro.control.bind.EnderecoBind;
import com.acrs.juscadastro.model.entity.Endereco;
import com.acrs.juscadastro.view.interfaces.IPnlEndereco;

/**
 *
 * @author acrs
 */
public class EnderecoControl {
    static Endereco materializar(IPnlEndereco i) {
        Endereco e = new Endereco();
        EnderecoBind.preencherEndereco(i, e);
        return e;
    }
}
