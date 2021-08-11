package entities;

public class Gato extends Pet{
	
	private boolean Miar;

	
	public Gato(String raca, boolean Miar) {
		super(raca);
		this.Miar = Miar;
	}
	
	public boolean getLatidoAlto() {
		return Miar;
	}

	public void setLatidoAlto(boolean Miar) {
		this.Miar = Miar;
	}

	public void latidoAlto() {
		if(Miar == true) {
			System.out.println("MIAU MIAU");
		} else if (Miar == false) {
			System.out.println("miau miau");
		}
	}



}



