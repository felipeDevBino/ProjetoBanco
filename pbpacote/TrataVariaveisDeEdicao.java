package ProjetoBanco.pbpacote;

public class TrataVariaveisDeEdicao {

    public static void trataVariaveisDeEdicao(CriaConta conta, EditaConta editaConta) {

        if(conta.novoUsuario == null || conta.novoUsuario.isEmpty()) {
			System.out.println("Nome inválido!");
			editaConta.editaContaExistente(conta);
		}
        if(conta.dataDeNascimento == 0) {
			System.out.println("Data de nascimento inválida!");
			editaConta.editaContaExistente(conta);	
		}
        if(conta.novoEmail == null || conta.novoEmail.isEmpty()) {
			System.out.println("Email inválido!");
			editaConta.editaContaExistente(conta);	
        }
        if(conta.senhaEmail == null || conta.senhaEmail.isEmpty()) {
			System.out.println("Senha de email inválida!");
			editaConta.editaContaExistente(conta);	
		}
        if(conta.cpf == 0) {
			System.out.println("Cpf inválido");
			editaConta.editaContaExistente(conta);
		}
        if(conta.novaSenha == null || conta.novaSenha.isEmpty()) {
			System.out.println("Senha de usuário inválida!");
			editaConta.editaContaExistente(conta);				
        }

    }
	
}
