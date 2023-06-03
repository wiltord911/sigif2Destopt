package modeles;

import java.sql.Date;

public class Produit {

	private Integer idproduit;
	
	private String intitule;
	
	private Date datecrea;
	
	private Date dateupda;
	
	private String usercrea;
	
	private String userupda;
	
	private String invalide;
	
	private String intitule_en;
	
	private String codeproduit;
	
	private String description;
	
	private String type_produit;
	
	private Integer idessence;
	
	private Integer iddocument;

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdproduit() {
		return idproduit;
	}

	public void setIdproduit(Integer idproduit) {
		this.idproduit = idproduit;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public Date getDatecrea() {
		return datecrea;
	}

	public void setDatecrea(Date datecrea) {
		this.datecrea = datecrea;
	}

	public Date getDateupda() {
		return dateupda;
	}

	public void setDateupda(Date dateupda) {
		this.dateupda = dateupda;
	}

	public String getUsercrea() {
		return usercrea;
	}

	public void setUsercrea(String usercrea) {
		this.usercrea = usercrea;
	}

	public String getUserupda() {
		return userupda;
	}

	public void setUserupda(String userupda) {
		this.userupda = userupda;
	}

	public String getInvalide() {
		return invalide;
	}

	public void setInvalide(String invalide) {
		this.invalide = invalide;
	}

	public String getIntitule_en() {
		return intitule_en;
	}

	public void setIntitule_en(String intitule_en) {
		this.intitule_en = intitule_en;
	}

	public String getCodeproduit() {
		return codeproduit;
	}

	public void setCodeproduit(String codeproduit) {
		this.codeproduit = codeproduit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType_produit() {
		return type_produit;
	}

	public void setType_produit(String type_produit) {
		this.type_produit = type_produit;
	}

	public Integer getIdessence() {
		return idessence;
	}

	public void setIdessence(Integer idessence) {
		this.idessence = idessence;
	}

	public Integer getIddocument() {
		return iddocument;
	}

	public void setIddocument(Integer iddocument) {
		this.iddocument = iddocument;
	}

	public Produit(Integer idproduit, String intitule, Date datecrea, Date dateupda, String usercrea, String userupda,
			String invalide, String intitule_en, String codeproduit, String description, String type_produit,
			Integer idessence, Integer iddocument) {
		super();
		this.idproduit = idproduit;
		this.intitule = intitule;
		this.datecrea = datecrea;
		this.dateupda = dateupda;
		this.usercrea = usercrea;
		this.userupda = userupda;
		this.invalide = invalide;
		this.intitule_en = intitule_en;
		this.codeproduit = codeproduit;
		this.description = description;
		this.type_produit = type_produit;
		this.idessence = idessence;
		this.iddocument = iddocument;
	}
	
	
	
}
