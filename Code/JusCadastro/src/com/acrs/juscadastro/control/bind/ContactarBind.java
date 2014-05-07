/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acrs.juscadastro.control.bind;

import com.acrs.juscadastro.model.entity.Email;
import com.acrs.juscadastro.model.entity.Telefone;
import com.acrs.juscadastro.view.interfaces.IPnlContactar;

/**
 *
 * @author acrs
 */
public class ContactarBind {

    public static void preencherEmail(IPnlContactar i, Email e) {
        e.setEndereco(i.getTxtEmail().getText().trim());
    }
    
    public static void mostrarEmail(Email e, IPnlContactar i) {
        i.getTxtEmail().setText(e.getEndereco());
    }
        
    public static void preencherFixo(IPnlContactar i, Telefone t) {
        t.setDdd(i.getTxtTelFixo_DDD().getText().trim());
        t.setNumero(i.getTxtTelFixo_Numero().getText().trim());
    }
    
    public static void mostrarFixo(Telefone t, IPnlContactar i) {
        i.getTxtTelFixo_DDD().setText(t.getDdd());
        i.getTxtTelFixo_Numero().setText(t.getNumero());
    }

    public static void preencherMovel(IPnlContactar i, Telefone t) {
        t.setDdd(i.getTxtTelMovel_DDD().getText().trim());
        t.setNumero(i.getTxtTelMovel_Numero().getText().trim());
    }

    public static void mostrarMovel(Telefone t, IPnlContactar i) {
        i.getTxtTelMovel_DDD().setText(t.getDdd());
        i.getTxtTelMovel_Numero().setText(t.getNumero());
    }

    public static void preencherFax(IPnlContactar i, Telefone t) {
        t.setDdd(i.getTxtTelFax_DDD().getText().trim());
        t.setNumero(i.getTxtTelFax_Numero().getText().trim());
    }
    
    public static void mostrarFax(Telefone t, IPnlContactar i) {
        i.getTxtTelFax_DDD().setText(t.getDdd());
        i.getTxtTelFax_Numero().setText(t.getNumero());
    }
    
}
