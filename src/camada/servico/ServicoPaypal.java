package camada.servico;

public class ServicoPaypal implements ServicoPagamentoOnline {

	private static final double FEE = 0.02;
	private static final double INTEREST = 0.01;
	
	@Override
	public Double taxaDePagamento(Double montante) {
		return montante * FEE;
	}

	@Override
	public Double juros(Double montante, Integer meses) {
		return montante * meses * INTEREST;
	}
}
