package com.acrs.juscadastro.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Telefone {
	
	public static boolean validar(Telefone telefone) {
		int ddd = Integer.parseInt(telefone.getDdd());
		if (!(ddd > 9 && ddd < 100)) return false;
		
		long numero = Integer.parseInt(telefone.getNumero());
		if (!(numero >= 11111111 && numero <= 999999999)) return false;
		
		return true;
	}

	@Column
	private String ddd;
	
	@Column
	private String numero;
	
	public String getDdd() {
		return ddd;
	}
	
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}	
}
