package com.example.ImpotIS.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ImpotIS.bean.DeclarationISSociete;

@Repository
public interface DeclarationISSocieteDao extends JpaRepository<DeclarationISSociete, Long>{
	
	public DeclarationISSociete findByAnneeAndSocieteIce(int annee,String ice);

}
