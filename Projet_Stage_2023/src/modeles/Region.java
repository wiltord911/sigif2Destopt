package modeles;

import java.sql.Date;

public class Region {
	
	private String coderegion;
	
	private String intitule;
	
	private Date datecrea;
	
	private Date dateupda;
	
	private String usercrea;
	
	private String userupda;
	
	private String invalide;
	
	private Integer coordonneex;
	
	private Integer coordonneey;
	
	private Integer superficie;
	
	public Region(String coderegion, String intitule, Date datecrea, Date dateupda, String usercrea, String userupda,
			String invalide, Integer coordonneex, Integer coordonneey, Integer superficie, Integer uidkml,
			String cheflieu, Integer idregion, Integer sdepartement, String article) {
		super();
		this.coderegion = coderegion;
		this.intitule = intitule;
		this.datecrea = datecrea;
		this.dateupda = dateupda;
		this.usercrea = usercrea;
		this.userupda = userupda;
		this.invalide = invalide;
		this.coordonneex = coordonneex;
		this.coordonneey = coordonneey;
		this.superficie = superficie;
		this.uidkml = uidkml;
		this.cheflieu = cheflieu;
		this.idregion = idregion;
		this.sdepartement = sdepartement;
		this.article = article;
	}

	public String getCoderegion() {
		return coderegion;
	}

	public void setCoderegion(String coderegion) {
		this.coderegion = coderegion;
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

	public Integer getCoordonneex() {
		return coordonneex;
	}

	public void setCoordonneex(Integer coordonneex) {
		this.coordonneex = coordonneex;
	}

	public Integer getCoordonneey() {
		return coordonneey;
	}

	public void setCoordonneey(Integer coordonneey) {
		this.coordonneey = coordonneey;
	}

	public Integer getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Integer superficie) {
		this.superficie = superficie;
	}

	public Integer getUidkml() {
		return uidkml;
	}

	public void setUidkml(Integer uidkml) {
		this.uidkml = uidkml;
	}

	public String getCheflieu() {
		return cheflieu;
	}

	public void setCheflieu(String cheflieu) {
		this.cheflieu = cheflieu;
	}

	public Integer getIdregion() {
		return idregion;
	}

	public void setIdregion(Integer idregion) {
		this.idregion = idregion;
	}

	public Integer getSdepartement() {
		return sdepartement;
	}

	public void setSdepartement(Integer sdepartement) {
		this.sdepartement = sdepartement;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public Region() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Integer uidkml;
	
	private String cheflieu;
	
	private Integer idregion;
	
	private Integer sdepartement;
	
	private String article;
	

}
