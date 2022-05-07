
package projeto3a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);



		List<Paciente> listaPac = new ArrayList<>();
		List<Medico> listaMed = new ArrayList<>();
		List<Consulta> listaCons = new ArrayList<>();
		ListaDeConsulta listaDeConsulta = new ListaDeConsulta();

		int opcaoMenu = 1;

		while (opcaoMenu != 0) {

			System.out.println("=======================================================");
			System.out.println("1 - Cadastrar médico.");
			System.out.println("2 - Cadastrar paciente.");
			System.out.println("3 - Mostrar lista de paciente.");
			System.out.println("4 - Mostrar lista de médico.");
			System.out.println("5 - Marcar consulta.");
			System.out.println("6 - Mostrar lista de consultas.");
			System.out.println("7 - Consultar tamanho da lista de consultas.");
			System.out.println("8 - Mostrar ista de consulta pelo nome do paciente.");
			System.out.println("9 - Mostrar lista de consulta pelo nome do médico.");
			System.out.println("10 - Mostrar uma consulta dentro da lista de consulta.");
			System.out.println("0 - Sair.");
			System.out.println("=======================================================");

			opcaoMenu = sc.nextInt();

			switch (opcaoMenu) {
			case 1:
				System.out.println("");
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
				break;
			case 2:
				System.out.println("");
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
				break;
			case 3:
				System.out.println("");
				System.out.print("Mostrar lista de pacientes?(S/N)");
				char perg2 = sc.next().charAt(0);

				if (perg2 == 'S' || perg2 == 's') {

					System.out.println("");
					System.out.println("Lista de pacientes: ");
					System.out.println("");
					System.out.println(listaPac);
				}
				break;

			case 4:
				System.out.println("");
				System.out.println("Mostrar lista de médicos?(S/N)");
				char perg1 = sc.next().charAt(0);
				if (perg1 == 'S' || perg1 == 's') {
					System.out.println("");
					System.out.println("Lista de médicos:");
					System.out.println("");
					System.out.println(listaMed);

				}
				break;
			case 5:

					System.out.println("");
					System.out.print("Quantas consultas deseja marcar?");
					int lc = sc.nextInt();
					sc.nextLine();

					System.out.println("Qual a especialidade desejada?");
					String perg4 = sc.next();

					for (int b = 0; b < listaMed.size(); b++) {
						int h = 0;
						if (perg4.equals(listaMed.get(b).getEspecialidade())) {
							System.out.println("Médicos disponíveis na lista:");
							System.out.println(listaMed.get(b).getNome());
							h++;
						} else if (h == 0) {
							System.out.println("Médico indisponível.");
							System.exit(0);
						}

					}

					for (int i = 1; i <= lc; i++) {

						Integer id = listaCons.size();
						System.out.println("Cadastre a " + i + "º consulta: ");
						System.out.print("Nome do médico: ");
						String nomeMed = sc.next();

						for (int b = 0; b < listaMed.size(); b++) {
							int h = 0;
							if (nomeMed.equals(listaMed.get(b).getNome())) {

								h++;
							} else if (h == 0) {
								System.out.println("Médico não encontrado.");
								System.out.println("Sistema encerrado!");
								System.exit(0);
							}

						}

						System.out.print("Nome do paciente: ");
						String nomePac = sc.next();

						for (int b = 0; b < listaPac.size(); b++) {
							int h = 0;
							if (nomePac.equals(listaPac.get(b).getNome())) {

								h++;
							} else if (h == 0) {
								System.out.println("Paciente não encontrado.");
								System.out.println("Sistema encerrado!");
								System.exit(0);
							}

						}

						String especCon = perg4;
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

						Consulta consulta = new Consulta(id, nomeMed, nomePac, especCon, dataDia, dataMes, dataAno,
								dataHora);

						listaCons.add(consulta);
						listaDeConsulta.adicionar(consulta);

					}
				
				break;

			case 6:

				System.out.println("");
				System.out.print("Mostrar lista de consultas?(S/N)");
				char perg5 = sc.next().charAt(0);

				if (perg5 == 'S' || perg5 == 's') {

					System.out.println("");
					System.out.println("Lista de consultas: ");
					System.out.println("");

					System.out.println(listaCons);

				}
				break;

			case 7:

				System.out.println("");
				System.out.print("Mostrar tamanho da lista de consultas?(S/N)");
				char perg6 = sc.next().charAt(0);

				if (perg6 == 'S' || perg6 == 's') {

					System.out.println("Tamanho da lista: " + listaDeConsulta.getTamanhoLista());

				}
				break;

			case 8:
				System.out.println("");
				System.out.print("Mostrar lista de consulta de algum paciente?(S/N)");
				char perg7 = sc.next().charAt(0);

				if (perg7 == 'S' || perg7 == 's') {

					System.out.print("Digite o nome do paciente: ");
					String nomePaciente = sc.next();

					for (int b = 0; b < listaCons.size(); b++) {
						int h = 0;
						if (nomePaciente.equals(listaCons.get(b).getNomePac())) {
							System.out.println("Lista de consulta do paciente: ");
							System.out.println(listaDeConsulta.Ordenar(b).getConsultaMarcada());
							h++;
						} else if (h == 0) {
							System.out.println("Paciente não encontrado.");
							System.out.println("Sistema encerrado!");
							System.exit(0);
						}

					}

				}
				break;

			case 9:
				System.out.println("");
				System.out.print("Mostrar lista de consulta de algum médico?(S/N)");
				char perg8 = sc.next().charAt(0);

				if (perg8 == 'S' || perg8 == 's') {

					System.out.print("Digite o nome do médico: ");
					String nomeMedico = sc.next();

					for (int b = 0; b < listaCons.size(); b++) {
						int h = 0;
						if (nomeMedico.equals(listaCons.get(b).getNomeMed())) {
							System.out.println("Lista de consulta do médico: ");
							System.out.println(listaDeConsulta.Ordenar(b).getConsultaMarcada());
							h++;
						} else if (h == 0) {
							System.out.println("Médico não encontrado.");
							System.out.println("Sistema encerrado!");
							System.exit(0);
						}

					}

				}
				break;

			case 10:
				System.out.println("");
				

				try {
					
					System.out.println("Digite um número para consultar na lista: ");
					int num = sc.nextInt();
					for (int i = 1; i <= listaCons.size(); i++) {
						if (num == i) {
							System.out.println("Id da consulta: " + listaCons.get(i).getIdConsulta());
							System.out.println("Nome do médico: "+ listaCons.get(i).getNomeMed());
							System.out.println("Nome do paciente: "+listaCons.get(i).getNomePac());
							System.out.println("Especialidade do médico: "+listaCons.get(i).getEspecialidadeCon());
							System.out.println("Dia da consulta: " + listaCons.get(i).getDataDia());
							System.out.println("Mês da consulta: " +listaCons.get(i).getDataMes());
							System.out.println("Ano da consulta: "+listaCons.get(i).getDataAno());
							System.out.println("Hora da consulta: "+listaCons.get(i).getDataHora());
						}else if(num>listaCons.size()) {
							throw new ExcecaoDeIndiceInexistente();
						}
						
					}
					

				} catch (ExcecaoDeIndiceInexistente e) {
					
					

					System.out.println("Índice inexistente!");

				}

				break;
				
			case 0:
				
				System.out.println("Programa finalizado!!");
				System.exit(0);
			}

		}

		sc.close();

	}

}
