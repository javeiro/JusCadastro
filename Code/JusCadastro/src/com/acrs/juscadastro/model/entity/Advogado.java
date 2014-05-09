package com.acrs.juscadastro.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CONTATOS")
@DiscriminatorValue(value = "ADVOGADO")
public class Advogado extends Contato implements Serializable {

    // Propriedades ------------------------------------------------------------
    private static final long serialVersionUID = 1L;

    @Column(name = "OAB", length = 20)
    private String oab;

    // Getters-Setters ---------------------------------------------------------
    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

}
