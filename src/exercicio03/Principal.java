package exercicio03;

// ETAPA 01
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ETAPA 3
		Pessoa pessoa1 = new Pessoa("Antonio Sousa", 222333444-56, "RUA A, 200", "antonio@antonio.com.br");
		System.out.println("Nome: "+ pessoa1.nome);
		System.out.println("Cpf: "+ pessoa1.cpf);
		System.out.println("Endereço: "+ pessoa1.endereco);
		System.out.println("E-mail: "+ pessoa1.email);
		
		System.out.println("\n");
		
		// ETAPA 4
		Pessoa2 pessoa2 = new Pessoa2();
		pessoa2.setNome("Paulo Santos");
		pessoa2.setCpf(222333555-67);
		pessoa2.setEndereco("RUA FLORIANO, 5000");
		pessoa2.setEmail("paulo@paulo.com.br");
		
		System.out.println("Nome: "+ pessoa2.getNome());
		System.out.println("Cpf: "+ pessoa2.getCpf());
		System.out.println("Endereco: "+ pessoa2.getEndereco());
		System.out.println("Email: "+ pessoa2.getEmail());
		
		System.out.println("\n");
		
		// ETAPA 5
		System.out.println("Usando o metodo toString: ");
		System.out.println(pessoa1.toString());
		System.out.println(pessoa1);

	}

}
