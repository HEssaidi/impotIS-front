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
import com.example.ImpotIS.model.service.facade.ClasseComptableService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("impotIS-api/classeComptable") //acceder à la classe 
public class ClasseComptableRest {
	@Autowired
	private ClasseComptableService classeComptableService;
	@PostMapping("/")
	public ClasseComptable save(@RequestBody ClasseComptable classeComptable) {
		return classeComptableService.save(classeComptable);
	}
	@GetMapping("/id/{id}")
	public Optional<ClasseComptable> findById(@PathVariable Long id) {
		return classeComptableService.findById(id);
	}
	@GetMapping("/libelle/{libelle}")
	public List<ClasseComptable> findByLibelle(@PathVariable String libelle) {
		return classeComptableService.findByLibelle(libelle);
	}
	@GetMapping("/code/{code}")
	public List<ClasseComptable> findByCode(@PathVariable Long code) {
		return classeComptableService.findByCode(code);
	}
	@GetMapping("/")
	public List<ClasseComptable> findAll() {
		return classeComptableService.findAll();
	}
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id) {
		classeComptableService.deleteById(id);
	} 
	
}
