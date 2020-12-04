package com.example.ImpotIS.model.ws;

import java.math.BigDecimal;
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

import com.example.ImpotIS.bean.TauxIs;
import com.example.ImpotIS.model.service.facade.TauxIsService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("impotIS-api/taux")
public class TauxIsRest {
	@Autowired
	private TauxIsService tauxIsService;
	@GetMapping("/benifice/{benifice}")
	public TauxIs findTauxPrct(@PathVariable BigDecimal benifice) {
		return tauxIsService.findTauxPrct(benifice);
	}
	@GetMapping("/id/{id}")
	public Optional<TauxIs> findById(@PathVariable Long id) {
		return tauxIsService.findById(id);
	}
	@GetMapping("/montantMax/{montantMax}/montantMin/{montantMin}")
	public TauxIs findByMontantMaxAndMontantMin(@PathVariable Float montantMax,@PathVariable Float montantMin) {
		return tauxIsService.findByMontantMaxAndMontantMin(montantMax, montantMin);
	}
	@GetMapping("/")
	public List<TauxIs> findAll() {
		return tauxIsService.findAll();
	}
	@GetMapping("/libelle/{libelle}")
	public TauxIs findByLibelle(@PathVariable String libelle) {
		return tauxIsService.findByLibelle(libelle);
	}
	@GetMapping("/pourcentage/{pourcentage}")
	public TauxIs findByPourcentage(@PathVariable Float pourcentage) {
		return tauxIsService.findByPourcentage(pourcentage);
	}
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id) {
		tauxIsService.deleteById(id);
	}
	@PostMapping("/")
	public void save(@RequestBody TauxIs tauxIs) {
		tauxIsService.save(tauxIs);
	}

}
