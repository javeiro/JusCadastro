/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acrs.juscadastro.control;

import com.acrs.juscadastro.control.bind.ContactarBind;
import com.acrs.juscadastro.model.entity.Email;
import com.acrs.juscadastro.view.interfaces.IPnlContactar;

/**
 *
 * @author acrs
 */
public class EmailControl {
    static Email materializar(IPnlContactar i) {
        Email e = new Email();
        ContactarBind.preencherEmail(i, e);
        return e;
    }
}
