package com.example.ImpotIS.model.ws;

import java.math.BigDecimal;
import java.time.LocalDate;
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

import com.example.ImpotIS.bean.DeclarationISSociete;
import com.example.ImpotIS.model.service.facade.DeclarationISSocieteService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("impotIS-api/declarationIS")
public class DeclarationISSocieteRest {
	@Autowired
	private DeclarationISSocieteService declarationISSocieteService;
	
	/*@PostMapping("/annee/{annee}/CA/{CA}/charges/{charges}/ice/{ice}/datedec/{datedec}") 
	public int saveCalcul(int annee, BigDecimal CA, BigDecimal charges, String ice, LocalDate datedec) {
		return declarationISSocieteService.saveCalcul(annee, CA, charges, ice, datedec);
	}*/
	
	@GetMapping("/annee/{annee}/ice/{ice}") 
	public DeclarationISSociete findByAnneeAndSocieteIce(@PathVariable int annee,@PathVariable String ice) {
		return declarationISSocieteService.findByAnneeAndSocieteIce(annee, ice);
	}
	@GetMapping("/benifice") /////////////
	public void calculerBenfice(@RequestBody DeclarationISSociete declarationISSociete) {
		 declarationISSocieteService.calculerBenfice(declarationISSociete);
	}
	/*@GetMapping("/CA/{CA}/charges/{charges}") /////////////
	public void calculerBenfice(@PathVariable BigDecimal CA, @PathVariable BigDecimal charges) {
		 declarationISSocieteService.calculerBenfice(CA,charges);
	}*/
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id) {
		declarationISSocieteService.deleteById(id);
	}
	@PostMapping("/")
	public int saveT(@RequestBody DeclarationISSociete declarationISSociete) {
		return declarationISSocieteService.saveT(declarationISSociete); 
	}
	@GetMapping("/")
	public List<DeclarationISSociete> findAll() {
		return declarationISSocieteService.findAll();
	}
	@GetMapping("/id/{id}")
	public Optional<DeclarationISSociete> findById(@PathVariable Long id) {
		return declarationISSocieteService.findById(id);
	}

}
