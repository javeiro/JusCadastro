package com.acrs.juscadastro.model.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Email {

    // Propriedades ------------------------------------------------------------
    @Column(name = "EMAIL", length = 200)
    private String endereco;

    // Getters-Setters ---------------------------------------------------------    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Metodos -----------------------------------------------------------------
    public static boolean validar(String endereco) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(endereco);
        return matcher.matches();
    }
}
