package fag;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import fag.objetos.Produto;

public class principal {
	public static List<Produto> listaProdutos = new ArrayList<>();
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		menu();
	}
	public static void menu() {
		System.out.println("Bem vido ao sistema de cadastrar produtos\n");
		boolean menu = true;
		while(menu) {
			System.out.println("[1] Cadastrar novo produto\n"
					+ "[2] Exibir lista de produtos\n"
					+ "[0] Sair do sistema\n"
					+ "O que deseja fazer?");
			int escolha = scan.nextInt();
			scan.nextLine();
			switch (escolha) {
			case 1: {
				cadastrarProdutos();
				break;
			}
			case 2:{
				exibirLista();
				
				break;
			}
			case 0:{
				System.out.println("Saindo...");
				menu = false;
				break;
			}
			default:
				System.out.println("Número inválido! Tente novamente.");
				break;
			}
		}
	}
	public static void cadastrarProdutos() {
		System.out.println("Cadastrar novo produto.");
		System.out.println("Inisira o nome do produto");
		String nomeProduto = scan.nextLine();
		System.out.println("Insira o preço de "+nomeProduto);
		Double precoProduto = scan.nextDouble();
		System.out.println("Insira a quantidade de "+nomeProduto+" em estoque");
		int quantidadeProduto = scan.nextInt();
		listaProdutos.add(new Produto(nomeProduto, precoProduto, quantidadeProduto));
		System.out.println("Produto cadastrado com sucesso!\n");
	}
	public static void exibirLista() {
		System.out.println("Exibir lista de produtos");
		if(listaProdutos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado!\n");
		}else {
		for (Produto produto : listaProdutos) {
			System.out.println(produto);
		}	
		}
	}	
}
