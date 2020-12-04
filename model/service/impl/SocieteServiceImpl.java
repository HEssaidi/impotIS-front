package com.example.ImpotIS.model.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ImpotIS.bean.Societe;
import com.example.ImpotIS.model.dao.SocieteDao;
import com.example.ImpotIS.model.service.facade.SocieteService;
@Service
public class SocieteServiceImpl implements SocieteService{
	@Autowired 
	private SocieteDao societeDao;

	public Optional<Societe> findById(Long id) {
		return societeDao.findById(id);
	}

	public Societe findByIce(String ice) {
		return societeDao.findByIce(ice);
	}

	public List<Societe> findAll() {
		return societeDao.findAll();
	}

	public Societe save(Societe societe) {
		return societeDao.save(societe);
	}

	public Societe update(Societe societe) {
		return societeDao.save(societe);
	}

	public void deleteById(Long id) {
		societeDao.deleteById(id);
	}
	

}
