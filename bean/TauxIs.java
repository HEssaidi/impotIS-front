package com.example.ImpotIS.bean;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TauxIs {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	private String libelle;
	private Date dateMin;
	private Date dateMax;
	private BigDecimal montantMax;
	private BigDecimal montantMin;
	private BigDecimal  pourcentage;
	private BigDecimal montantRetard;
	
	public Date getDateMin() {
		return dateMin;
	}


	public void setDateMin(Date dateMin) {
		this.dateMin = dateMin;
	}


	public Date getDateMax() {
		return dateMax;
	}


	public void setDateMax(Date dateMax) {
		this.dateMax = dateMax;
	}


	public TauxIs() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public TauxIs(Long id, String libelle, BigDecimal montantMax, BigDecimal montantMin, BigDecimal pourcentage, BigDecimal montantRetard) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.montantMax = montantMax;
		this.montantMin = montantMin;
		this.pourcentage = pourcentage;
		this.montantRetard = montantRetard;
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
	public BigDecimal getMontantMax() {
		return montantMax;
	}
	public void setMontantMax(BigDecimal montantMax) {
		this.montantMax = montantMax;
	}
	public BigDecimal getMontantMin() {
		return montantMin;
	}
	public void setMontantMin(BigDecimal montantMin) {
		this.montantMin = montantMin;
	}
	public BigDecimal getPourcentage() {
		return pourcentage;
	}
	public void setPourcentage(BigDecimal pourcentage) {
		this.pourcentage = pourcentage;
	}
	public BigDecimal getMontantRetard() {
		return montantRetard;
	}
	public void setMontantRetard(BigDecimal montantRetard) {
		this.montantRetard = montantRetard;
	} 
	@Override
	public String toString() {
		return "TauxIs [id=" + id + ", libelle=" + libelle + ", montantMax=" + montantMax + ", montantMin=" + montantMin
				+ ", pourcentage=" + pourcentage + ", montantRetard=" + montantRetard + "]";
	}
	

}
