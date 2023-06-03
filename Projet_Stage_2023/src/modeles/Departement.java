package modeles;

import java.sql.Date;

public class Departement {
	private String codedepartement;
	
	private String intitule;
	
	private String coderegion;
	
	private Date datecrea;
	
	private Date dateupda;
	
	private String usercrea;
	
	private String userupda;
	
	private String invalide;
	
	private Integer codenumerique;
	
	private Integer superficie;
	
	private Integer coordonneex;
	
	private Integer coordonneey;
	
	private Integer uidkml;
	
	private String cheflieu; 
	
	private Integer iddepartement;
	
	private Integer idregion;
	
	private Integer sarrondissement;
		
		public Departement(String codedepartement, String intitule, String coderegion, Date datecrea, Date dateupda,
			String usercrea, String userupda, String invalide, Integer codenumerique, Integer superficie,
			Integer coordonneex, Integer coordonneey, Integer uidkml, String cheflieu, Integer iddepartement,
			Integer idregion, Integer sarrondissement) {
		super();
		this.codedepartement = codedepartement;
		this.intitule = intitule;
		this.coderegion = coderegion;
		this.datecrea = datecrea;
		this.dateupda = dateupda;
		this.usercrea = usercrea;
		this.userupda = userupda;
		this.invalide = invalide;
		this.codenumerique = codenumerique;
		this.superficie = superficie;
		this.coordonneex = coordonneex;
		this.coordonneey = coordonneey;
		this.uidkml = uidkml;
		this.cheflieu = cheflieu;
		this.iddepartement = iddepartement;
		this.idregion = idregion;
		this.sarrondissement = sarrondissement;
	}

		public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}

		public String getCodedepartement() {
		return codedepartement;
	}

	public void setCodedepartement(String codedepartement) {
		this.codedepartement = codedepartement;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getCoderegion() {
		return coderegion;
	}

	public void setCoderegion(String coderegion) {
		this.coderegion = coderegion;
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

	public Integer getCodenumerique() {
		return codenumerique;
	}

	public void setCodenumerique(Integer codenumerique) {
		this.codenumerique = codenumerique;
	}

	public Integer getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Integer superficie) {
		this.superficie = superficie;
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

	public Integer getIddepartement() {
		return iddepartement;
	}

	public void setIddepartement(Integer iddepartement) {
		this.iddepartement = iddepartement;
	}

	public Integer getIdregion() {
		return idregion;
	}

	public void setIdregion(Integer idregion) {
		this.idregion = idregion;
	}

	public Integer getSarrondissement() {
		return sarrondissement;
	}

	public void setSarrondissement(Integer sarrondissement) {
		this.sarrondissement = sarrondissement;
	}

	
		

	}


