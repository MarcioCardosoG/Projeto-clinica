package projeto3a;


public class ListaDeConsulta {
	
	private Node primeiro;
	private Node ultimo;
	private int tamanhoLista;
	
	public ListaDeConsulta() {
		this.tamanhoLista = 0;
	}
	


	public Node getPrimeiro() {
		return primeiro;
	}


	public void setPrimeiro(Node primeiro) {
		this.primeiro = primeiro;
	}



	public Node getUltimo() {
		return ultimo;
	}



	public void setUltimo(Node ultimo) {
		this.ultimo = ultimo;
	}
	
	


	public int getTamanhoLista() {
		return tamanhoLista;
	}


	public void setTamanhoLista(int tamanhoLista) {
		this.tamanhoLista = tamanhoLista;
	}


	
	public void adicionar(Consulta novaConsulta) {
		Node novoNode = new Node(novaConsulta);
		if(this.primeiro == null && this.ultimo == null ) {
			this.primeiro = novoNode;
			this.ultimo = novoNode;
					
		}else {
			this.ultimo.setProximoNode(novoNode);
			this.ultimo = novoNode;
		}
		this.tamanhoLista++;
	}
	
	public Node get(int posicao) {
		Node atual = this.primeiro;
		for(int i=0; i<posicao; i++ );
			if(atual.getProximoNode()!=null) {
				atual = atual.getProximoNode();
			}
			return atual;
	}
	

}
