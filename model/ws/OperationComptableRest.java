package com.example.ImpotIS.model.ws;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ImpotIS.bean.OperationComptable;
import com.example.ImpotIS.bean.Societe;
import com.example.ImpotIS.model.service.facade.OperationComptableService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("impotIS-api/operations")
public class OperationComptableRest {
	@Autowired
	private OperationComptableService operationComptableService;
	@GetMapping("/")
	public List<BigDecimal> sumMontantBySociete() {
		return operationComptableService.sumMontantBySociete();
	}
	@GetMapping("/societe/{societe}")
	public List<OperationComptable> findBySociete(@RequestBody Societe societe) {
		return operationComptableService.findBySociete(societe);
	}
	@GetMapping("/dateOperation/{dateOperation}")
	public List<OperationComptable> findByDateOperation(@PathVariable Date dateOperation) {
		return operationComptableService.findByDateOperation(dateOperation);
	}
	@PostMapping("/")
	public OperationComptable save(@RequestBody OperationComptable operationComptable) {
		return operationComptableService.save(operationComptable);
	}
	@GetMapping("/id/{id}")
	public Optional<OperationComptable> findById(@PathVariable Long id) {
		return operationComptableService.findById(id);
	}
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id) {
		operationComptableService.deleteById(id);
	}
}
