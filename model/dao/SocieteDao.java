package com.example.ImpotIS.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ImpotIS.bean.Societe;

@Repository
public interface SocieteDao extends JpaRepository<Societe,Long>{
	public Societe findByIce(String ice);
	

}
