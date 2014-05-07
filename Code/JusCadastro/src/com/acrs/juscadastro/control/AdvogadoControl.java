/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acrs.juscadastro.control;

import com.acrs.juscadastro.control.bind.AdvogadoBind;
import com.acrs.juscadastro.model.dao.AdvogadoDAO;
import com.acrs.juscadastro.model.entity.Advogado;
import com.acrs.juscadastro.model.entity.Contato;
import com.acrs.juscadastro.view.DlgContatoEditar;
import com.acrs.juscadastro.view.interfaces.IPnlAdvogado;
import com.acrs.juscadastro.view.interfaces.IPnlContactar;
import com.acrs.juscadastro.view.interfaces.IPnlEndereco;
import com.acrs.juscadastro.view.interfaces.IPnlNota;
import com.acrs.juscadastro.view.interfaces.IPnlPessoal;

/**
 *
 * @author acrs
 */
public class AdvogadoControl {

    public static void gravarRegistro(DlgContatoEditar dlg) {
        AdvogadoDAO dao = new AdvogadoDAO();
        Advogado adv = materializar(dlg.getPnlPessoal(), 
                dlg.getPnlNota(), dlg.getPnlEndereco(), dlg.getPnlContato(), dlg.getPnlAdvogado());
        if (adv.getId() == null)
            dao.salvar(adv);
        else
            dao.atualizar(adv);
    }
    
    public static Advogado materializar(IPnlPessoal iPessoal, IPnlNota iNota, 
            IPnlEndereco iEndereco, IPnlContactar iContato, IPnlAdvogado iAdvogado) {
        Advogado adv = new Advogado();
        ContatoControl.preencherObjeto(iPessoal, iNota, iEndereco, iContato,(Contato) adv);
        preencherAdvogado(iAdvogado, adv);
        return adv;
    }

    private static void preencherAdvogado(IPnlAdvogado iAdvogado, Advogado adv) {
        AdvogadoBind.preencherAdvogado(iAdvogado, adv);
    }
}
