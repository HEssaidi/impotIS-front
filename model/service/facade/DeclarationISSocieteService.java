package com.example.ImpotIS.model.service.facade;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ImpotIS.bean.DeclarationISSociete;
@Service
public interface DeclarationISSocieteService {
	public void deleteById(Long id);
	public DeclarationISSociete save(DeclarationISSociete declarationISSociete);
	public int saveT(DeclarationISSociete declarationISSociete);
	//public int saveCalcul(int annee,BigDecimal CA, BigDecimal charges, String ice, LocalDate datedec);
	public List<DeclarationISSociete> findAll();
	public Optional<DeclarationISSociete> findById(Long id);
	public DeclarationISSociete findByAnneeAndSocieteIce(int annee,String ice) ;
	//BigDecimal calculerBenfice(BigDecimal CA,BigDecimal charges);
	 void calculerBenfice(DeclarationISSociete declarationISSociete);
	

	
	

}
