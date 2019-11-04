package camada.servico;

public interface ServicoPagamentoOnline {

	//Operações a serem implementadas por quem usar a 'interface'.
	Double taxaDePagamento(Double montante);
	Double juros(Double montante, Integer meses);
}
