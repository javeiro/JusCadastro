/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acrs.juscadastro.control;

import com.acrs.juscadastro.control.bind.ContactarBind;
import com.acrs.juscadastro.model.entity.Telefone;
import com.acrs.juscadastro.view.interfaces.IPnlContactar;

/**
 *
 * @author acrs
 */
public class TelefoneControl {
    static Telefone materializarFixo(IPnlContactar iContato) {
        Telefone fixo = new Telefone();
        ContactarBind.preencherFixo(iContato, fixo);
        return fixo;
    }
    
    static Telefone materializarMovel(IPnlContactar iContato) {
        Telefone movel = new Telefone();
        ContactarBind.preencherMovel(iContato, movel);
        return movel;
    }

    static Telefone materializarFax(IPnlContactar iContato) {
        Telefone fax = new Telefone();
        ContactarBind.preencherFax(iContato, fax);
        return fax;
    }
}
