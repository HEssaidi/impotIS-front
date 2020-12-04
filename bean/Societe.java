package com.example.ImpotIS.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Societe {
	@Id  //chaque entité doit etre marque avec un @Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String ice;
	private String raisonSocial;
    
	public Societe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Societe(Long id, String ice, String raisonSocial) {
		super();
		this.id = id;
		this.ice = ice;
		this.raisonSocial = raisonSocial;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIce() {
		return ice;
	}

	public void setIce(String ice) {
		this.ice = ice;
	}

	public String getRaisonSocial() {
		return raisonSocial;
	}

	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}

}
