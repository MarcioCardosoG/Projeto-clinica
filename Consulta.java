package projeto3a;

public class Consulta {
	
	private Integer idConsulta;
	private String nomeMed;
	private String nomePac;
	private String especialidadeCon;
	private int dataDia;
	private int dataMes;
	private int dataAno;
	private int dataHora;
	
	public Consulta() {
		
	}
	
	



	public Consulta(Integer idConsulta, String nomeMed, String nomePac, String especialidadeCon, int dataDia,
			int dataMes, int dataAno, int dataHora) {
		super();
		this.idConsulta = idConsulta;
		this.nomeMed = nomeMed;
		this.nomePac = nomePac;
		this.especialidadeCon = especialidadeCon;
		this.dataDia = dataDia;
		this.dataMes = dataMes;
		this.dataAno = dataAno;
		this.dataHora = dataHora;
	}





	public int getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
	}

	public String getNomeMed() {
		return nomeMed;
	}

	public void setNomeMed(String nomeMed) {
		this.nomeMed = nomeMed;
	}

	public String getNomePac() {
		return nomePac;
	}

	public void setNomePac(String nomePac) {
		this.nomePac = nomePac;
	}
	
	public void setEspecialidadeCon(String especialidadeCon) {
		this.especialidadeCon = especialidadeCon;
	}

	public String getEspecialidadeCon() {
		return especialidadeCon;
	}

	public int getDataDia() {
		return dataDia;
	}

	public void setDataDia(int dataDia) {
		this.dataDia = dataDia;
	}

	public int getDataMes() {
		return dataMes;
	}

	public void setDataMes(int dataMes) {
		this.dataMes = dataMes;
	}

	public int getDataAno() {
		return dataAno;
	}

	public void setDataAno(int dataAno) {
		this.dataAno = dataAno;
	}

	public int getDataHora() {
		return dataHora;
	}

	public void setDataHora(int dataHora) {
		this.dataHora = dataHora;
	}
	
	public String toString() {
		return "\nId: " + idConsulta +
				"\nNome do médico: " + nomeMed +
				"\nEspecialidade: " + especialidadeCon
				+ "\nNome do paciente: " + nomePac +
				"\nData para a consulta: "+ dataDia +
				"|" + dataMes + "|" + dataAno +
				" na hora: " + dataHora +
				"\n---------------";
	}
	
}
