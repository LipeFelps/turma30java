package entities;

public class Passaro extends Pet{
		
		private boolean Piar;

		
		public Passaro(String raca, boolean Piar) {
			super(raca);
			this.Piar = Piar;
		}
		
		public boolean getLatidoAlto() {
			return Piar;
		}

		public void setLatidoAlto(boolean Piar) {
			this.Piar = Piar;
		}

		public void Piar() {
			if(Piar == true) {
				System.out.println("PIU PIU");
			} else if (Piar == false) {
				System.out.println("piu piu");
			}
		}

	}


