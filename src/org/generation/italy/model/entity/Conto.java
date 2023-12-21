package org.generation.italy.model.entity;

import java.time.LocalDate;

public class Conto {
	private String valuta, codice_fiscale, iban; 
	private float scoperto; 
	private LocalDate data_ora_intestazione;
	
	public Conto(String valuta, String codice_fiscale, String iban, float scoperto, LocalDate data_ora_intestazione) {
		super();
		this.valuta = valuta;
		this.codice_fiscale = codice_fiscale;
		this.iban = iban;
		this.scoperto = scoperto;
		this.data_ora_intestazione = data_ora_intestazione;
	}

	public String getValuta() {
		return valuta;
	}

	public String getCodice_fiscale() {
		return codice_fiscale;
	}

	public String getIban() {
		return iban;
	}

	public float getScoperto() {
		return scoperto;
	}

	public LocalDate getData_ora_intestazione() {
		return data_ora_intestazione;
	}
}
