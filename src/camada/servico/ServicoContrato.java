package camada.servico;

import java.util.Calendar;
import java.util.Date;

import camada.dominio.Contrato;
import camada.dominio.Parcelamento;

public class ServicoContrato {

	private ServicoPagamentoOnline servicoPagamentoOnline;
	
	public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}

	public void processoContrato(Contrato contrato, Integer meses) {
		Double valorBase = contrato.getValorTotal() / meses;
		for (int i=1; i <= meses; i++) {
			Date data = addMeses(contrato.getData(),i);
			Double valorBaseAtualizado = valorBase + servicoPagamentoOnline.juros(valorBase, i);
			Double valorCheio = valorBaseAtualizado + servicoPagamentoOnline.taxaDePagamento(valorBaseAtualizado);
			contrato.addParcelamento(new Parcelamento(data, valorCheio));
		}
	}
	
	private Date addMeses(Date data, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
