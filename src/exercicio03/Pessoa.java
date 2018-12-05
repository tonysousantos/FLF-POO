package exercicio03;

// ETAPA 02

public class Pessoa {
	public String nome;
	public long cpf;
	public String endereco;
	public String email;
	
	
	public Pessoa(String nome, long cpf, String endereco, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", email=" + email + "]";
	}
	
	
	
	
}
