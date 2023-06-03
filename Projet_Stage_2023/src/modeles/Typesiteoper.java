package modeles;

public class Typesiteoper {

	private String code;
	
	private String libelle;
	
	private String cat_site;
	
	private String actif_minfof;
	
	public Typesiteoper(String code, String libelle, String cat_site, String actif_minfof, String actif_entree_parc) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.cat_site = cat_site;
		this.actif_minfof = actif_minfof;
		this.actif_entree_parc = actif_entree_parc;
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

	public String getCat_site() {
		return cat_site;
	}

	public void setCat_site(String cat_site) {
		this.cat_site = cat_site;
	}

	public String getActif_minfof() {
		return actif_minfof;
	}

	public void setActif_minfof(String actif_minfof) {
		this.actif_minfof = actif_minfof;
	}

	public String getActif_entree_parc() {
		return actif_entree_parc;
	}

	public void setActif_entree_parc(String actif_entree_parc) {
		this.actif_entree_parc = actif_entree_parc;
	}

	private String actif_entree_parc;

	public Typesiteoper() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
