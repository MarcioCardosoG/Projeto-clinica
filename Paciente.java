package projeto3a;

public class Paciente extends Pessoa {

	private String endereco;
	
	

	

	public Paciente(String cpf, String nome, String endereco) {
		super(cpf, nome);
		this.endereco = endereco;
	}

	
	
	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		return "\nNome: " + nome +"\nCPF: " + cpf +"\nEndereço: "+ endereco +"\n---------------";
	}
	
}
