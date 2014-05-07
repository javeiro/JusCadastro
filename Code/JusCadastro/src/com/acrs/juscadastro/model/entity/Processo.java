package com.acrs.juscadastro.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PROCESSOS")
public class Processo implements Serializable {

    // Propriedades ------------------------------------------------------------
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "COMARCA", length = 15)
    private String comarca;

    @Column(name = "VARA", length = 15)
    private String vara;

    @Column(name = "ACAO", length = 15)
    private String acao;

    @Column(name = "NUMERO", length = 15)
    private String numero;

    @Column(name = "ORIGEM", length = 100)
    private String origem;

    @Column(name = "REGIONAL", length = 100)
    private String regional;

    @Column(name = "OFICIAL", length = 100)
    private String oficial;

    @Temporal(TemporalType.DATE)
    @Column(name = "DISTRIBUICAO")
    private Calendar distribuicao;

    @Column(name = "ESCREVENTE", length = 100)
    private String escrevente;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO", length = 5)
    private TipoDeProcesso tipo;

    @Column(name = "ANDAMENTO", length = 100000 /*, columnDefinition = "TEXT"*/)
    private String andamento;

    // Associacoes -------------------------------------------------------------
    @Embedded
    private Endereco endereco;

    @ManyToMany
    private List<Contato> clientes;

    @ManyToMany
    private List<Advogado> advogados;

    @ManyToMany
    private List<Contato> partesContrarias;

    @ManyToMany
    private List<Contato> testemunhas;

    @OneToMany
    private List<Balanco> balanco;

    @OneToMany
    private List<Compromisso> compromissos;

    // Getters-Setters ---------------------------------------------------------
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComarca() {
        return comarca;
    }

    public void setComarca(String comarca) {
        this.comarca = comarca;
    }

    public String getVara() {
        return vara;
    }

    public void setVara(String vara) {
        this.vara = vara;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getRegional() {
        return regional;
    }

    public void setRegional(String regional) {
        this.regional = regional;
    }

    public String getOficial() {
        return oficial;
    }

    public void setOficial(String oficial) {
        this.oficial = oficial;
    }

    public Calendar getDistribuicao() {
        return distribuicao;
    }

    public void setDistribuicao(Calendar distribuicao) {
        this.distribuicao = distribuicao;
    }

    public String getEscrevente() {
        return escrevente;
    }

    public void setEscrevente(String escrevente) {
        this.escrevente = escrevente;
    }

    public TipoDeProcesso getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeProcesso tipo) {
        this.tipo = tipo;
    }

    public String getAndamento() {
        return andamento;
    }

    public void setAndamento(String andamento) {
        this.andamento = andamento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Contato> getClientes() {
        return clientes;
    }

    public void setClientes(List<Contato> clientes) {
        this.clientes = clientes;
    }

    public List<Advogado> getAdvogados() {
        return advogados;
    }

    public void setAdvogados(List<Advogado> advogados) {
        this.advogados = advogados;
    }

    public List<Contato> getPartesContrarias() {
        return partesContrarias;
    }

    public void setPartesContrarias(List<Contato> partesContraria) {
        this.partesContrarias = partesContraria;
    }

    public List<Contato> getTestemunhas() {
        return testemunhas;
    }

    public void setTestemunhas(List<Contato> testemunhas) {
        this.testemunhas = testemunhas;
    }

    public List<Balanco> getBalanco() {
        return balanco;
    }

    public void setBalanco(List<Balanco> balanco) {
        this.balanco = balanco;
    }

    public List<Compromisso> getCompromissos() {
        return compromissos;
    }

    public void setCompromissos(List<Compromisso> compromissos) {
        this.compromissos = compromissos;
    }

    // Metodos -----------------------------------------------------------------    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Processo other = (Processo) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }

    public void addCliente(Contato cliente) {
        if (getClientes() == null) {
            setClientes(new ArrayList<Contato>());
        }
        cliente.addProcessoAFavor(this);
        getClientes().add(cliente);
    }

    public void addAdvogado(Advogado advogado) {
        if (getAdvogados()== null) {
            setAdvogados(new ArrayList<Advogado>());
        }
        advogado.addProcesso(this);
        getAdvogados().add(advogado);
    }

    public void addTestemunha(Contato testemunha) {
        if (getTestemunhas()== null) {
            setTestemunhas(new ArrayList<Contato>());
        }
        testemunha.addProcessoParticipante(this);
        getTestemunhas().add(testemunha);
    }

    public void addParteContraria(Contato parteContraria) {
        if (getPartesContrarias()== null) {
            setCompromissos(new ArrayList<Compromisso>());
        }
        compromisso.setProcesso(this);
        getCompromissos().add(compromisso);
    }
    public void addBalanco(Balanco balanco) {
        if (getBalanco() == null) {
            setBalanco(new ArrayList<Balanco>());
        }
        balanco.setProcesso(this);
        getBalanco().add(balanco);
    }

    public void addCompromisso(Compromisso compromisso) {
        if (getCompromissos() == null) {
            setCompromissos(new ArrayList<Compromisso>());
        }
        compromisso.setProcesso(this);
        getCompromissos().add(compromisso);
    }

}
