package com.example.ImpotIS.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CompteComptable {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	private Long code; 
	private String libelle;
	@ManyToOne
	private RubriqueComptable rubriqueComptable;
	
	public CompteComptable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteComptable(Long id, Long code, String libelle, RubriqueComptable rubriqueComptable) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.rubriqueComptable = rubriqueComptable;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public RubriqueComptable getRubriqueComptable() {
		return rubriqueComptable;
	}

	public void setRubriqueComptable(RubriqueComptable rubriqueComptable) {
		this.rubriqueComptable = rubriqueComptable;
	}

	@Override
	public String toString() {
		return "CompteComptable [id=" + id + ", code=" + code + ", libelle=" + libelle + ", rubriqueComptable="
				+ rubriqueComptable + "]";
	} 
	
	
	
	
}
