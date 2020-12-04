package com.example.ImpotIS.model.ws;

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

import com.example.ImpotIS.bean.CompteComptable;
import com.example.ImpotIS.bean.RubriqueComptable;
import com.example.ImpotIS.model.service.facade.CompteComptableService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("impotIS-api/compteComptable")
public class CompteComptableRest {
	@Autowired
	private CompteComptableService compteComptableService;
	@GetMapping("/code/{code}")
	public CompteComptable findByCode(@PathVariable Long code) {
		return compteComptableService.findByCode(code);
	}
	@GetMapping("/id/{id}")
	public Optional<CompteComptable> findById(@PathVariable Long id) {
		return compteComptableService.findById(id);
	}
	@GetMapping("/")
	public List<CompteComptable> findAll() {
		return compteComptableService.findAll();
	}
	@GetMapping("/libelle/{libelle}")
	public CompteComptable findByLibelle(@PathVariable String libelle) {
		return compteComptableService.findByLibelle(libelle);
	}
	@GetMapping("/rubriqueComptable/{rubriqueComptable}")
	public CompteComptable findByRubriqueComptable(@RequestBody RubriqueComptable rubriqueComptable) {
		return compteComptableService.findByRubriqueComptable(rubriqueComptable);
	}
	@GetMapping("/rubriqueComptable/{rubriqueComptable}/code/{code}")
	public CompteComptable findByRubriqueComptableAndCode(@RequestBody RubriqueComptable rubriqueComptable, @PathVariable Long code) {
		return compteComptableService.findByRubriqueComptableAndCode(rubriqueComptable, code);
	}
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id) {
		compteComptableService.deleteById(id);
	}
	@PostMapping("/")
	public CompteComptable save(@RequestBody CompteComptable compteComptable) {
		return compteComptableService.save(compteComptable);
	}
}
