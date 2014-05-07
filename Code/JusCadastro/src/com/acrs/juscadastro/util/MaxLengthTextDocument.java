/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acrs.juscadastro.util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author allan
 */
public class MaxLengthTextDocument extends PlainDocument {
    //Armazena o número máximo de caracteres para o texto.
    private int maxChars;

    public MaxLengthTextDocument(int maxChars) {
        super();
        this.maxChars = maxChars+1;
    }
 
    @Override
    public void insertString(int offs, String str, AttributeSet a)
            throws BadLocationException {
        if(str != null && (getLength() + str.length() < maxChars)){
                    super.insertString(offs, str, a);
            }
    }

    public int getMaxChars() {
        return maxChars;
    }

    public void setMaxChars(int maxChars) {
        this.maxChars = maxChars;
    }     
}