package camada.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	//Atributos
	private Integer numero;
	private Date data;
	private Double valorTotal;
	
	private List<Parcelamento> parcelas = new ArrayList<>();
	
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
	
	public List<Parcelamento> getParcelas(){
		return parcelas;
	}
	
	public void addParcelamento(Parcelamento parcelamento) {
		parcelas.add(parcelamento);
	}
	
	public void removeParcelamento(Parcelamento parcelamento) {
		parcelas.remove(parcelamento);
	}
}
