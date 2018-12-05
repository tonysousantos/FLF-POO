package exercicio03;

public class Pessoa2 {
	private String nome;
	private long cpf;
	private String endereco;
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Pessoa2() {
		
	}

	@Override
	public String toString() {
		return "Pessoa2 [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", email=" + email + "]";
	}

	
}
