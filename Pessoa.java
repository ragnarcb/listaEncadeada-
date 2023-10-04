package estrutura_de_dados;

public class Pessoa {
	String nome;
	int id;
	Pessoa proximo;
	

	
	public Pessoa(String nome, int id, Pessoa proximo) {
		super();
		this.nome = nome;
		this.id = id;
		this.proximo = proximo;
	}


	public Pessoa() {
		super();
	}

	
	@Override
	public String toString() {
		return "Pessoa [Nome: " + nome + " ID: " + id + " ]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pessoa getProximo() {
		return proximo;
	}

	public void setProximo(Pessoa proximo) {
		this.proximo = proximo;
	}
	
	
}
