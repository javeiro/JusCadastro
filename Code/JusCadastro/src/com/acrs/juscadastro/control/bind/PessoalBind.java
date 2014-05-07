/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acrs.juscadastro.control.bind;

import com.acrs.juscadastro.model.entity.Contato;
import com.acrs.juscadastro.view.interfaces.IPnlPessoal;

/**
 *
 * @author acrs
 */
public class PessoalBind {

    public static void preencherPessoal(IPnlPessoal i, Contato aT) {
        aT.setId(i.getIdAgendaTelefonica());
        aT.setCpfj(i.getTxtCPFJ().getText().trim());
        aT.setNome(i.getTxtNome().getText().trim());
        aT.setNascimento(i.getDtcNascimento().getCalendar());
        aT.setEmpresa(i.getTxtEmpresa().getText().trim());
        aT.setCargo(i.getTxtCargo().getText().trim());
    }

    public static void mostrarPessoal(Contato at, IPnlPessoal i) {
        i.setIdAgendaTelefonica(at.getId());
        i.getTxtCPFJ().setText(at.getCpfj());
        i.getTxtNome().setText(at.getNome());
        i.getDtcNascimento().setCalendar(at.getNascimento());
        i.getTxtEmpresa().setText(at.getEmpresa());
        i.getTxtCargo().setText(at.getCargo());
    }
}
