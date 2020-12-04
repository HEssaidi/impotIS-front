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

import com.example.ImpotIS.bean.TypeOperationComptable;
import com.example.ImpotIS.model.service.facade.TypeOperationComptableService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("impotIS-api/typeOperationComptable")
public class TypeOperationComptableRest {
	@Autowired
	private TypeOperationComptableService typeOperationComptableService;
	@GetMapping("/id/{id}")
	public Optional<TypeOperationComptable> findById(@PathVariable Long id) {
		return typeOperationComptableService.findById(id);
	}
	@GetMapping("/code/{code}")
	public TypeOperationComptable findByCode(@PathVariable Long code) {
		return typeOperationComptableService.findByCode(code);
	}
	@GetMapping("/")
	public List<TypeOperationComptable> findAll() {
		return typeOperationComptableService.findAll();
	}
	@PostMapping("/")
	public TypeOperationComptable save(@RequestBody TypeOperationComptable typeOperationComptable) {
		return typeOperationComptableService.save(typeOperationComptable);
	}
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id) {
		typeOperationComptableService.deleteById(id);
	}
	

}
