package com.example.ImpotIS.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ImpotIS.bean.CompteComptable;
import com.example.ImpotIS.bean.RubriqueComptable;

@Repository
public interface CompteComptableDao extends JpaRepository<CompteComptable, Long>{
	public CompteComptable findByCode(Long code);
	public CompteComptable findByLibelle(String libelle);
	public CompteComptable findByRubriqueComptable(RubriqueComptable rubriqueComptable);
	public CompteComptable findByRubriqueComptableAndCode(RubriqueComptable rubriqueComptable, Long code);

}
