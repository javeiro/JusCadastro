/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acrs.juscadastro.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author acrs
 */
public class ValidaDataString {
    public static boolean validar(String formato, String sData) {
        return converter(formato, sData) != null;
    }
    
    public static Date converter(String formato, String sData) {
        if (sData == null) return null;
        
        Date dData = null;
        SimpleDateFormat format = new SimpleDateFormat(formato);
        try {
            format.setLenient(false);
            dData = format.parse(sData);
        } catch (ParseException e) {
            return null;
        }
        return dData;
    }
    
}
