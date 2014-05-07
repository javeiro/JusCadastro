package com.acrs.juscadastro.model.entity;

import com.acrs.juscadastro.model.entity.Email;
import com.acrs.juscadastro.model.entity.Endereco;
import com.acrs.juscadastro.model.entity.Processo;
import com.acrs.juscadastro.model.entity.Telefone;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-03-20T15:24:10")
@StaticMetamodel(Contato.class)
public class Contato_ { 

    public static volatile SingularAttribute<Contato, Telefone> telFixo;
    public static volatile ListAttribute<Contato, Processo> processosTestemunhados;
    public static volatile ListAttribute<Contato, Processo> processosAFavor;
    public static volatile SingularAttribute<Contato, String> cargo;
    public static volatile SingularAttribute<Contato, String> cpfj;
    public static volatile SingularAttribute<Contato, Integer> id;
    public static volatile SingularAttribute<Contato, String> notas;
    public static volatile SingularAttribute<Contato, Email> email;
    public static volatile SingularAttribute<Contato, Telefone> telFax;
    public static volatile SingularAttribute<Contato, Telefone> telMovel;
    public static volatile SingularAttribute<Contato, String> empresa;
    public static volatile SingularAttribute<Contato, Calendar> dataNascimento;
    public static volatile SingularAttribute<Contato, String> nome;
    public static volatile ListAttribute<Contato, Processo> processosContra;
    public static volatile SingularAttribute<Contato, Endereco> endereco;

}