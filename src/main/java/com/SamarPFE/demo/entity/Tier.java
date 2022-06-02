package com.SamarPFE.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tier 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(nullable = false)

	private int NbrPeriodeImpayes;
	@Column(nullable = false)

	private int age;
	@Column(nullable = false)

	private int anciennete;
	@Column(nullable = false)

	private int codeAgence;
	@Column(nullable = false)

	private String codeDirection;
	@Column(nullable = false)

	private String dureeSommeil;
	@Column(nullable = false)

	private String employeurClient;
	@Column(nullable = false)

	private int enoursFinPeriode;
	@Column(nullable = false)

	private String etatCivil;
	@Column(nullable = false)

	private int impayeFinPeriode;
	@Column(nullable = false)

	private float maxCredit;
	@Column(nullable = false)

	private float minCredit;
	@Column(nullable = false)

	private float mouvementDebitMoyenne;
	@Column(nullable = false)

	private int nbrAbonnements;
	@Column(nullable = false)

	private int nbrComptesOuverts;
	@Column(nullable = false)

	private int nbrEngagementFinis;
	@Column(nullable = false)

	private int nbrMouvementCredit;
	@Column(nullable = false)

	private int nbrMouvementDebit;
	@Column(nullable = false)

	private float revenuMensuel;
	@Column(nullable = false)

	private String riskClass;
	@Column(nullable = false)

	private String segment;
	@Column(nullable = false)

	private String sexe;
	@Column(nullable = false)

	private String situationContractuelle;
	@Column(nullable = false)

	
	
	
	private float soldeMoyenMensuel;
	public Tier() {
		super();
	}
	public Tier(int id, int nbrPeriodeImpayes, int age, int anciennete, int codeAgence, String codeDirection,
			String dureeSommeil, String employeurClient, int enoursFinPeriode, String etatCivil, int impayeFinPeriode,
			float maxCredit, float minCredit, float mouvementDebitMoyenne, int nbrAbonnements, int nbrComptesOuverts,
			int nbrEngagementFinis, int nbrMouvementCredit, int nbrMouvementDebit, float revenuMensuel,
			String riskClass, String segment, String sexe, String situationContractuelle, float soldeMoyenMensuel) {
		super();
		this.id = id;
		NbrPeriodeImpayes = nbrPeriodeImpayes;
		this.age = age;
		this.anciennete = anciennete;
		this.codeAgence = codeAgence;
		this.codeDirection = codeDirection;
		this.dureeSommeil = dureeSommeil;
		this.employeurClient = employeurClient;
		this.enoursFinPeriode = enoursFinPeriode;
		this.etatCivil = etatCivil;
		this.impayeFinPeriode = impayeFinPeriode;
		this.maxCredit = maxCredit;
		this.minCredit = minCredit;
		this.mouvementDebitMoyenne = mouvementDebitMoyenne;
		this.nbrAbonnements = nbrAbonnements;
		this.nbrComptesOuverts = nbrComptesOuverts;
		this.nbrEngagementFinis = nbrEngagementFinis;
		this.nbrMouvementCredit = nbrMouvementCredit;
		this.nbrMouvementDebit = nbrMouvementDebit;
		this.revenuMensuel = revenuMensuel;
		this.riskClass = riskClass;
		this.segment = segment;
		this.sexe = sexe;
		this.situationContractuelle = situationContractuelle;
		this.soldeMoyenMensuel = soldeMoyenMensuel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNbrPeriodeImpayes() {
		return NbrPeriodeImpayes;
	}
	public void setNbrPeriodeImpayes(int nbrPeriodeImpayes) {
		NbrPeriodeImpayes = nbrPeriodeImpayes;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAnciennete() {
		return anciennete;
	}
	public void setAnciennete(int anciennete) {
		this.anciennete = anciennete;
	}
	public int getCodeAgence() {
		return codeAgence;
	}
	public void setCodeAgence(int codeAgence) {
		this.codeAgence = codeAgence;
	}
	
	public String getCodeDirection() {
		return codeDirection;
	}
	public void setCodeDirection(String codeDirection) {
		this.codeDirection = codeDirection;
	}
	public String getDureeSommeil() {
		return dureeSommeil;
	}
	public void setDureeSommeil(String dureeSommeil) {
		this.dureeSommeil = dureeSommeil;
	}
	public String getEmployeurClient() {
		return employeurClient;
	}
	public void setEmployeurClient(String employeurClient) {
		this.employeurClient = employeurClient;
	}
	public int getEnoursFinPeriode() {
		return enoursFinPeriode;
	}
	public void setEnoursFinPeriode(int enoursFinPeriode) {
		this.enoursFinPeriode = enoursFinPeriode;
	}
	public String getEtatCivil() {
		return etatCivil;
	}
	public void setEtatCivil(String etatCivil) {
		this.etatCivil = etatCivil;
	}
	public int getImpayeFinPeriode() {
		return impayeFinPeriode;
	}
	public void setImpayeFinPeriode(int impayeFinPeriode) {
		this.impayeFinPeriode = impayeFinPeriode;
	}
	public float getMaxCredit() {
		return maxCredit;
	}
	public void setMaxCredit(float maxCredit) {
		this.maxCredit = maxCredit;
	}
	public float getMinCredit() {
		return minCredit;
	}
	public void setMinCredit(float minCredit) {
		this.minCredit = minCredit;
	}
	public float getMouvementDebitMoyenne() {
		return mouvementDebitMoyenne;
	}
	public void setMouvementDebitMoyenne(float mouvementDebitMoyenne) {
		this.mouvementDebitMoyenne = mouvementDebitMoyenne;
	}
	public int getNbrAbonnements() {
		return nbrAbonnements;
	}
	public void setNbrAbonnements(int nbrAbonnements) {
		this.nbrAbonnements = nbrAbonnements;
	}
	public int getNbrComptesOuverts() {
		return nbrComptesOuverts;
	}
	public void setNbrComptesOuverts(int nbrComptesOuverts) {
		this.nbrComptesOuverts = nbrComptesOuverts;
	}
	public int getNbrEngagementFinis() {
		return nbrEngagementFinis;
	}
	public void setNbrEngagementFinis(int nbrEngagementFinis) {
		this.nbrEngagementFinis = nbrEngagementFinis;
	}
	public int getNbrMouvementCredit() {
		return nbrMouvementCredit;
	}
	public void setNbrMouvementCredit(int nbrMouvementCredit) {
		this.nbrMouvementCredit = nbrMouvementCredit;
	}
	public int getNbrMouvementDebit() {
		return nbrMouvementDebit;
	}
	public void setNbrMouvementDebit(int nbrMouvementDebit) {
		this.nbrMouvementDebit = nbrMouvementDebit;
	}
	public float getRevenuMensuel() {
		return revenuMensuel;
	}
	public void setRevenuMensuel(float revenuMensuel) {
		this.revenuMensuel = revenuMensuel;
	}
	public String getRiskClass() {
		return riskClass;
	}
	public void setRiskClass(String riskClass) {
		this.riskClass = riskClass;
	}
	public String getSegment() {
		return segment;
	}
	public void setSegment(String segment) {
		this.segment = segment;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getSituationContractuelle() {
		return situationContractuelle;
	}
	public void setSituationContractuelle(String situationContractuelle) {
		this.situationContractuelle = situationContractuelle;
	}
	public float getSoldeMoyenMensuel() {
		return soldeMoyenMensuel;
	}
	public void setSoldeMoyenMensuel(float soldeMoyenMensuel) {
		this.soldeMoyenMensuel = soldeMoyenMensuel;
	}
	
	
	
}
