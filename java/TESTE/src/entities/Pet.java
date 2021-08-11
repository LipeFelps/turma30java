package entities;

public class Pet {
	//atributos - é, tem, estar
	private String raca;
	private String porte;
	private int idade;
	
	//construtores
	public Pet(String raca) {
		super();
		this.raca = raca;
	}
	//sobrecarga de construtor 
	public Pet(String raca, int idade) {
		super();
		this.raca = raca;
		this.idade = idade;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	

}
