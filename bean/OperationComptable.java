package com.example.ImpotIS.bean;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OperationComptable {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	private String libelle;
	@ManyToOne
	private TypeOperationComptable typeOperationComptable;//0 ou 1
	private BigDecimal montant;
	private Date dateOperation;
	@ManyToOne
	private CompteComptable compteComptable;
	@ManyToOne
	private Societe societe;
	
	public OperationComptable(Long id, String libelle, TypeOperationComptable typeOperationComptable, BigDecimal montant, Date dateOperation,
			CompteComptable compteComptable, Societe societe) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.typeOperationComptable = typeOperationComptable;
		this.montant = montant;
		this.dateOperation = dateOperation;
		this.compteComptable = compteComptable;
		this.societe = societe;
	}
	public OperationComptable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public TypeOperationComptable getTypeOperationComptable() {
		return typeOperationComptable;
	}
	public void setTypeOperationComptable(TypeOperationComptable typeOperationComptable) {
		this.typeOperationComptable = typeOperationComptable;
	}
	public BigDecimal getMontant() {
		return montant;
	}
	public void setMontant(BigDecimal montant) {
		this.montant = montant;
	}
	public Date getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}
	public CompteComptable getCompteComptable() {
		return compteComptable;
	}
	public void setCompteComptable(CompteComptable compteComptable) {
		this.compteComptable = compteComptable;
	}
	public Societe getSociete() {
		return societe;
	}
	public void setSociete(Societe societe) {
		this.societe = societe;
	}
	@Override
	public String toString() {
		return "OperationComptable [id=" + id + ", libelle=" + libelle + ", typeOperationComptable="
				+ typeOperationComptable + ", montant=" + montant + ", dateOperation=" + dateOperation
				+ ", compteComptable=" + compteComptable + ", societe=" + societe + "]";
	} 
	
	
	//calcul des montants des ops
	/*public BigDecimal calculMontantOps(Societe societe) {
		BigDecimal montant=0;
		montant+=
		return montant;
		
	}*/
	
	
}
