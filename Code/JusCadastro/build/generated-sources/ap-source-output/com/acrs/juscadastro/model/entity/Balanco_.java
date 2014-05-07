package com.acrs.juscadastro.model.entity;

import com.acrs.juscadastro.model.entity.Processo;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-03-20T15:24:10")
@StaticMetamodel(Balanco.class)
public class Balanco_ { 

    public static volatile SingularAttribute<Balanco, Integer> id;
    public static volatile SingularAttribute<Balanco, Calendar> dataHoraMovimento;
    public static volatile SingularAttribute<Balanco, Processo> processo;
    public static volatile SingularAttribute<Balanco, Double> credito;
    public static volatile SingularAttribute<Balanco, String> historico;
    public static volatile SingularAttribute<Balanco, Double> debito;

}