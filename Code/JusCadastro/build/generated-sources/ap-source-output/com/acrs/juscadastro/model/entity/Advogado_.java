package com.acrs.juscadastro.model.entity;

import com.acrs.juscadastro.model.entity.Processo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-03-20T15:24:10")
@StaticMetamodel(Advogado.class)
public class Advogado_ extends Contato_ {

    public static volatile ListAttribute<Advogado, Processo> processosTratados;
    public static volatile SingularAttribute<Advogado, String> oab;

}