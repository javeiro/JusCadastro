/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acrs.juscadastro.control;

import com.acrs.juscadastro.view.interfaces.ITxtPaginador;
import java.util.List;

/**
 *
 * @author acrs
 */
public abstract class NavegacaoControl {
    protected static final int FILTRADO_POR_TODOS = 1;
    protected static List<Integer> ids = null;
    protected static Integer index = -1;
    protected static int filtroAtual = FILTRADO_POR_TODOS;
    protected static Object valorAtual = null;

    protected static void aplicarFiltro(List<Integer> idsDAO, int filtro, Object valor) {
        ids = idsDAO;
        filtroAtual = filtro;
        valorAtual = valor;
    }

    public static void atualizarPaginador(ITxtPaginador i) {
        if (ids != null) {
            i.getTxtRegistroCorrente().setText((index + 1) + " de " + ids.size() + " registro(s)");
        } else {
            i.getTxtRegistroCorrente().setText("0 de 0 registro(s)");
        }
        i.getTxtRegistroCorrente().setForeground((filtroAtual == FILTRADO_POR_TODOS)?new java.awt.Color(0, 0, 255):new java.awt.Color(255, 0, 0)) ;
    }

}