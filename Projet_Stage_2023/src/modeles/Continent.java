package modeles;

public class Continent {

		private String code;
		
		private String libelle;

		public Continent(String code, String libelle) {
			super();
			this.code = code;
			this.libelle = libelle;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getLibelle() {
			return libelle;
		}

		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}

		public Continent() {
			super();
			// TODO Auto-generated constructor stub
		}
	
}
