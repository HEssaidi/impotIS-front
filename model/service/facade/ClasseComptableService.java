package com.example.ImpotIS.model.service.facade;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ImpotIS.bean.ClasseComptable;
@Service
public interface ClasseComptableService {
	public Optional<ClasseComptable> findById(Long id);
	public List<ClasseComptable> findByLibelle(String libelle);
	public List<ClasseComptable> findByCode(Long code);
	public List<ClasseComptable> findAll();
	public ClasseComptable save(ClasseComptable classeComptable);
	public void deleteById(Long id);
	

}
