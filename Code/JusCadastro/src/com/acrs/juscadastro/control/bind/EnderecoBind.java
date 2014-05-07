/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acrs.juscadastro.control.bind;

import com.acrs.juscadastro.model.entity.Endereco;
import com.acrs.juscadastro.model.entity.UF;
import com.acrs.juscadastro.view.interfaces.IPnlEndereco;

/**
 *
 * @author acrs
 */
public class EnderecoBind {
    
    public static void preencherEndereco(IPnlEndereco i, Endereco e) {
        e.setLogradouro(i.getTxtLogradouro().getText().trim());
        e.setNumero(i.getTxtNumero().getText().trim());
        e.setComplemento(i.getTxtComplemento().getText().trim());
        
        String cep = i.getTxfCEP().getText();
        if (!cep.trim().equals("-")) {
            e.setCep(cep);
        } else {
            e.setCep(null);
        }
        
        e.setBairro(i.getTxtBairro().getText().trim());
        e.setCidade(i.getTxtCidade().getText().trim());
        
        String uf = ((String) i.getCbxUF().getSelectedItem()).trim();
        if (!uf.equals("")) {
            e.setUf(UF.valueOf((String) i.getCbxUF().getSelectedItem()));        
        }
    }
    
    public static void mostrarEndereco(Endereco e, IPnlEndereco i) {
        i.getTxtLogradouro().setText(e.getLogradouro());
        i.getTxtNumero().setText(e.getNumero());
        i.getTxtComplemento().setText(e.getComplemento());
        
        if (e.getCep() != null) {
            i.getTxfCEP().setText(e.getCep());
        } else {
            i.getTxfCEP().setText("");
        }
        
        i.getTxtBairro().setText(e.getBairro());
        i.getTxtCidade().setText(e.getCidade());
        
        if (e.getUf()!=null) {
            i.getCbxUF().setSelectedItem(e.getUf().toString());
        } else {
            i.getCbxUF().setSelectedIndex(0);
        }
    }    
}
