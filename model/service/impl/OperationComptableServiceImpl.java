package com.example.ImpotIS.model.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ImpotIS.bean.OperationComptable;
import com.example.ImpotIS.bean.Societe;
import com.example.ImpotIS.model.dao.OperationComptableDao;
import com.example.ImpotIS.model.service.facade.OperationComptableService;
@Service
public class OperationComptableServiceImpl implements OperationComptableService{
	@Autowired
	private OperationComptableDao OperationComptableDao;

	public List<OperationComptable> findBySociete(Societe societe) {
		return OperationComptableDao.findBySociete(societe);
	}

	public List<OperationComptable> findByDateOperation(Date dateOperation) {
		return OperationComptableDao.findByDateOperation(dateOperation);
	}

	public OperationComptable  save(OperationComptable operationComptable) {
		return OperationComptableDao.save(operationComptable);
	}

	public Optional<OperationComptable> findById(Long id) {
		return OperationComptableDao.findById(id);
	}

	public void deleteById(Long id) {
		OperationComptableDao.deleteById(id);
	}

	@Override
	public List<BigDecimal> sumMontantBySociete() {
		
		return OperationComptableDao.sumMontantBySociete();
	}
	
}
