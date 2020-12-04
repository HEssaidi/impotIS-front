package com.example.ImpotIS.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ImpotIS.bean.ClasseComptable;
@Repository
public interface ClasseComptableDao extends JpaRepository<ClasseComptable, Long>{
	public List<ClasseComptable> findByLibelle(String libelle);
	public List<ClasseComptable> findByCode(Long code);

}
