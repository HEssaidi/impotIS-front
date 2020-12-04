package com.example.ImpotIS.model.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ImpotIS.bean.ClasseComptable;
import com.example.ImpotIS.model.dao.ClasseComptableDao;
import com.example.ImpotIS.model.service.facade.ClasseComptableService;
@Service
public class ClasseComptableServiceImpl implements ClasseComptableService{
	@Autowired
	private  ClasseComptableDao  classeComptableDao;

	public List<ClasseComptable> findByLibelle(String libelle) {
		return classeComptableDao.findByLibelle(libelle);
	}

	public List<ClasseComptable> findByCode(Long code) {
		return classeComptableDao.findByCode(code);
	}

	public ClasseComptable save(ClasseComptable classeComptable) {
		return classeComptableDao.save(classeComptable);
	}

	public List<ClasseComptable> findAll() {
		return classeComptableDao.findAll();
	}

	public Optional<ClasseComptable> findById(Long id) {
		return classeComptableDao.findById(id);
	}

	public void deleteById(Long id) {
		classeComptableDao.deleteById(id);
	}

	
}
