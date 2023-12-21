package org.generation.italy.model.entity;

import java.time.LocalDate;

public class Movimento {
	private int idMovimento;
	private LocalDate dataOraOperazione;
	private float importo;
	private String tipoOperazione, iban;
	
	public Movimento(int idMovimento, LocalDate data_ora_operazione, float importo, String tipoOperazione, String iban) {
		super();
		this.idMovimento = idMovimento;
		this.dataOraOperazione = data_ora_operazione;
		this.importo = importo;
		this.tipoOperazione = tipoOperazione;
		this.iban = iban;
	}

	public int getIdMovimento() {
		return idMovimento;
	}

	public LocalDate getData_ora_operazione() {
		return dataOraOperazione;
	}

	public float getImporto() {
		return importo;
	}

	public String getTipo_operazione() {
		return tipoOperazione;
	}

	public String getIban() {
		return iban;
	}
	
	@Override
	public String toString() {
		return "Movimento: {idMovimento= "+idMovimento+", dataOraOperazione= "+dataOraOperazione+", importo= "+importo+", tipoOperazione= "+tipoOperazione+", iban= "+iban+"}";
	}
}
