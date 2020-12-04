package com.example.ImpotIS.model.service.facade;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ImpotIS.bean.Societe;
@Service
public interface SocieteService {
	public Optional<Societe> findById(Long id);
	public Societe findByIce(String ice);

	public List<Societe> findAll();
	public Societe save(Societe societe);
	
	public Societe update(Societe societe);
	
	public void  deleteById(Long id);

}
