package projeto3a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		List<Paciente> listaPac = new ArrayList<>();
		List<Medico> listaMed = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos médicos a clínica tem?");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Cadastre o "+ i + "º médico: ");
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
		char x = sc.next().charAt(0);
		if (x=='S' || x== 's') {
			
			System.out.println("Lista de médicos:");
			System.out.println("");
			System.out.println(listaMed);
			
		}
		
		System.out.println("Quantos pacientes a clínica tem?");
		int p = sc.nextInt();
		
		for (int i=1; i<=p; i++) {
			System.out.println("Cadastre o "+ i + "° paciente: ");
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
		
		
		System.out.println("Mostrar lista de pacientes?(S/N)");
		char y = sc.next().charAt(0);
	
		if (y=='S' || y== 's') {
			
			System.out.println("");
			System.out.println("Lista de pacientes: ");
			System.out.println("");
			System.out.println(listaPac);
			}
			
		
		

		sc.close();
		
	}
}
