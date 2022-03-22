package projeto3a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		List<Paciente> listaPac = new ArrayList<>();
		List<Medico> listaMed = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos médicos você quer cadastrar na clínica?");
		int lm = sc.nextInt();

		for (int i = 1; i <= lm; i++) {
			System.out.println("Cadastre o " + i + "º médico: ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("CPF: ");
			String cpf = sc.next();
			System.out.print("Especialidade: ");
			String espec = sc.next();

			Medico medico = new Medico(nome, cpf, espec);

			listaMed.add(medico);

		}

		System.out.println("Mostrar lista de médicos?(S/N)");
		char perg1 = sc.next().charAt(0);
		if (perg1 == 'S' || perg1 == 's') {
			System.out.println("");
			System.out.println("Lista de médicos:");
			System.out.println("");
			System.out.println(listaMed);

		}

		System.out.println("Quantos pacientes você quer cadastrar na clínica?");
		int lp = sc.nextInt();

		for (int i = 1; i <= lp; i++) {
			System.out.println("Cadastre o " + i + "º paciente: ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("CPF: ");
			String cpf = sc.next();
			System.out.print("Endereço: ");
			String end = sc.next();

			Paciente paciente = new Paciente(nome, cpf, end);

			listaPac.add(paciente);

		}

		System.out.println("");
		System.out.print("Mostrar lista de pacientes?(S/N)");
		char perg2 = sc.next().charAt(0);

		if (perg2 == 'S' || perg2 == 's') {

			System.out.println("");
			System.out.println("Lista de pacientes: ");
			System.out.println("");
			System.out.println(listaPac);
		}

		System.out.print("Deseja marcar alguma consulta?(S/N)");
		char perg3 = sc.next().charAt(0);

		if (perg3 == 'S' || perg3 == 's') {

			System.out.println("Qual a especialidade desejada?");
			String perg4 = sc.next();
			Medico med;
			System.out.println(listaMed);

			for (int b = 0; b < listaMed.size(); b++) {
				med = listaMed.get(b);
				if (perg4 == med.especialidade) {
					System.out.println("Médico disponível na lista:");
					System.out.println(med);
				}
			}

		}

		ListaDeConsulta listaDeConsulta = new ListaDeConsulta();
		listaDeConsulta.listraDeConculta();

		sc.close();

	}
}
