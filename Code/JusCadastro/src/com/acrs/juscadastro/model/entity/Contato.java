package com.acrs.juscadastro.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.AttributeOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author acrs
 */
@Entity
@Table(name = "CONTATOS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TIPO_CONTATO", length = 10, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "CONTATO")
@NamedQueries({
    @NamedQuery(name = "Contato.get", query = "SELECT c FROM Contato c WHERE c.id = :id"),
    @NamedQuery(name = "Contato.getByNome", query = "SELECT c FROM Contato c WHERE UPPER(TRIM(c.nome)) = UPPER(TRIM(:nome))"),
    @NamedQuery(name = "Contato.getByCpfj", query = "SELECT c FROM Contato c WHERE UPPER(TRIM(c.cpfj)) = UPPER(TRIM(:cpfj))"),
    @NamedQuery(name = "Contato.getIds", query = "SELECT c.id FROM Contato c"),
    @NamedQuery(name = "Contato.getIdsByName", query = "SELECT c.id FROM Contato c WHERE c.nome LIKE :nome"),
    @NamedQuery(name = "Contato.getIdsByCompany", query = "SELECT c.id FROM Contato c WHERE c.empresa LIKE :empresa"),
    @NamedQuery(name = "Contato.getIdsByAge", query = "SELECT c.id FROM Contato c WHERE c.nascimento = :nascimento"),
    @NamedQuery(name = "Contato.getIdsByNotes", query = "SELECT c.id FROM Contato c WHERE c.notas LIKE :notas")})
public class Contato implements Serializable {

    // Propriedades ------------------------------------------------------------
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "CPF_CNPJ", length = 14, nullable = false, unique = true)
    private String cpfj;

    @Column(name = "NOME", length = 100, nullable = false, unique = true)
    private String nome;

    @Temporal(TemporalType.DATE)
    @Column(name = "NASCIMENTO")
    private Calendar nascimento;

    @Column(name = "EMPRESA", length = 100)
    private String empresa;

    @Column(name = "CARGO", length = 50)
    private String cargo;

    @Column(name = "NOTAS", length = 100000 /*, columnDefinition = "TEXT"*/)
    private String notas;

    // Associacoes -------------------------------------------------------------
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "ddd", column = @Column(name = "DDD_FIXO", length = 2)),
        @AttributeOverride(name = "numero", column = @Column(name = "TEL_FIXO", length = 8))
    })
    private Telefone telFixo;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "ddd", column = @Column(name = "DDD_MOVEL", length = 2)),
        @AttributeOverride(name = "numero", column = @Column(name = "TEL_MOVEL", length = 9))
    })
    private Telefone telMovel;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "ddd", column = @Column(name = "DDD_FAX", length = 2)),
        @AttributeOverride(name = "numero", column = @Column(name = "TEL_FAX", length = 8))
    })
    private Telefone telFax = new Telefone();

    @Embedded
    private Endereco endereco;

    @Embedded
    private Email email;

    @ManyToMany(mappedBy = "clientes", cascade = CascadeType.ALL)
    private List<Processo> processosAbertos;

    // Getters-Setters ---------------------------------------------------------    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpfj() {
        return cpfj;
    }

    public void setCpfj(String cpfj) {
        this.cpfj = cpfj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getNascimento() {
        return nascimento;
    }

    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNotas() {
        return notas;
    }

    public void setNota(String notas) {
        this.notas = notas;
    }

    public Telefone getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(Telefone telFixo) {
        this.telFixo = telFixo;
    }

    public Telefone getTelMovel() {
        return telMovel;
    }

    public void setTelMovel(Telefone telMovel) {
        this.telMovel = telMovel;
    }

    public Telefone getTelFax() {
        return telFax;
    }

    public void setTelFax(Telefone telFax) {
        this.telFax = telFax;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public List<Processo> getProcessosAbertos() {
        return processosAbertos;
    }

    public void setProcessosAbertos(List<Processo> processosAbertos) {
        this.processosAbertos = processosAbertos;
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
        Contato other = (Contato) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }

    void addProcesso(Processo processo) {
        if (getProcessosAbertos() == null) {
            setProcessosAbertos(new ArrayList<Processo>());
        }
        getProcessosAbertos().add(processo);
    }

}