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

import com.example.ImpotIS.bean.ClasseComptable;
import com.example.ImpotIS.bean.RubriqueComptable;
import com.example.ImpotIS.model.service.facade.RubriqueComptableService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("impotIS-api/rubriqueComptable")
public class RubriqueComptableRest {
	@Autowired
	private RubriqueComptableService rubriqueComptableService;
	@GetMapping("/code/{code}")
	public RubriqueComptable findByCode(@PathVariable Long code) {
		return rubriqueComptableService.findByCode(code);
	}
	@GetMapping("/id/{id}")
	public Optional<RubriqueComptable> findById(@PathVariable Long id) {
		return rubriqueComptableService.findById(id);
	}
	@GetMapping("/libelle/{libelle}")
	public RubriqueComptable findByLibelle(@PathVariable String libelle) {
		return rubriqueComptableService.findByLibelle(libelle);
	}
	@GetMapping("/classeComptable/{classeComptable}")
	public RubriqueComptable findByClasseComptable(@RequestBody ClasseComptable classeComptable) {
		return rubriqueComptableService.findByClasseComptable(classeComptable);
	}
	@GetMapping("/")
	public List<RubriqueComptable> findAll() {
		return rubriqueComptableService.findAll();
	}
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id) {
		rubriqueComptableService.deleteById(id);
	}
	@PostMapping("/")
	public RubriqueComptable save(@RequestBody RubriqueComptable rubriqueComptable) {
		return rubriqueComptableService.save(rubriqueComptable);
	}
	

}
