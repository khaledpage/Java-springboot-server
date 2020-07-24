package com.KhaledAlabsi.Kasse.controller;
import com.KhaledAlabsi.Kasse.model.*;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.KhaledAlabsi.Kasse.repository.RechnungRepository;

@RestController
@RequestMapping(path="/rechnungen")

public class RechnungController {
	@Autowired
	private RechnungRepository rechnungRepository;
	
	@GetMapping
	  public @ResponseBody Iterable<Rechnung> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return rechnungRepository.findAll();
	  }
	
	@GetMapping("/{id}")
	Optional<Rechnung> ein(@PathVariable Long id) {
		return rechnungRepository.findById(id);
	}
	
	
	 @PostMapping("/neu")
	 Rechnung neueRechnung(@RequestBody Rechnung neueRechnung) {
	    return rechnungRepository.save(neueRechnung);
	  }
	
	 @PutMapping("/{id}")
	 Optional<Rechnung> aendern(@RequestBody Rechnung neuRechnung, @PathVariable Long id) {
		return rechnungRepository.findById(id)
				.map(rechnung ->{
//					rechnung.setItems(neuRechnung.getItems());
					rechnung.setMitarbeiter(neuRechnung.getMitarbeiter());
					rechnung.setDatum(neuRechnung.getDatum());
					rechnung.setZeit(neuRechnung.getZeit());
					rechnung.setTisch(neuRechnung.getTisch());
					return rechnungRepository.save(rechnung);
				});
				
		 
	 }
	 
	 
	 @DeleteMapping("/{id}")
	  void loeschen(@PathVariable Long id) {
		 rechnungRepository.deleteById(id);
	  }
	 
	 
//	@PostMapping(path="/add") // Map ONLY POST Requests
//	  public @ResponseBody String neueRechnung (@RequestParam String name
//	      , @RequestParam String email) {

//
//		Rechnung n = new Rechnung();
//	    n.setName(name);
//	    n.setEmail(email);
//	    rechnungRepository.save(n);
//	    return "Saved";
//	  }
//	
	
}
