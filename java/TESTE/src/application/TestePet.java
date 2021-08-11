package application;

import entities.Pet;

class TestePet {
	
	public static void main(String[] args) {
		
		Pet animal1 = new Pet("LABRADOR", 2020);
		
		animal1.setPorte("Grande");
		
		System.out.println(animal1.getRaca());
		System.out.println(" Idade do bicho "+(2021 - animal1.getIdade()));
		System.out.println(animal1.emiteSom());
		animal1.();
		
		
	}

	
	public int idade() {
		return 2021 - idade 
	}
}
