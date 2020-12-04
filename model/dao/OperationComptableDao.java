package com.example.ImpotIS.model.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.ImpotIS.bean.CompteComptable;
import com.example.ImpotIS.bean.OperationComptable;
import com.example.ImpotIS.bean.Societe;
@Repository
public interface OperationComptableDao extends JpaRepository<OperationComptable, Long> {
	public List<OperationComptable> findBySociete(Societe societe);

	public List<OperationComptable> findByMontant(float montant);

	public List<OperationComptable> findByLibelle(String libelle);

	public List<OperationComptable> findByDateOperation(Date dateOperation);

	public List<OperationComptable> findByTypeOperationComptableAndCompteComptableAndSocieteAndDateOperation(
			boolean TypeOperationComptable, CompteComptable c, Societe s, Date d);

	public List<OperationComptable> findByCompteComptable(CompteComptable c);

	public List<OperationComptable> findByCompteComptableAndSociete(CompteComptable c, Societe s);

	
	//get the sum of operations 
	@Query(value="SELECT sum(montant) FROM operation_comptable group by societe",nativeQuery=true)
	public List<BigDecimal> sumMontantBySociete();

	
	
	

}
