package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import camada.dominio.Contrato;
import camada.dominio.Parcelamento;
import camada.servico.ServicoContrato;
import camada.servico.ServicoPaypal;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		
		System.out.println("Informe os dados do contrato:");
		System.out.print("Número: ");
		Integer numero = sc.nextInt();
		System.out.print("Data: ");
		sc.nextLine();
		Date data = sdf.parse(sc.nextLine());
		System.out.print("Valor do contrato: ");
		Double valorTotal = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, valorTotal);
		
		System.out.print("Informe o número de parcelas: ");
		Integer n = sc.nextInt();
		
		ServicoContrato servicoContrato = new ServicoContrato(new ServicoPaypal());
		
		servicoContrato.processoContrato(contrato, n);
		
		System.out.println("CALENDÁRIO DE PAGAMENTOS E VALORES");
		for (Parcelamento x: contrato.getParcelas()) {
			System.out.println(x);
		}
		sc.close();
	}
}
