package com.example.ImpotIS.model.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ImpotIS.bean.ClasseComptable;
import com.example.ImpotIS.bean.RubriqueComptable;
import com.example.ImpotIS.model.dao.RubriqueComptableDao;
import com.example.ImpotIS.model.service.facade.RubriqueComptableService;
@Service
public class RubriqueComptableServiceImpl implements RubriqueComptableService{
	@Autowired
	private RubriqueComptableDao rubriqueComptableDao;

	public List<RubriqueComptable> findAll() {
		return rubriqueComptableDao.findAll();
	}

	public RubriqueComptable findByCode(Long code) {
		return rubriqueComptableDao.findByCode(code);
	}

	public RubriqueComptable findByLibelle(String libelle) {
		return rubriqueComptableDao.findByLibelle(libelle);
	}

	public RubriqueComptable findByClasseComptable(ClasseComptable classeComptable) {
		return rubriqueComptableDao.findByClasseComptable(classeComptable);
	}

	public RubriqueComptable save(RubriqueComptable rubriqueComptable) {
		return rubriqueComptableDao.save(rubriqueComptable);
	}

	public Optional<RubriqueComptable> findById(Long id) {
		return rubriqueComptableDao.findById(id);
	}

	public void deleteById(Long id) {
		rubriqueComptableDao.deleteById(id);
	}



}
