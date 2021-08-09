package entidade;

public class Revista extends Produto {
	
	private String editora;

	public Revista(String codigo, String nome, double d, int i, String editora) {
		super(codigo, nome);
		this.editora = editora;
	}
	//	capsula
	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
	

}
