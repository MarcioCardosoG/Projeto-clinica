package projeto3a;

public class Consulta {
	
	private int idConsulta;
	private String nomeMed;
	private String nomePac;
	private int dataDia;
	private int dataMes;
	private int dataAno;
	private int dataHora;
	
	public Consulta() {
		
	}

	public Consulta(int idConsulta, String nomeMed, String nomePac, int dataDia, int dataMes, int dataAno,
			int dataHora) {
		super();
		this.idConsulta = idConsulta;
		this.nomeMed = nomeMed;
		this.nomePac = nomePac;
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
	
	
}