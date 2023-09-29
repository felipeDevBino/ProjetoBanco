package ProjetoBanco.pbpacote;

import java.util.Scanner;

public class OperacoesBancarias {
	
	Scanner scanner = new Scanner(System.in);
	private int valor;
	private int saldo = 300;
	private int limiteBonus = 200;
	private int saldoBase = (saldo + limiteBonus);
	private int valorTotal = saldoBase + valor;
	private int valorParaSaque;
	protected int comandoDeOperacao;
	
	/**
	 * Função principal para chamar as operações na dependência de qual comando o usuário digitar 
	*/
	protected void realizaOperacao() {

		System.out.println("Digite um comando entre 1-4 para realizar uma determinada operação bancária:");
		System.out.println("1 = Sacar Dinheiro");
		System.out.println("2 = Depositar Dinheiro");
		System.out.println("3 = Consultar Saldo");			
		System.out.println("4 = Cancelar");
		System.out.println("Digite: ");
		
		try {
			comandoDeOperacao = Integer.parseInt(scanner.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("Tipo de caracter inválido, recomenda-se utilizar números inteiros, ex: 1, 10, 100");
		}

		if(comandoDeOperacao == 1) {
			this.realizaSaque();
			this.realizaOperacao();
		}else if(comandoDeOperacao == 2) {
			this.realizaDeposito();
			this.realizaOperacao();
		}else if(comandoDeOperacao == 3) {
			this.consultaSaldo();
			this.realizaOperacao();
		}else if(comandoDeOperacao == 4) {
			System.out.println("Programa terminado.");
			System.exit(0);
		}else {
			System.out.println("Comando incorreto/inválido.");
			this.realizaOperacao();
		}
		
	}
	
	/**
	 * Função simples que consulta o saldo bancário do usuário, este que, por sua vez, pode mudá-lo, sacando ou depositando dinheiro
	 * que mudará o valor da variável 'valorTotal' 
	*/
	private void consultaSaldo() {
		
		System.out.println("Saldo base (saldo + limite bônus): " + saldoBase);
		System.out.println("Saldo total: " + valorTotal);
		
	}
	
	/**
	 * Função para sacar dinheiro do estado atual da variável 'valorTotal', essa que recebe seu valor próprio e diminui pelo valor a ser
	 * sacado, apenas se for menor ou igual ao valor existente em saldo e maior do que zero 
	*/
	private void realizaSaque() {
		
		try {
			System.out.println("Digite o valor para ser sacado:"); valorParaSaque = Integer.parseInt(scanner.nextLine());
			if(valorParaSaque <= valorTotal && valorParaSaque > 0) {
				valorTotal = valorTotal - valorParaSaque;
				System.out.println("Saque realizado com sucesso.");
			}else {
				System.out.println("Quantia excedente, incapaz de realizar o saque.");
				this.realizaSaque();
			}
		}catch(NumberFormatException e) {
			System.out.println("Tipo de caracter inválido, recomenda-se utilizar números inteiros, ex: 1, 10, 100");
			this.realizaSaque();
		}
		
	}
	
	/**
	 * Função de depositar dinheiro através da variável 'valor', que, da mesma maneira que na função de saque, muda o valor da variável 
	 * 'valorTotal', de forma com que ela receba o mesmo valor dela somado com o valor digitado para depósito
	*/
	private void realizaDeposito() {
		
		try {
			System.out.println("Digite a quantia que deseja depositar:"); valor = Integer.parseInt(scanner.nextLine());
			if(valor > 0) {
				valorTotal = valorTotal + valor;
				System.out.println("Depósito realizado com sucesso.");				
			}else {
				System.out.println("Quantidade inválida.");
				this.realizaDeposito();
			}
		}catch(NumberFormatException e) {
			System.out.println("Tipo de caracter inválido, recomenda-se utilizar números inteiros, ex: 1, 10, 100");
			this.realizaDeposito();
		}
		
	}
	
}
