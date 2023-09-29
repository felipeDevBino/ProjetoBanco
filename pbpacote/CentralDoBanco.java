package ProjetoBanco.pbpacote;

import java.util.Scanner;

public class CentralDoBanco {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("========Banco Central========");
		CriaConta conta = new CriaConta();
		conta.criaNovoUsuario();
		conta.mostraUsuarioCriado();
		
		System.out.println("\n========Editar Usuário========");
		EditaConta editaConta = new EditaConta();
		editaConta.opcaoDeEditar();
		editaConta.editaContaExistente();
		
		System.out.println("\n========Operações Bancárias========");
		OperacoesBancarias operacoes = new OperacoesBancarias();
		operacoes.realizaOperacao();
		
	}

}
