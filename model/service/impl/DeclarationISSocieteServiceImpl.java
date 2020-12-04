package com.example.ImpotIS.model.service.impl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ImpotIS.bean.DeclarationISSociete;
import com.example.ImpotIS.bean.TauxIs;
import com.example.ImpotIS.model.dao.DeclarationISSocieteDao;
import com.example.ImpotIS.model.service.facade.DeclarationISSocieteService;
import com.example.ImpotIS.model.service.facade.TauxIsService;
import com.example.ImpotIS.model.service.util.DateUtil;

@Service
public class DeclarationISSocieteServiceImpl implements DeclarationISSocieteService {
	@Autowired
	private DeclarationISSocieteDao declarationISSocieteDao;
	@Autowired
	private TauxIsService tauxIsService;

	public void deleteById(Long id) {
		declarationISSocieteDao.deleteById(id);
	}

	public List<DeclarationISSociete> findAll() {
		return declarationISSocieteDao.findAll();
	}

	public Optional<DeclarationISSociete> findById(Long id) {
		return declarationISSocieteDao.findById(id);
	}

	public int saveT(DeclarationISSociete declarationISSociete) {
		System.out.println("hellooooooo");
		if (declarationISSociete==null) {
			System.out.println("helo2154");
			return 14;
		}
		DeclarationISSociete loadedDeclarationISSociete = findByAnneeAndSocieteIce(declarationISSociete.getAnnee(),
				declarationISSociete.getSociete().getIce());
		System.out.println("loaded object "+loadedDeclarationISSociete);
		if (loadedDeclarationISSociete != null) {
			return -2;
		}
		calculerBenfice(declarationISSociete);
		System.out.println(declarationISSociete.getBenifice());
		TauxIs tauxIs = tauxIsService.findTauxPrct(declarationISSociete.getBenifice());
		if (tauxIs == null) {
			return -3;
		} else {
			declarationISSociete.setTauxIs(tauxIs);
			System.out.println("after setting taux IS"+declarationISSociete.getTauxIs());
			calculerMontantBase(declarationISSociete);
			calculerMontantEtMoisRetard(declarationISSociete);
			//declarationISSociete.setMontantTotal(
					//declarationISSociete.getMontantBaseIs().add(declarationISSociete.getMontantRetard()));
			save(declarationISSociete);
			System.out.println("after saving the dec"); //we need another save method
			return 12;
		}

	}

	/*
	 * public int saveCalcul(int annee,BigDecimal CA, BigDecimal charges, String
	 * ice, LocalDate datedec) { DeclarationISSociete
	 * loadedDeclarationISSociete=findByAnneeAndSocieteIce(annee,ice);
	 * if(loadedDeclarationISSociete!=null) { return -1; } BigDecimal benifice=
	 * calculerBenfice(CA,charges); TauxIs
	 * tauxIs=tauxIsService.findTauxPrct(benifice); if(tauxIs==null) { return -2; }
	 * else { loadedDeclarationISSociete.setTauxIs(tauxIs);
	 * calculerMontantBase(loadedDeclarationISSociete);
	 * calculerMontantEtMoisRetard(loadedDeclarationISSociete);
	 * loadedDeclarationISSociete.setMontantTotal(loadedDeclarationISSociete.
	 * getMontantBaseIs().add(loadedDeclarationISSociete.getMontantRetard()));
	 * save(loadedDeclarationISSociete); return 1; }
	 * 
	 * }
	 */

	@Override
	public void calculerBenfice(DeclarationISSociete declarationISSociete) {
		BigDecimal benifice = declarationISSociete.getChiffreAffaire().subtract(declarationISSociete.getTotalCharges());
		//System.out.println(benifice);
		declarationISSociete.setBenifice(benifice);
		System.out.println("after setting benifice"+benifice);
	}
	/*
	 * @Override public BigDecimal calculerBenfice(BigDecimal CA,BigDecimal charges)
	 * { return CA.subtract(charges); }
	 */

	private void calculerMontantEtMoisRetard(DeclarationISSociete declarationISSociete) {
		LocalDate dateRetard = DateUtil.constructDateDeclaration(declarationISSociete.getAnnee());
		int moisRetard = DateUtil.diffMois(declarationISSociete.getDateDeclarationIs(), dateRetard);
		System.out.println("mois de retard "+moisRetard);
		BigDecimal montantRetard = declarationISSociete.getTauxIs().getMontantRetard()
				.multiply(BigDecimal.valueOf(moisRetard));
		System.out.println("montant retard "+montantRetard);
		declarationISSociete.setMontantRetard(montantRetard);
		System.out.println("set montant retard "+declarationISSociete.getMontantRetard());
		declarationISSociete
				.setMontantTotal(declarationISSociete.getMontantBaseIs().add(declarationISSociete.getMontantRetard()));
		System.out.println("montant final "+declarationISSociete.getMontantTotal());

	}

	private void calculerMontantBase(DeclarationISSociete declarationISSociete) {
		System.out.println("getting perct"+declarationISSociete.getTauxIs().getPourcentage());
		BigDecimal montantBaseIs = declarationISSociete.getBenifice()
				.multiply(declarationISSociete.getTauxIs().getPourcentage());
		declarationISSociete.setMontantBaseIs(montantBaseIs);
		System.out.println("setting MT Base IS"+declarationISSociete.getMontantBaseIs());
	}

	@Override
	public DeclarationISSociete findByAnneeAndSocieteIce(int annee, String ice) {
		return declarationISSocieteDao.findByAnneeAndSocieteIce(annee, ice);
	}

	@Override
	public DeclarationISSociete save(DeclarationISSociete declarationISSociete) {
		// TODO Auto-generated method stub
		return declarationISSocieteDao.save(declarationISSociete);
	}

	/*
	 * @Override public void save(DeclarationISSociete declarationISSociete) {
	 * declarationISSocieteDao.save(declarationISSociete); }
	 */

}
