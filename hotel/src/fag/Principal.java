package fag;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fag.objetos.Quarto;
import fag.objetos.Reserva;

public class Principal {
	public static Scanner scan = new Scanner(System.in);
	public static List<Quarto> cadastroQuarto = new ArrayList<>();
	public static List<Reserva> cadastroReserva = new ArrayList<>();
	public static void main(String[] args) {
		menu();
	}
	public static void menu() {
		boolean menu = true;
		while(menu) {
			System.out.println("O que deseja fazer?");
			System.out.println("[1] Cadastrar Quarto");
			System.out.println("[2] Cadastrar Reserva");
			System.out.println("[3] Exibir Reservas");
			System.out.println("[4] Realizar Check-in");
			System.out.println("[5] Realizar Check-out");
			System.out.println("[6] Relatório de Ocupação");
			System.out.println("[7] Histórico de Reservas por Hóspede");
			System.out.println("[0] Sair");
			int escolha = scan.nextInt();
			scan.nextLine();
			switch (escolha) {
			case 1: {
				cadastrarQuarto();
				break;
			}
			case 2:{
				cadastrarReserva();
				break;
			}
			case 3: {
				exibirReserva();
				break;
			}
			case 4: {
			    realizarCheckin();
			    break;
			}
			case 5: {
			    realizarCheckout();
			    break;
			}
			case 6: {
			    relatorioOcupacao();
			    break;
			}
			case 7: {
			    historicoReservasPorHospede();
			    break;
			}
			case 0: {
				System.out.println("Saindo do sistema...");
				menu = false;
				break;
			}
			default:
				System.out.println("Escolha um número válido");
			}
		}
	}
	public static void cadastrarQuarto() {
		System.out.println("Cadastrar quarto\n");
		System.out.println("Digite o numero do quarto");
		int numeroQuarto = scan.nextInt();
		System.out.println("Insira o tipo de quarto:"
				+ "[1]Solteiro\n"
				+ "[2]Casal\n"
				+ "[3]Suíte");
		int tipoQuarto = scan.nextInt();
		System.out.println("Insira o preco diario:");
		double precoDiario = scan.nextDouble();
		System.out.println("O quarto está disponível?\n"
				+ "[1]Sim\n"
				+ "[0]Não");
		int quartoDisponivel = scan.nextInt();
		boolean disponibilidade =  quartoDisponivel == 1;
		cadastroQuarto.add(new Quarto(numeroQuarto, tipoQuarto, precoDiario, disponibilidade));
		System.out.println("Quarto cadastrado com sucesso!");
	}
	public static void cadastrarReserva() {
		System.out.println("Insira seu nome:");
		String nomeHospede = scan.nextLine(); 
		System.out.println("Insira a quantidade de dias que irá ficar hospedado");
		int quantidadeDias = scan.nextInt();
		System.out.println("Insira a data do check-in");
		String dataCheckin = scan.next();
		System.out.println("Insira a data do check-out");
		String dataCheckout = scan.next();
		System.out.println("Insira o tipo de quarto que deseja:");
		int tipoDeQuarto = scan.nextInt();
		for (Quarto quarto : cadastroQuarto) {
	        if (quarto.getTipoQuarto() == tipoDeQuarto && quarto.isDisponivel()) {
	            quarto.setDisponivel(false); 
	            cadastroReserva.add(new Reserva(nomeHospede, quantidadeDias, dataCheckin, dataCheckout, tipoDeQuarto));
	            System.out.println("Reserva feita com sucesso!");
	            return;
	        }
	    }
		System.out.println("Nenhum quarto disponível do tipo solicitado.");
	    	
		
	}
	public static void exibirReserva() {
	    for (Reserva reserva : cadastroReserva) {
	    	System.out.println(reserva);
	    }
	}
	public static void realizarCheckin() {
	    System.out.println("Digite o número do quarto para check-in:");
	    int numeroQuarto = scan.nextInt();
	    for (Quarto quarto : cadastroQuarto) {
	        if (quarto.getNumeroQuarto() == numeroQuarto && quarto.isDisponivel()) {
	            quarto.setDisponivel(false);
	            System.out.println("Check-in realizado com sucesso no quarto " + numeroQuarto);
	        }
	    }
	    System.out.println("Quarto não disponível para check-in.");
	}
	
	public static void realizarCheckout() {
	    System.out.println("Digite o número do quarto para check-out:");
	    int numeroQuarto = scan.nextInt();
	    for (Quarto quarto : cadastroQuarto) {
	        if (quarto.getNumeroQuarto() == numeroQuarto && !quarto.isDisponivel()) {
	            quarto.setDisponivel(true); 
	            System.out.println("Check-out realizado com sucesso no quarto " + numeroQuarto);
	        }
	    }
	    System.out.println("Quarto não está ocupado.");
	}
	public static void relatorioOcupacao() {
	    int ocupados = 0;
	    System.out.println("Relatório de Ocupação:");
	    for (Quarto quarto : cadastroQuarto) {
	        if (!quarto.isDisponivel()) {
	            ocupados++;
	            System.out.println("Quarto " + quarto.getNumeroQuarto() + " (Tipo: " + quarto.getTipoQuarto() + ") está ocupado.");
	        }
	    }
	    System.out.println("Total de quartos ocupados: " + ocupados);
	}
	public static void historicoReservasPorHospede() {
	    System.out.println("Digite o nome do hóspede:");
	    String nome = scan.next();
	    for (Reserva reserva : cadastroReserva) {
	        if (reserva.getNomeHospede().equalsIgnoreCase(nome)) {
	            System.out.println(reserva);
	        }
	    }
	}
}














