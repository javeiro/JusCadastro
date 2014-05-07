/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acrs.juscadastro.control.bind;

import com.acrs.juscadastro.model.entity.Contato;
import com.acrs.juscadastro.view.interfaces.IPnlNota;

/**
 *
 * @author acrs
 */
public class NotaBind {
    public static void preencherNota(IPnlNota i, Contato aT) {
        aT.setNota(i.getTxaTexto().getText().trim());
    }
    
    public static void mostrarNota(Contato aT, IPnlNota i) {
        i.getTxaTexto().setText(aT.getNotas());
    }
}
