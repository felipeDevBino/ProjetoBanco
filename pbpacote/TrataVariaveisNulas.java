package ProjetoBanco.pbpacote;

public class TrataVariaveisNulas {
    
	EditaConta editaConta = new EditaConta();

    public void tratandoVariaveisNulas(CriaConta conta) {

            if(conta.novoUsuario == "") {
						
				System.out.println("Nome inválido!");
				editaConta.editaContaExistente();

			}else if(conta.novoUsuario == null) {

				System.out.println("Nome inválido!");
				editaConta.editaContaExistente();

			}else if(conta.dataDeNascimento == 0) {

				System.out.println("Data de nascimento inválida!");
				editaConta.editaContaExistente();	

			}else if(conta.novoEmail == "") {

				System.out.println("Email inválido!");
				editaConta.editaContaExistente();	

			}else if(conta.novoEmail == null) {

				System.out.println("Email inválido!");
				editaConta.editaContaExistente();

			}else if(conta.senhaEmail == "") {

				System.out.println("Senha de email inválida!");
				editaConta.editaContaExistente();	

			}else if(conta.senhaEmail == null) {

				System.out.println("Senha de email inválida!");
				editaConta.editaContaExistente();	

			}else if(conta.cpf == 0) {

				System.out.println("Cpf inválido");
				editaConta.editaContaExistente();

			}else if(conta.novaSenha == "") {

				System.out.println("Senha de usuário inválida!");
				editaConta.editaContaExistente();
						
			}else if(conta.novaSenha == null) {

				System.out.println("Senha de usuário inválida!");
				editaConta.editaContaExistente();

			}else {

				System.out.println("\nUsuário editado com sucesso.\n");
				conta.mostraUsuarioCriado();
					
            }

      }

}
