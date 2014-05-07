package com.acrs.juscadastro.model.entity;

import com.acrs.juscadastro.model.entity.Advogado;
import com.acrs.juscadastro.model.entity.Balanco;
import com.acrs.juscadastro.model.entity.Compromisso;
import com.acrs.juscadastro.model.entity.Contato;
import com.acrs.juscadastro.model.entity.TipoDeProcesso;
import com.acrs.juscadastro.model.entity.UF;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-03-20T15:24:10")
@StaticMetamodel(Processo.class)
public class Processo_ { 

    public static volatile SingularAttribute<Processo, String> vara;
    public static volatile SingularAttribute<Processo, UF> uf;
    public static volatile SingularAttribute<Processo, String> oficial;
    public static volatile ListAttribute<Processo, Balanco> balanco;
    public static volatile ListAttribute<Processo, Contato> testemunhas;
    public static volatile SingularAttribute<Processo, String> andamento;
    public static volatile SingularAttribute<Processo, Calendar> dataDistribuicao;
    public static volatile ListAttribute<Processo, Compromisso> compromissos;
    public static volatile SingularAttribute<Processo, String> numero;
    public static volatile SingularAttribute<Processo, Integer> id;
    public static volatile ListAttribute<Processo, Contato> clientes;
    public static volatile SingularAttribute<Processo, String> acao;
    public static volatile ListAttribute<Processo, Contato> partesContraria;
    public static volatile SingularAttribute<Processo, String> regional;
    public static volatile SingularAttribute<Processo, TipoDeProcesso> tipo;
    public static volatile SingularAttribute<Processo, String> origem;
    public static volatile SingularAttribute<Processo, String> comarca;
    public static volatile ListAttribute<Processo, Advogado> advogados;
    public static volatile SingularAttribute<Processo, String> escrevente;

}