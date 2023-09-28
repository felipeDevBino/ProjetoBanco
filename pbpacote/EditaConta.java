package ProjetoBanco.pbpacote;

import java.util.Scanner;

public class EditaConta {

	Scanner scanner = new Scanner(System.in);
	protected String editarEmail = "";
	protected String editarSenha = "";
	protected long editarCpf = 0;
	
	/**
	  Função de editar conta, simulando um banco real, essa função recebe o parâmetro conta, pois é necessário fazer uso de suas variáveis e
	  valores para atualizá-las corretamente, usando o email, cpf e senha de usuário para garantir o acesso
	 * @param conta
	*/
	protected void editaContaExistente(CriaConta conta) {
			
		System.out.println("Deseja editar dados do usuário? digite sim ou nao:"); String opcaoDeEditar = scanner.nextLine();
		if(opcaoDeEditar.equalsIgnoreCase("sim")) {
			
			System.out.println("\nDigite o email, senha de usuário e cpf para editá-lo:");
			System.out.println("Digite o email:"); editarEmail = scanner.nextLine();
			System.out.println("Digite a senha de usuário:"); editarSenha = scanner.nextLine();
			System.out.println("Digite o cpf:"); editarCpf = Long.parseLong(scanner.nextLine());

			if(editarEmail.equalsIgnoreCase(conta.novoEmail) && editarSenha.equalsIgnoreCase(conta.novaSenha) && editarCpf == conta.cpf) {
				
					try {
						System.out.println("Digite o nome do novo usuário:"); conta.novoUsuario = scanner.nextLine();
						System.out.println("Digite a data de nascimento do usuário:"); conta.dataDeNascimento = Integer.parseInt(scanner.nextLine());
						System.out.println("Digite o email do usuário:"); conta.novoEmail = scanner.nextLine();
						System.out.println("Digite a senha do email do usuário:"); conta.senhaEmail = scanner.nextLine();
						System.out.println("Digite o cpf do usuário:"); conta.cpf = Long.parseLong(scanner.nextLine());
						System.out.println("Por fim, digite a senha do novo usuário:"); conta.novaSenha = scanner.nextLine();
						
					if(conta.novoUsuario == "") {
						System.out.println("Nome inválido!");
						this.editaContaExistente(conta);
							
					}else if(conta.dataDeNascimento == 0) {
						System.out.println("Data de nascimento inválida!");
						this.editaContaExistente(conta);
							
					}else if(conta.novoEmail == "") {
						System.out.println("Email inválido!");
						this.editaContaExistente(conta);
							
					}else if(conta.senhaEmail == "") {
						System.out.println("Senha de email inválida!");
						this.editaContaExistente(conta);	
						
					}else if(conta.cpf == 0) {
						System.out.println("Cpf inválido");
						this.editaContaExistente(conta);
						
					}else if(conta.novaSenha == "") {
						System.out.println("Senha de usuário inválida!");
						this.editaContaExistente(conta);
						
					}else {
						System.out.println("\nUsuário editado com sucesso.\n");
						conta.mostraUsuarioCriado();
					}
				
				}catch(NumberFormatException e) { 
					System.out.println("Tipo de caracter inválido, recomenda-se utilizar números inteiros, ex: 1, 10, 100");
					this.editaContaExistente(conta);
				}
					
			}else {
				System.out.println("Email, Cpf ou senha de usuário incorretos ou inexistentes.");
				this.editaContaExistente(conta);
			}
				
		}else if(opcaoDeEditar.equalsIgnoreCase("nao")) {
			//Continua o programa normalmente para as operações bancárias
		}else {
			System.out.println("Comando inválido/caracter inválido (não use acentos)!");
			this.editaContaExistente(conta);
		}
		
	}
	
}
