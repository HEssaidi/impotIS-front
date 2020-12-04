package com.example.ImpotIS.model.service.facade;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ImpotIS.bean.TypeOperationComptable;

@Service
public interface TypeOperationComptableService {
	public Optional<TypeOperationComptable> findById(Long id);
	public TypeOperationComptable findByCode(Long code);
	
	public List<TypeOperationComptable> findAll();
	
	public TypeOperationComptable save(TypeOperationComptable typeOperationComptable);
	
	public void  deleteById(Long id);

}
