package projeto3a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeConsulta {

	public void listraDeConculta() {

		Scanner sc = new Scanner(System.in);

		List<Consulta> listaCons = new ArrayList<>();

		System.out.println("");
		System.out.print("Quantas consultas deseja marcar?");
		int lc = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= lc; i++) {

			Integer id = i;
			System.out.println("Cadastre a " + i + "º consulta: ");
			System.out.print("Nome do médico: ");
			sc.nextLine();
			String nomeMed = sc.nextLine();
			System.out.print("Nome do paciente: ");
			String nomePac = sc.next();
			System.out.print("Dia para a consulta: ");
			Integer dataDia = sc.nextInt();
			sc.nextLine();
			System.out.print("Mês para a consulta: ");
			Integer dataMes = sc.nextInt();
			sc.nextLine();
			System.out.print("Ano para a consulta: ");
			Integer dataAno = sc.nextInt();
			sc.nextLine();
			System.out.print("Hora para a consulta(24H): ");
			Integer dataHora = sc.nextInt();
			sc.nextLine();

			Consulta consulta = new Consulta(id, nomeMed, nomePac, dataDia, dataMes, dataAno, dataHora);

			listaCons.add(consulta);
		}

		System.out.println("");
		System.out.print("Mostrar lista de consultas?(S/N)");
		char perg4 = sc.next().charAt(0);

		if (perg4 == 'S' || perg4 == 's') {

			System.out.println("");
			System.out.println("Lista de consultas: ");
			System.out.println("");
			System.out.println(listaCons);
		}

		sc.close();

	}

}
