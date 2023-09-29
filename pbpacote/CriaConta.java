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
	
			//Chamando a função para tratar variáveis vazias
			TrataVariaveisDeCriacao.trataVariaveisDeCriacao(this);

		}catch(NumberFormatException e) {
			System.out.println("Tipo de caracter inválido, recomenda-se utilizar números inteiros, ex: 1, 10, 100");
			criaNovoUsuario();
		}finally {	
			System.out.println("\nUsuário criado com sucesso.\n");
			mostraUsuarioCriado();
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
			mostraUsuarioCriado();
		}
		
	}

}
