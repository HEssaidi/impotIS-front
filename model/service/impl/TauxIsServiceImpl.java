package com.example.ImpotIS.model.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ImpotIS.bean.TauxIs;
import com.example.ImpotIS.model.dao.TauxIsDao;
import com.example.ImpotIS.model.service.facade.TauxIsService;
@Service
public class TauxIsServiceImpl implements TauxIsService {
	@Autowired
	private TauxIsDao tauxIsDao;

	public TauxIs findByMontantMaxAndMontantMin(Float montantMax, Float montantMin) {
		return tauxIsDao.findByMontantMaxAndMontantMin(montantMax, montantMin);
	}

	public TauxIs findByLibelle(String libelle) {
		return tauxIsDao.findByLibelle(libelle);
	}

	public TauxIs findByPourcentage(Float pourcentage) {
		return tauxIsDao.findByPourcentage(pourcentage);
	}

	public TauxIs save(TauxIs tauxIs) {
		 return tauxIsDao.save(tauxIs);
	}

	public List<TauxIs> findAll() {
		return tauxIsDao.findAll();
	}

	public Optional<TauxIs> findById(Long id) {
		return tauxIsDao.findById(id);
	}

	public void deleteById(Long id) {
		tauxIsDao.deleteById(id);
	}
	
	/*public TauxIs pourcentageIS(Long id, BigDecimal benifice) {
		TauxIs tauxIs = findById(id);
		BigDecimal min = tauxIs.getMontantMin();
		BigDecimal max = tauxIs.getMontantMax();
		if (benifice<=max &&  benifice>=min) {
			
		}
		
	}*/

	@Override
	public TauxIs findTauxPrct(BigDecimal benifice) {
		return  tauxIsDao.findTauxPrct(benifice);
	}
}
