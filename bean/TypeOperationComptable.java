package com.example.ImpotIS.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypeOperationComptable {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Long code; 
	private String libelle;
	
	public TypeOperationComptable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypeOperationComptable(Long id, Long code, String libelle) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;//debit or credit
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
	@Override
	public String toString() {
		return "ClasseComptable [id=" + id + ", code=" + code + ", libelle=" + libelle + "]";
	} 
	
	

}
