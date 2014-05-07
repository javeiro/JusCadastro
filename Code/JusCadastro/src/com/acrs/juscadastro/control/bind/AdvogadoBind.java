/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acrs.juscadastro.control.bind;

import com.acrs.juscadastro.model.entity.Advogado;
import com.acrs.juscadastro.view.interfaces.IPnlAdvogado;

/**
 *
 * @author acrs
 */
public class AdvogadoBind {
    public static void preencherAdvogado(IPnlAdvogado i, Advogado adv) {
        adv.setOab(i.getTxtOAB().getText().trim());
    }
    
    public static void mostrarAdvogado(Advogado adv, IPnlAdvogado i) {
        i.getTxtOAB().setText(adv.getOab());
        i.getChkAdvogado().setSelected(true);
        i.getChkAdvogado().setEnabled(false);
        i.getTxtOAB().setText(adv.getOab());
    }
}
