package camada.dominio;

import java.util.Date;

public class Contrato {

	//Atributos
	private Integer numero;
	private Date data;
	private Double valorTotal;
	
	//Construtores
	public Contrato() {
	}
	
	public Contrato(Integer numero, Date data, Double valorTotal) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	//GETs e SETs
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}