package com.example.ImpotIS.model.service.facade;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ImpotIS.bean.ClasseComptable;
import com.example.ImpotIS.bean.RubriqueComptable;



@Service
public interface RubriqueComptableService {
	public RubriqueComptable findByCode(Long code);
	public Optional<RubriqueComptable> findById(Long id);
	public RubriqueComptable findByLibelle(String libelle);
	public RubriqueComptable findByClasseComptable(ClasseComptable classeComptable);
	
	public List<RubriqueComptable> findAll();
	public void deleteById(Long id);
	public RubriqueComptable save(RubriqueComptable rubriqueComptable);
	
	
	
}
