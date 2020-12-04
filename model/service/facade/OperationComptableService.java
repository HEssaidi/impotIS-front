package com.example.ImpotIS.model.service.facade;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ImpotIS.bean.OperationComptable;
import com.example.ImpotIS.bean.Societe;

@Service
public interface OperationComptableService {
	public List<BigDecimal> sumMontantBySociete();
	public List<OperationComptable> findBySociete(Societe societe);
	public List<OperationComptable> findByDateOperation(Date dateOperation);
	public OperationComptable  save(OperationComptable operationComptable);
	public Optional<OperationComptable> findById(Long id);
	public void deleteById(Long id);
}
