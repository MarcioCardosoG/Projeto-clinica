package projeto3a;

public class Medico extends Pessoa {
	
	
	private String especialidade;
	
	
	


	public Medico(String cpf, String nome, String especialidade) {
		super(cpf, nome);
		this.especialidade = especialidade;
	}
	
	
	

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	@Override
	public String toString() {
		return "\nNome: " + nome +"\nCPF: " + cpf +"\nEspecialidade: "+ especialidade +"\n---------------";
	}
	

}
