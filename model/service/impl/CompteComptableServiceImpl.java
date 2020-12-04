package com.example.ImpotIS.model.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ImpotIS.bean.CompteComptable;
import com.example.ImpotIS.bean.RubriqueComptable;
import com.example.ImpotIS.model.dao.CompteComptableDao;
import com.example.ImpotIS.model.dao.DeclarationISSocieteDao;
import com.example.ImpotIS.model.service.facade.CompteComptableService;

@Service
public class CompteComptableServiceImpl implements CompteComptableService{
	@Autowired
	private  CompteComptableDao  CompteComptableDao;

	public List<CompteComptable> findAll() {
		return CompteComptableDao.findAll();
	}

	public CompteComptable findByCode(Long code) {
		return CompteComptableDao.findByCode(code);
	}

	public CompteComptable findByLibelle(String libelle) {
		return CompteComptableDao.findByLibelle(libelle);
	}

	public CompteComptable findByRubriqueComptable(RubriqueComptable rubriqueComptable) {
		return CompteComptableDao.findByRubriqueComptable(rubriqueComptable);
	}

	public CompteComptable findByRubriqueComptableAndCode(RubriqueComptable rubriqueComptable, Long code) {
		return CompteComptableDao.findByRubriqueComptableAndCode(rubriqueComptable, code);
	}

	public CompteComptable save(CompteComptable compteComptable) {
		return CompteComptableDao.save(compteComptable);
	}

	public Optional<CompteComptable> findById(Long id) {
		return CompteComptableDao.findById(id);
	}

	public void deleteById(Long id) {
		CompteComptableDao.deleteById(id);
	}

	

}
