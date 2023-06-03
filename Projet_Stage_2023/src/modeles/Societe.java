package modeles;

public class Societe {
	
	private Integer idsociete;
	
	private String organisationtype;
	
	private String accessigif;
	
	private String numregcommerce;
	
	private String numcontribuable;
	
	private String email;
	
	private String telephone;
	
	private String adresse;
	
	private String commentaire;
	
	private String socexploitation;
	
	private String numagrexploit;
	
	private String dateagrexploit;
	
	private Integer iudagrexploit;
	
	private String socinventaire;
	
	private String numagrinvent;
	
	private String dateagrinvent;
	
	private Integer iudagrinvent;
	
	private String socsylviculture;
	
	private String numagrsylvic;
	
	private String dateagrsylvic;
	
	private Integer iudagrsylvic;
	
	private Integer iudempmarteau;
	
	private Integer iudrecommand;
	
	private String datecrea;
	
	private String dateupda;
	
	private String usercrea;
	
	private String userupda;
	
	private String raisonsociale;
	
	private String invalide;
	
	private String statut;
	
	private Integer arrondissement;
	
	private String soctransformateur;
	
	private Integer idorganisation;
	
	private String datecertiftransf;
	
	private String numcertiftransf;
	
	private String sigle;
	
	private Integer idpays;
	
	private String codeenreg;
	
	private String nomresponsable;
	
	private String telresponsable;
	
	private Integer iudregcommerce;
	
	private String dateregcommerce;
	
	private Integer iudcontribuable;
	
	private String datecontribuable;
	
	private Integer iuddocentjur;
	
	private String numdocentjur;
	
	private String datedocentjur;
	
	private Integer iudcertiftransf;
	
	private String typeentjur;
	
	private Integer numcni;
	
	private String datecni;
	
	private String statutoperateur;
	
	private String numcertifdomicile;
	
	private String datecertifdomicile;
	
	private Integer iudcertifdomicile;
	
	private String emailresponsable;
	
	private String typeentiteminfof;
	
	private String departement;
	
	private String region;
	
	private String civilte_responsable;
	
	private String numacteminfof;

	private String dateacteminfof;
	
	private Integer iudacteminfof;
	
	private String numrecepissedecla;
	
	private String daterecepissedecla;
	
	private Integer iudrecepissedecla;

	public Societe() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	


	public Societe(Integer idsociete,String raisonsociale, String numregcommerce, String numcontribuable,Integer arrondissement, String email, String telephone,
			String adresse ) {
		super();
		this.idsociete = idsociete;
		this.raisonsociale = raisonsociale;
		this.numregcommerce = numregcommerce;
		this.numcontribuable = numcontribuable;
		this.arrondissement = arrondissement;
		this.email = email;
		this.telephone = telephone;
		this.adresse = adresse;
	}





	public Integer getIdsociete() {
		return idsociete;
	}

	public void setIdsociete(Integer idsociete) {
		this.idsociete = idsociete;
	}

	public String getOrganisationtype() {
		return organisationtype;
	}

	public void setOrganisationtype(String organisationtype) {
		this.organisationtype = organisationtype;
	}

	public String getAccessigif() {
		return accessigif;
	}

	public void setAccessigif(String accessigif) {
		this.accessigif = accessigif;
	}

	public String getNumregcommerce() {
		return numregcommerce;
	}

	public void setNumregcommerce(String numregcommerce) {
		this.numregcommerce = numregcommerce;
	}

	public String getNumcontribuable() {
		return numcontribuable;
	}

	public void setNumcontribuable(String numcontribuable) {
		this.numcontribuable = numcontribuable;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public String getSocexploitation() {
		return socexploitation;
	}

	public void setSocexploitation(String socexploitation) {
		this.socexploitation = socexploitation;
	}

	public String getNumagrexploit() {
		return numagrexploit;
	}

	public void setNumagrexploit(String numagrexploit) {
		this.numagrexploit = numagrexploit;
	}

	public String getDateagrexploit() {
		return dateagrexploit;
	}

	public void setDateagrexploit(String dateagrexploit) {
		this.dateagrexploit = dateagrexploit;
	}

	public Integer getIudagrexploit() {
		return iudagrexploit;
	}

	public void setIudagrexploit(Integer iudagrexploit) {
		this.iudagrexploit = iudagrexploit;
	}

	public String getSocinventaire() {
		return socinventaire;
	}

	public void setSocinventaire(String socinventaire) {
		this.socinventaire = socinventaire;
	}

	public String getNumagrinvent() {
		return numagrinvent;
	}

	public void setNumagrinvent(String numagrinvent) {
		this.numagrinvent = numagrinvent;
	}

	public String getDateagrinvent() {
		return dateagrinvent;
	}

	public void setDateagrinvent(String dateagrinvent) {
		this.dateagrinvent = dateagrinvent;
	}

	public Integer getIudagrinvent() {
		return iudagrinvent;
	}

	public void setIudagrinvent(Integer iudagrinvent) {
		this.iudagrinvent = iudagrinvent;
	}

	public String getSocsylviculture() {
		return socsylviculture;
	}

	public void setSocsylviculture(String socsylviculture) {
		this.socsylviculture = socsylviculture;
	}

	public String getNumagrsylvic() {
		return numagrsylvic;
	}

	public void setNumagrsylvic(String numagrsylvic) {
		this.numagrsylvic = numagrsylvic;
	}

	public String getDateagrsylvic() {
		return dateagrsylvic;
	}

	public void setDateagrsylvic(String dateagrsylvic) {
		this.dateagrsylvic = dateagrsylvic;
	}

	public Integer getIudagrsylvic() {
		return iudagrsylvic;
	}

	public void setIudagrsylvic(Integer iudagrsylvic) {
		this.iudagrsylvic = iudagrsylvic;
	}

	public Integer getIudempmarteau() {
		return iudempmarteau;
	}

	public void setIudempmarteau(Integer iudempmarteau) {
		this.iudempmarteau = iudempmarteau;
	}

	public Integer getIudrecommand() {
		return iudrecommand;
	}

	public void setIudrecommand(Integer iudrecommand) {
		this.iudrecommand = iudrecommand;
	}

	public String getDatecrea() {
		return datecrea;
	}

	public void setDatecrea(String datecrea) {
		this.datecrea = datecrea;
	}

	public String getDateupda() {
		return dateupda;
	}

	public void setDateupda(String dateupda) {
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

	public String getRaisonsociale() {
		return raisonsociale;
	}

	public void setRaisonsociale(String raisonsociale) {
		this.raisonsociale = raisonsociale;
	}

	public String getInvalide() {
		return invalide;
	}

	public void setInvalide(String invalide) {
		this.invalide = invalide;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public Integer getArrondissement() {
		return arrondissement;
	}

	public void setArrondissement(Integer arrondissement) {
		this.arrondissement = arrondissement;
	}

	public String getSoctransformateur() {
		return soctransformateur;
	}

	public void setSoctransformateur(String soctransformateur) {
		this.soctransformateur = soctransformateur;
	}

	public Integer getIdorganisation() {
		return idorganisation;
	}

	public void setIdorganisation(Integer idorganisation) {
		this.idorganisation = idorganisation;
	}

	public String getDatecertiftransf() {
		return datecertiftransf;
	}

	public void setDatecertiftransf(String datecertiftransf) {
		this.datecertiftransf = datecertiftransf;
	}

	public String getNumcertiftransf() {
		return numcertiftransf;
	}

	public void setNumcertiftransf(String numcertiftransf) {
		this.numcertiftransf = numcertiftransf;
	}

	public String getSigle() {
		return sigle;
	}

	public void setSigle(String sigle) {
		this.sigle = sigle;
	}

	public Integer getIdpays() {
		return idpays;
	}

	public void setIdpays(Integer idpays) {
		this.idpays = idpays;
	}

	public String getCodeenreg() {
		return codeenreg;
	}

	public void setCodeenreg(String codeenreg) {
		this.codeenreg = codeenreg;
	}

	public String getNomresponsable() {
		return nomresponsable;
	}

	public void setNomresponsable(String nomresponsable) {
		this.nomresponsable = nomresponsable;
	}

	public String getTelresponsable() {
		return telresponsable;
	}

	public void setTelresponsable(String telresponsable) {
		this.telresponsable = telresponsable;
	}

	public Integer getIudregcommerce() {
		return iudregcommerce;
	}

	public void setIudregcommerce(Integer iudregcommerce) {
		this.iudregcommerce = iudregcommerce;
	}

	public String getDateregcommerce() {
		return dateregcommerce;
	}

	public void setDateregcommerce(String dateregcommerce) {
		this.dateregcommerce = dateregcommerce;
	}

	public Integer getIudcontribuable() {
		return iudcontribuable;
	}

	public void setIudcontribuable(Integer iudcontribuable) {
		this.iudcontribuable = iudcontribuable;
	}

	public String getDatecontribuable() {
		return datecontribuable;
	}

	public void setDatecontribuable(String datecontribuable) {
		this.datecontribuable = datecontribuable;
	}

	public Integer getIuddocentjur() {
		return iuddocentjur;
	}

	public void setIuddocentjur(Integer iuddocentjur) {
		this.iuddocentjur = iuddocentjur;
	}

	public String getNumdocentjur() {
		return numdocentjur;
	}

	public void setNumdocentjur(String numdocentjur) {
		this.numdocentjur = numdocentjur;
	}

	public String getDatedocentjur() {
		return datedocentjur;
	}

	public void setDatedocentjur(String datedocentjur) {
		this.datedocentjur = datedocentjur;
	}

	public Integer getIudcertiftransf() {
		return iudcertiftransf;
	}

	public void setIudcertiftransf(Integer iudcertiftransf) {
		this.iudcertiftransf = iudcertiftransf;
	}

	public String getTypeentjur() {
		return typeentjur;
	}

	public void setTypeentjur(String typeentjur) {
		this.typeentjur = typeentjur;
	}

	public Integer getNumcni() {
		return numcni;
	}

	public void setNumcni(Integer numcni) {
		this.numcni = numcni;
	}

	public String getDatecni() {
		return datecni;
	}

	public void setDatecni(String datecni) {
		this.datecni = datecni;
	}

	public String getStatutoperateur() {
		return statutoperateur;
	}

	public void setStatutoperateur(String statutoperateur) {
		this.statutoperateur = statutoperateur;
	}

	public String getNumcertifdomicile() {
		return numcertifdomicile;
	}

	public void setNumcertifdomicile(String numcertifdomicile) {
		this.numcertifdomicile = numcertifdomicile;
	}

	public String getDatecertifdomicile() {
		return datecertifdomicile;
	}

	public void setDatecertifdomicile(String datecertifdomicile) {
		this.datecertifdomicile = datecertifdomicile;
	}

	public Integer getIudcertifdomicile() {
		return iudcertifdomicile;
	}

	public void setIudcertifdomicile(Integer iudcertifdomicile) {
		this.iudcertifdomicile = iudcertifdomicile;
	}

	public String getEmailresponsable() {
		return emailresponsable;
	}

	public void setEmailresponsable(String emailresponsable) {
		this.emailresponsable = emailresponsable;
	}

	public String getTypeentiteminfof() {
		return typeentiteminfof;
	}

	public void setTypeentiteminfof(String typeentiteminfof) {
		this.typeentiteminfof = typeentiteminfof;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCivilte_responsable() {
		return civilte_responsable;
	}

	public void setCivilte_responsable(String civilte_responsable) {
		this.civilte_responsable = civilte_responsable;
	}

	public String getNumacteminfof() {
		return numacteminfof;
	}

	public void setNumacteminfof(String numacteminfof) {
		this.numacteminfof = numacteminfof;
	}

	public String getDateacteminfof() {
		return dateacteminfof;
	}

	public void setDateacteminfof(String dateacteminfof) {
		this.dateacteminfof = dateacteminfof;
	}

	public Integer getIudacteminfof() {
		return iudacteminfof;
	}

	public void setIudacteminfof(Integer iudacteminfof) {
		this.iudacteminfof = iudacteminfof;
	}

	public String getNumrecepissedecla() {
		return numrecepissedecla;
	}

	public void setNumrecepissedecla(String numrecepissedecla) {
		this.numrecepissedecla = numrecepissedecla;
	}

	public String getDaterecepissedecla() {
		return daterecepissedecla;
	}

	public void setDaterecepissedecla(String daterecepissedecla) {
		this.daterecepissedecla = daterecepissedecla;
	}

	public Integer getIudrecepissedecla() {
		return iudrecepissedecla;
	}

	public void setIudrecepissedecla(Integer iudrecepissedecla) {
		this.iudrecepissedecla = iudrecepissedecla;
	}
	
}
	