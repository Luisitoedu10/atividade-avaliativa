package aula02;

import java.util.Scanner;

public class dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String nome, dataNascimento, cidade;
		int idade;
		
		System.out.println("Digite seu nome: ");
		nome = scan.next();
		System.out.println("Digite sua data de nascimento: ");
		dataNascimento = scan.next();
		System.out.println("Digite sua cidade: ");
		cidade = scan.next();
		System.out.println("Digite sua idade: ");
		idade = scan.nextInt();
		
		System.out.printf("Seu nome é: %s, sua idade é %d, Sua data de nascimento é: %s, você mora em: %s.",nome, idade, dataNascimento, cidade);
		
	}

}
