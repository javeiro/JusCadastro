package com.acrs.juscadastro.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CONTATOS")
@DiscriminatorValue(value = "ADVOGADO")
public class Advogado extends Contato implements Serializable {

    // Propriedades ------------------------------------------------------------
    private static final long serialVersionUID = 1L;

    @Column(name = "OAB", length = 20)
    private String oab;

    // Associacoes -------------------------------------------------------------
    @ManyToMany(mappedBy = "advogados", cascade = CascadeType.ALL)
    private List<Processo> processos;

    // Getters-Setters ---------------------------------------------------------
    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    public List<Processo> getProcessos() {
        return processos;
    }

    public void setProcessos(List<Processo> processos) {
        this.processos = processos;
    }

    void addProcesso(Processo aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void addProcesso(Processo aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
