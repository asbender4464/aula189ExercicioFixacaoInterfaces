package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

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
		Double valor = sc.nextDouble();
		System.out.print("Informe o número de parcelas: ");
		Integer parcelas = sc.nextInt();
		
		//Área para instanciar Objetos e Executar Métodos.
		
		System.out.println("CALENDÁRIO DE PAGAMENTOS E VALORES");
		

	}
}
