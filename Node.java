package projeto3a;

public class Node {
	
	private Consulta consultaMarcada;
	private Node proximoNode;
	
	public Node(Consulta novaConsulta) {
		this.consultaMarcada = novaConsulta;
	}
	
	public Consulta getConsultaMarcada() {
		return consultaMarcada;
	}
	public void setConsultaMarcada(Consulta consultaMarcada) {
		this.consultaMarcada = consultaMarcada;
	}
	public Node getProximoNode() {
		return proximoNode;
	}
	public void setProximoNode(Node proximoNode) {
		this.proximoNode = proximoNode;
	}
	
	
	

}
