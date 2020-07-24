package com.KhaledAlabsi.Kasse.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.KhaledAlabsi.Kasse.modells.Rechnung;
import com.KhaledAlabsi.Kasse.services.RechnungService;

import reactor.core.publisher.Mono;



@RestController 
@RequestMapping(path = "/rechnung")
public class RechnungController {
	
	@Autowired
	private RechnungService rechnungService;
	
	@GetMapping("/{id}")
	public Mono<Rechnung> getByID(@PathVariable Integer id) {
		return rechnungService.getById(Integer.toString(id));	
		
	}
	
	@GetMapping
	public Mono<List<Rechnung>> filterByDate(){
		
		
		return  rechnungService.getAll();
		
	}

}
