package modeles;

import java.sql.Date;

public class TraitementSyvicoles {

	private Integer idtravsylvicoles;
	
	private String nomtraitement;
	
	private Date datecrea;
	
	public TraitementSyvicoles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TraitementSyvicoles(Integer idtravsylvicoles, String nomtraitement, Date datecrea, Date dateupda,
			String usercrea, String userupda, String invalide, String intitule_en, String codetravsyl,
			String description, String carto) {
		super();
		this.idtravsylvicoles = idtravsylvicoles;
		this.nomtraitement = nomtraitement;
		this.datecrea = datecrea;
		this.dateupda = dateupda;
		this.usercrea = usercrea;
		this.userupda = userupda;
		this.invalide = invalide;
		this.intitule_en = intitule_en;
		this.codetravsyl = codetravsyl;
		this.description = description;
		this.carto = carto;
	}

	public Integer getIdtravsylvicoles() {
		return idtravsylvicoles;
	}

	public void setIdtravsylvicoles(Integer idtravsylvicoles) {
		this.idtravsylvicoles = idtravsylvicoles;
	}

	public String getNomtraitement() {
		return nomtraitement;
	}

	public void setNomtraitement(String nomtraitement) {
		this.nomtraitement = nomtraitement;
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

	public String getCodetravsyl() {
		return codetravsyl;
	}

	public void setCodetravsyl(String codetravsyl) {
		this.codetravsyl = codetravsyl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCarto() {
		return carto;
	}

	public void setCarto(String carto) {
		this.carto = carto;
	}

	private Date dateupda;
	
	private String usercrea;
	
	private String userupda;
	
	private String invalide;
	
	private String intitule_en;
	
	private String codetravsyl;
	
	private String description;
	
	private String carto;
	
	
}
