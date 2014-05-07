package com.acrs.juscadastro.model.entity;

public enum TipoDeProcesso {
    REU("REU"),
    AUTOR("AUTOR");

    private final String descricao;
	
    private TipoDeProcesso (String d) {
            descricao = d;
    }
	
    public boolean equalsName(String outraDescricao){
        return (outraDescricao == null)? false:descricao.equals(outraDescricao);
    }

    @Override
    public String toString(){
       return descricao;
    }
}
