package com.example.ImpotIS.model.service.facade;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.example.ImpotIS.bean.CompteComptable;
import com.example.ImpotIS.bean.RubriqueComptable;

@Service
public interface CompteComptableService {
	public CompteComptable findByCode(Long code);
	public Optional<CompteComptable> findById(Long id);
	public List<CompteComptable> findAll();
	public CompteComptable findByLibelle(String libelle);
	public CompteComptable findByRubriqueComptable(RubriqueComptable rubriqueComptable);
	public CompteComptable findByRubriqueComptableAndCode(RubriqueComptable rubriqueComptable, Long code);
	public void deleteById (Long id);
	public CompteComptable save (CompteComptable  compteComptable);
	

}
