package entidade;

public class Pet extends Animal{

		private String raca;
		private char porte; //P - G - M
		public String getRaca() {
			return raca;
}
		public Pet(String raca, String raca2, char porte) {
			super();
			this.raca = raca;
			this.porte = porte;
		}
}
