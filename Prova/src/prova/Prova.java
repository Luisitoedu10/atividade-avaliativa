package prova;

import java.util.Scanner;

public class Prova {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		boolean menu = true;
		while(menu) {
			System.out.println("\nDigite o numero da atividade que deseja ver?\nDigite 0 para sair.");
			int escolha = scan.nextInt();
			switch (escolha) {
			case 1:
				Atividade01();
				break;
			case 2:
				Atividade02();
				break;
			case 3:
				Atividade03();
				break;
			case 4:
				Atividade04();
				break;
			case 5:
				Atividade05();
				break;
			case 6:
				Atividade06();
				break;
			case 7:
				Atividade07();
				break;
			case 8:
				Atividade08();
				break;
			case 9:
				Atividade09();
				break;
			case 10:
				Atividade10();
				break;
			case 0:
				System.out.println("Saindo...");
				menu = false;
				break;
			default:
				System.out.println("Insira um número de 1 a 10\n");
				break;
			}
		}	
	}
	public static void Atividade01() {
		System.out.println("Insira um número");
		int numero = scan.nextInt();
		System.out.println("O número é: "+(numero+37));
	}
	public static void Atividade02() {
		int numero = 0;
		int soma = 0, contador = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("Insira um numero");
			numero = scan.nextInt();
			soma = soma + numero;
			contador++;
		}
		System.out.println("A media é "+(soma/contador));
	}
	public static void Atividade03() {
		System.out.println("Insira a quantidade de minutos");
		float minutos = scan.nextFloat();
		float horas = minutos/60;
		int horasInteiras = (int) (minutos/60);
		float minutosRestantes = (horas-horasInteiras)*60;
		System.out.printf("Você digitou %d horas e %.0f minutos",horasInteiras, minutosRestantes);
	}
	public static void Atividade04() {
		System.out.println("Informe o número: ");
		int numero = scan.nextInt();
		if(numero >= 50) {
			System.out.println("O número é maior ou igual a 50.");
		}else {
			System.out.println("O número não é maior ou igual a 50.");
		}
	}
	public static void Atividade05() {
		System.out.println("Insira um número: ");
		int numero = scan.nextInt();
		if (numero % 2 == 0) {
			System.out.println("O número é par.");
		}else {
			System.out.println("O número não é par.");
		}
	}
	public static void Atividade06() {
		int iguais = 0, maior = 0, menor = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("Insira um número: ");
			int numero = scan.nextInt();
			if ((numero == maior) || (numero == menor)) {
				iguais++;
			}
			if (i == 0) {
				maior = numero;
				menor = numero;
			}
			if (numero > maior) {
				maior = numero;
			}
			if (numero < menor) {
				menor = numero;
			}
		}
		if(iguais > 0) {
			System.out.println("Existem dois numeros iguais");
		}
		System.out.println("O maior numero é "+maior);
		System.out.println("O menor numero é "+menor);
	
	}
	public static void Atividade07() {
		System.out.println("Insira sua nota");
		int nota1 = scan.nextInt();
		System.out.println("Insira outra nota");
		int nota2 = scan.nextInt();
		float media = (nota1+nota2) / 2;
		if (media >= 70) {
			System.out.println("A média é maior ou igual a 70! Você está aprovado!");
		}else {
			System.out.println("Sua media foi abaixo de 70");
			System.out.println("Insira a nota da sua recuperação");
			int recuperacao = scan.nextInt();
			if ((media + recuperacao)/2 < 60) {
				System.out.println("Você está reprovado!");
			}else {
				System.out.println("Você passou na recuperação!");
			}
		}
	}
	public static void Atividade08() {
		System.out.println("Insira um numero para descobrir o dia da semana: ");
		int dia = scan.nextInt();
		switch(dia) {
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Terça-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta-feira");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default: 
			System.out.println("O número deve ser entre 1 e 7.");
		}
	}
	public static void Atividade09() {
		float numero1, numero2;
		System.out.println("Que operação quer fazer?\n"
				+ "[1]Adição\n[2]Subtração\n[3]Multiplicação\n[4]Divisão");
		int escolha = scan.nextInt();
		switch (escolha) {
		case 1:
			System.out.println("Adição");
			System.out.println("Insira o primeiro numero");
			numero1 = scan.nextFloat();
			System.out.println("Insira o segundo numero");
			numero2 = scan.nextFloat();
			System.out.printf("%.2f + %.2f = %.2f",numero1,numero2,(numero1 + numero2));
			break;
			
		case 2:
			System.out.println("Subtração");
			System.out.println("Insira o primeiro numero");
			numero1 = scan.nextFloat();
			System.out.println("Insira o segundo numero");
			numero2 = scan.nextInt();
			System.out.printf("%.2f - %.2f = %.2f",numero1,numero2,(numero1 - numero2));
			break;
		case 3:
			System.out.println("Multiplicação");
			System.out.println("Insira o primeiro numero");
			numero1 = scan.nextFloat();
			System.out.println("Insira o segundo numero");
			numero2 = scan.nextFloat();
			System.out.printf("%.2f x %.2f = %.2f",numero1,numero2,(numero1 * numero2));
			break;
		case 4:
			System.out.println("Divisão");
			System.out.println("Insira o primeiro numero");
			numero1 = scan.nextFloat();
			System.out.println("Insira o segundo numero");
			numero2 = scan.nextFloat();
			if(numero2 == 0) {
				System.out.println("Não é possivel fazer divisão por 0");
			}else {
				System.out.printf("%.2f / %.2f = %.2f",numero1,numero2,(numero1 / numero2));
			}
			break;
		default: 
			System.out.println("Insira um numero de 1 a 4");
			break;
		}
	}
	public static void Atividade10() {
		System.out.println("Você quer calcular a área de um triângulo ou de um retângulo?\n"
				+ "[1]Triângulo\n[2]Retângulo");
		int escolha = scan.nextInt();
		switch (escolha){
		case 1:
			System.out.println("Insira a base do triângulo");
			float baseT = scan.nextFloat();
			System.out.println("Insira a altura do triangulo");
			float alturaT = scan.nextFloat();
			System.out.println("A área do triângulo é: "+(baseT*alturaT)/2); 
		case 2:
			System.out.println("Insira a base do retângulo");
			float baseR = scan.nextFloat();
			System.out.println("Insira a altura do retângulo");
			float alturaR = scan.nextFloat();
			System.out.println("A área do retângulo é: "+(baseR*alturaR));
		}
	}
}
