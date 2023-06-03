package modeles;

import java.sql.Date;
import java.util.Objects;

public class ValeurFOB {
	
	private Integer idvaleurfob;
	
	private Integer idessence;
	
	private Date dateeffet;
	
	private Integer valeurzone1;
	
	private Integer valeurzone2;
	
	private Integer valeurzone3;
	
	private Date datecrea;
	
	private Date dateupda;
	
	private String usercrea;
	
	private String userupda;
	
	private Date datevalidite;
	
	private String refarrete;
	
	private Integer iudcopie;
	
	public ValeurFOB(Integer idvaleurfob, Integer idessence, Date dateeffet, Integer valeurzone1, Integer valeurzone2,
			Integer valeurzone3, Date datecrea, Date dateupda, String usercrea, String userupda, Date datevalidite,
			String refarrete, Integer iudcopie, Integer idarrete_fob, Integer idzone, Integer valeurzone4,
			Integer valeurzone5, Integer valeurzone6, Integer valeurzone7, Integer valeurzone8, Integer valeurzone9,
			Integer valeurzone10, Integer valeurzone11, Integer valeurzone12, Integer valeurzone13,
			Integer valeurzone14, Integer valeurzone15, Integer valeurzone16, Integer valeurzone17,
			Integer valeurzone18, Integer valeurzone19, Integer valeurzone20) {
		super();
		this.idvaleurfob = idvaleurfob;
		this.idessence = idessence;
		this.dateeffet = dateeffet;
		this.valeurzone1 = valeurzone1;
		this.valeurzone2 = valeurzone2;
		this.valeurzone3 = valeurzone3;
		this.datecrea = datecrea;
		this.dateupda = dateupda;
		this.usercrea = usercrea;
		this.userupda = userupda;
		this.datevalidite = datevalidite;
		this.refarrete = refarrete;
		this.iudcopie = iudcopie;
		this.idarrete_fob = idarrete_fob;
		this.idzone = idzone;
		this.valeurzone4 = valeurzone4;
		this.valeurzone5 = valeurzone5;
		this.valeurzone6 = valeurzone6;
		this.valeurzone7 = valeurzone7;
		this.valeurzone8 = valeurzone8;
		this.valeurzone9 = valeurzone9;
		this.valeurzone10 = valeurzone10;
		this.valeurzone11 = valeurzone11;
		this.valeurzone12 = valeurzone12;
		this.valeurzone13 = valeurzone13;
		this.valeurzone14 = valeurzone14;
		this.valeurzone15 = valeurzone15;
		this.valeurzone16 = valeurzone16;
		this.valeurzone17 = valeurzone17;
		this.valeurzone18 = valeurzone18;
		this.valeurzone19 = valeurzone19;
		this.valeurzone20 = valeurzone20;
	}

	@Override
	public int hashCode() {
		return Objects.hash(datecrea, dateeffet, dateupda, datevalidite, idarrete_fob, idessence, idvaleurfob, idzone,
				iudcopie, refarrete, usercrea, userupda, valeurzone1, valeurzone10, valeurzone11, valeurzone12,
				valeurzone13, valeurzone14, valeurzone15, valeurzone16, valeurzone17, valeurzone18, valeurzone19,
				valeurzone2, valeurzone20, valeurzone3, valeurzone4, valeurzone5, valeurzone6, valeurzone7, valeurzone8,
				valeurzone9);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ValeurFOB other = (ValeurFOB) obj;
		return Objects.equals(datecrea, other.datecrea) && Objects.equals(dateeffet, other.dateeffet)
				&& Objects.equals(dateupda, other.dateupda) && Objects.equals(datevalidite, other.datevalidite)
				&& Objects.equals(idarrete_fob, other.idarrete_fob) && Objects.equals(idessence, other.idessence)
				&& Objects.equals(idvaleurfob, other.idvaleurfob) && Objects.equals(idzone, other.idzone)
				&& Objects.equals(iudcopie, other.iudcopie) && Objects.equals(refarrete, other.refarrete)
				&& Objects.equals(usercrea, other.usercrea) && Objects.equals(userupda, other.userupda)
				&& Objects.equals(valeurzone1, other.valeurzone1) && Objects.equals(valeurzone10, other.valeurzone10)
				&& Objects.equals(valeurzone11, other.valeurzone11) && Objects.equals(valeurzone12, other.valeurzone12)
				&& Objects.equals(valeurzone13, other.valeurzone13) && Objects.equals(valeurzone14, other.valeurzone14)
				&& Objects.equals(valeurzone15, other.valeurzone15) && Objects.equals(valeurzone16, other.valeurzone16)
				&& Objects.equals(valeurzone17, other.valeurzone17) && Objects.equals(valeurzone18, other.valeurzone18)
				&& Objects.equals(valeurzone19, other.valeurzone19) && Objects.equals(valeurzone2, other.valeurzone2)
				&& Objects.equals(valeurzone20, other.valeurzone20) && Objects.equals(valeurzone3, other.valeurzone3)
				&& Objects.equals(valeurzone4, other.valeurzone4) && Objects.equals(valeurzone5, other.valeurzone5)
				&& Objects.equals(valeurzone6, other.valeurzone6) && Objects.equals(valeurzone7, other.valeurzone7)
				&& Objects.equals(valeurzone8, other.valeurzone8) && Objects.equals(valeurzone9, other.valeurzone9);
	}

	public ValeurFOB() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Integer idarrete_fob;
	
	private Integer idzone;
	
	private Integer valeurzone4;
	
	private Integer valeurzone5;
	
	private Integer valeurzone6;
	
	private Integer valeurzone7;
	
	private Integer valeurzone8;
	
	private Integer valeurzone9;
	
	private Integer valeurzone10;
	
	private Integer valeurzone11;
	
	private Integer valeurzone12;
	
	private Integer valeurzone13;
	
	private Integer valeurzone14;
	
	private Integer valeurzone15;
	
	private Integer valeurzone16;
	
	private Integer valeurzone17;
	
	private Integer valeurzone18;
	
	private Integer valeurzone19;
	
	private Integer valeurzone20;

}
