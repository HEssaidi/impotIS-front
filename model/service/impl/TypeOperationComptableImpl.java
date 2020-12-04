package com.example.ImpotIS.model.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ImpotIS.bean.TypeOperationComptable;
import com.example.ImpotIS.model.dao.TypeOperationComptableDao;
import com.example.ImpotIS.model.service.facade.TypeOperationComptableService;
@Service
public class TypeOperationComptableImpl implements TypeOperationComptableService{
	@Autowired
	private TypeOperationComptableDao typeOperationComptableDao;

	public TypeOperationComptable findByCode(Long code) {
		return typeOperationComptableDao.findByCode(code);
	}

	public TypeOperationComptable save(TypeOperationComptable typeOperationComptable) {
		return typeOperationComptableDao.save(typeOperationComptable);
	}

	public List<TypeOperationComptable> findAll() {
		return typeOperationComptableDao.findAll();
	}

	public Optional<TypeOperationComptable> findById(Long id) {
		return typeOperationComptableDao.findById(id);
	}

	public void deleteById(Long id) {
		typeOperationComptableDao.deleteById(id);
	}

	
}
