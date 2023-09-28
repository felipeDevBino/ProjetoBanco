package ProjetoBanco.pbpacote;

import java.util.Scanner;

public class CriaConta {

	public Scanner scanner = new Scanner(System.in);
	
	//Dados para a criação do usuário
	protected String novoUsuario;
	protected String novaSenha;
	protected String novoEmail;
	protected String senhaEmail;
	protected int dataDeNascimento;
	protected long cpf;
	protected String escolha;
	
	/**
	 * Método principal para criação de contas e definição de parâmetros essenciais como:
	 * 
	 * @param novoUsuario
	 * @param dataDeNascimento
	 * @param novaSenha
	 * @param cpf
	 * @param novoEmail
	 * @param senhaEmail
	*/
	protected void criaNovoUsuario() {
	
		try {
			System.out.println("\nDigite o nome do novo usuário:"); novoUsuario = scanner.nextLine();
			System.out.println("Digite a data de nascimento do usuário:"); dataDeNascimento = Integer.parseInt(scanner.nextLine());
			System.out.println("Digite o email do usuário:"); novoEmail = scanner.nextLine();
			System.out.println("Digite a senha do email:"); senhaEmail = scanner.nextLine();
			System.out.println("Digite o cpf do usuário:"); cpf = Long.parseLong(scanner.nextLine());
			System.out.println("Por fim, digite a senha de usuário:"); novaSenha = scanner.nextLine();
			
			if(novoUsuario == "") {
				System.out.println("Nome inválido!");
				this.criaNovoUsuario();
				
			}else if(dataDeNascimento == 0) {
				System.out.println("Data de nascimento inválida!");
				this.criaNovoUsuario();
				
			}else if(novoEmail == "") {
				System.out.println("Email inválido!");
				this.criaNovoUsuario();
				
			}else if(senhaEmail == "") {
				System.out.println("Senha de email inválida!");
				this.criaNovoUsuario();
				
			}else if(cpf == 0) {
				System.out.println("Cpf inválido!");
				this.criaNovoUsuario();
			
			}else if(novaSenha == "") {
				System.out.println("Senha de usuário inválida!");
				this.criaNovoUsuario();	
			
			}else {
				System.out.println("Usuário criado com sucesso!");
			}
			
		}catch(NumberFormatException e) {
			System.out.println("Tipo de caracter inválido, recomenda-se utilizar números inteiros, ex: 1, 10, 100");
		}
		
	}
	
	/**
	 * Executa as ações de impressão de usuário a partir de determinadas escolhas feitas pelo usuário como: (editar ou mostrar dados importantes)
	*/
	protected void mostraUsuarioCriado() {
		
		System.out.println("Deseja ver informações importantes da conta? digite sim ou nao:"); escolha = scanner.nextLine();
		
		if(escolha.equalsIgnoreCase("sim")) {
			
				System.out.println("\n======Novo Usuário======");
				System.out.println("Nome: " + novoUsuario);
				System.out.println("Data de Nascimento: " + dataDeNascimento);
				System.out.println("Email: " + novoEmail);
				System.out.println("CPF: " + cpf);
				System.out.println("Senha de usuário: " + novaSenha);
		
		}else if(escolha.equalsIgnoreCase("nao")){
			
			System.out.println("\n======Novo Usuário======");
			System.out.println("Nome: " + novoUsuario);
			System.out.println("Data de Nascimento: " + dataDeNascimento);
			System.out.println("Email: " + novoEmail);
		
		}else {
			System.out.println("Comando inválido/caracter inválido (não use acentos)!");
			this.mostraUsuarioCriado();
		}
		
	}
	
}
