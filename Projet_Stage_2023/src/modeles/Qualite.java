package modeles;

import java.sql.Date;

public class Qualite {
	
	private Integer idqualite;
	
	private String intitule;
	
	private String codequalite;
	
	private Date datecrea;
	
	private Date dateupda;
	
	private String usercrea;
	
	private String userupda;
	
	private String invalide;
	
	private String intitule_en;
	
	private String utilisation;
	
	private Integer idproduit;
	
	private String description;

	public Qualite(Integer idqualite, String intitule, String codequalite, Date datecrea, Date dateupda, String usercrea,
			String userupda, String invalide, String intitule_en, String utilisation, Integer idproduit,
			String description) {
		super();
		this.idqualite = idqualite;
		this.intitule = intitule;
		this.codequalite = codequalite;
		this.datecrea = datecrea;
		this.dateupda = dateupda;
		this.usercrea = usercrea;
		this.userupda = userupda;
		this.invalide = invalide;
		this.intitule_en = intitule_en;
		this.utilisation = utilisation;
		this.idproduit = idproduit;
		this.description = description;
	}

	public Integer getIdqualite() {
		return idqualite;
	}

	public void setIdqualite(Integer idqualite) {
		this.idqualite = idqualite;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getCodequalite() {
		return codequalite;
	}

	public void setCodequalite(String codequalite) {
		this.codequalite = codequalite;
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

	public String getUtilisation() {
		return utilisation;
	}

	public void setUtilisation(String utilisation) {
		this.utilisation = utilisation;
	}

	public Integer getIdproduit() {
		return idproduit;
	}

	public void setIdproduit(Integer idproduit) {
		this.idproduit = idproduit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Qualite() {
		super();
		// TODO Auto-generated constructor stub
	}

}
