package modeles;

import java.sql.Date;

public class Arrondissement {

	private String idarrondissement;
	
	private String intitule;
	
	private String codedepartement;
	
	private String zone;
	
	private Date datecrea;
	
	private Date dateupda;
	
	private String usercrea;
	
	private String userupda;
	
	private String invalide;
	
	private Integer codedepartment;
	
	private Integer superficie;
	
	private Integer coordonneex;
	
	private Integer coordonneey;
	
	private Integer superfie;
	
	private String codearrondissement; 
	
	private Integer uidkml;
	
	private Integer cheflieu;
	
	private Integer iddepartement;
		
	private Integer phase;
	
	private String code00;

	public Arrondissement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdarrondissement() {
		return idarrondissement;
	}

	public void setIdarrondissement(String idarrondissement) {
		this.idarrondissement = idarrondissement;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getCodedepartement() {
		return codedepartement;
	}

	public void setCodedepartement(String codedepartement) {
		this.codedepartement = codedepartement;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
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

	public Integer getCodedepartment() {
		return codedepartment;
	}

	public void setCodedepartment(Integer codedepartment) {
		this.codedepartment = codedepartment;
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

	public Integer getSuperfie() {
		return superfie;
	}

	public void setSuperfie(Integer superfie) {
		this.superfie = superfie;
	}

	public String getCodearrondissement() {
		return codearrondissement;
	}

	public void setCodearrondissement(String codearrondissement) {
		this.codearrondissement = codearrondissement;
	}

	public Integer getUidkml() {
		return uidkml;
	}

	public void setUidkml(Integer uidkml) {
		this.uidkml = uidkml;
	}

	public Integer getCheflieu() {
		return cheflieu;
	}

	public void setCheflieu(Integer cheflieu) {
		this.cheflieu = cheflieu;
	}

	public Integer getIddepartement() {
		return iddepartement;
	}

	public void setIddepartement(Integer iddepartement) {
		this.iddepartement = iddepartement;
	}

	public Integer getPhase() {
		return phase;
	}

	public void setPhase(Integer phase) {
		this.phase = phase;
	}

	public String getCode00() {
		return code00;
	}

	public void setCode00(String code00) {
		this.code00 = code00;
	}

	public Arrondissement(String idarrondissement, String intitule, String codedepartement, String zone, Date datecrea,
			Date dateupda, String usercrea, String userupda, String invalide, Integer codedepartment,
			Integer superficie, Integer coordonneex, Integer coordonneey, Integer superfie, String codearrondissement,
			Integer uidkml, Integer cheflieu, Integer iddepartement, Integer phase, String code00) {
		super();
		this.idarrondissement = idarrondissement;
		this.intitule = intitule;
		this.codedepartement = codedepartement;
		this.zone = zone;
		this.datecrea = datecrea;
		this.dateupda = dateupda;
		this.usercrea = usercrea;
		this.userupda = userupda;
		this.invalide = invalide;
		this.codedepartment = codedepartment;
		this.superficie = superficie;
		this.coordonneex = coordonneex;
		this.coordonneey = coordonneey;
		this.superfie = superfie;
		this.codearrondissement = codearrondissement;
		this.uidkml = uidkml;
		this.cheflieu = cheflieu;
		this.iddepartement = iddepartement;
		this.phase = phase;
		this.code00 = code00;
	}
	
}
