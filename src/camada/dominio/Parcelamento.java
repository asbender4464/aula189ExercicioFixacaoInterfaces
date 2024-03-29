package camada.dominio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelamento {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	//Atributos.
	private Date dataDoDebito;
	private Double montante;
	
	//Construtores.
	public Parcelamento() {
	}

	public Parcelamento(Date dataDoDebito, Double montante) {
		this.dataDoDebito = dataDoDebito;
		this.montante = montante;
	}

	//GETs e SETs
	public Date getDataDoDebito() {
		return dataDoDebito;
	}

	public void setDataDoDebito(Date dataDoDebito) {
		this.dataDoDebito = dataDoDebito;
	}

	public Double getMontante() {
		return montante;
	}

	public void setMontante(Double montante) {
		this.montante = montante;
	}
	
	@Override
	public String toString() {
		return sdf.format(dataDoDebito) + " - " + String.format("%.2f", montante);
	}
}
