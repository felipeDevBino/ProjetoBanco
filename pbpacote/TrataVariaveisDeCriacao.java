package ProjetoBanco.pbpacote;

public class TrataVariaveisDeCriacao {

    public static void trataVariaveisDeCriacao(CriaConta conta) {
	
		if(conta.novoUsuario == null || conta.novoUsuario.isEmpty()) {
			System.out.println("Nome inválido!");
			conta.criaNovoUsuario();
		}
		if(conta.dataDeNascimento == 0) {
			System.out.println("Data de nascimento inválida!");
			conta.criaNovoUsuario();
		}
		if(conta.novoEmail == null || conta.novoEmail.isEmpty()) {
			System.out.println("Email inválido!");
			conta.criaNovoUsuario();
		}
		if(conta.senhaEmail == null || conta.senhaEmail.isEmpty()) {
			System.out.println("Senha de email inválida!");
			conta.criaNovoUsuario();	
		}
		if(conta.cpf == 0) {
			System.out.println("Cpf inválido");
			conta.criaNovoUsuario();
		}
		if(conta.novaSenha == null || conta.senhaEmail.isEmpty()) {
			System.out.println("Senha de usuário inválida!");
			conta.criaNovoUsuario();
		}

	}

}
