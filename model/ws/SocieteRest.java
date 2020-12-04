package com.example.ImpotIS.model.ws;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ImpotIS.bean.Societe;
import com.example.ImpotIS.model.service.facade.SocieteService;



@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("impotIS-api/impot") //acceder à la classe 
public class SocieteRest {
	@Autowired
	private SocieteService societeService;
    
	@GetMapping("/id/{id}")
	public Optional<Societe> findById(@PathVariable Long id) {
		return societeService.findById(id);
	}
	
	@GetMapping("/ice/{ice}")
	public Societe findByIce(@PathVariable String ice) {
		return societeService.findByIce(ice);
	}
	
	@GetMapping("/")
	public List<Societe> findAll() {
		return societeService.findAll();
	}
	@PostMapping("/")
	public Societe save(@RequestBody Societe societe) {
		return societeService.save(societe);
	}
    
	@PutMapping("/")
	public Societe update(@RequestBody Societe societe) {
		return societeService.update(societe);
	}
    @DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id) {
		societeService.deleteById(id);
	}
	
}
