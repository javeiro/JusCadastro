package com.acrs.juscadastro.model.entity;

public enum UF {
    AC("AC"),
    AL("AL"),
    AP("AP"),
    AM("AM"),
    BA("BA"),
    CE("CE"),
    DF("DF"),
    ES("ES"),
    GO("GO"),
    MA("MA"),
    MT("MT"),
    MS("MS"),
    MG("MG"),
    PR("PR"),
    PB("PB"),
    PA("PA"),
    PE("PE"),
    PI("PI"),
    RJ("RJ"),
    RN("RN"),
    RS("RS"),
    RO("RO"),
    RR("RR"),
    SC("SC"),
    SE("SE"),
    SP("SP"),
    TO("TO");

    private final String sigla;

    private UF (String s) {
            sigla = s;
    }
	
    public boolean equalsName(String outraSigla){
        return (outraSigla == null)? false:sigla.equals(outraSigla);
    }

    @Override
    public String toString(){
       return sigla;
    }
}
