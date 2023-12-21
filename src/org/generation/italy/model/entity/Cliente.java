package org.generation.italy.model.entity;

public class Cliente {
	private String codiceFiscale, nominativo, indirizzo;

	public Cliente(String codiceFiscale, String nominativo, String indirizzo) {
		super();
		this.codiceFiscale = codiceFiscale;
		this.nominativo = nominativo;
		this.indirizzo = indirizzo;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public String getNominativo() {
		return nominativo;
	}

	public String getIndirizzo() {
		return indirizzo;
	}
}
