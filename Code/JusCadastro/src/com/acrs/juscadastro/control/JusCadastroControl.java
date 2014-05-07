/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acrs.juscadastro.control;

import com.acrs.juscadastro.util.JPAUtil;

/**
 *
 * @author acrs
 */
public class JusCadastroControl {    
    public static void iniciar() {
        JPAUtil.getInstance();
    }    
}
