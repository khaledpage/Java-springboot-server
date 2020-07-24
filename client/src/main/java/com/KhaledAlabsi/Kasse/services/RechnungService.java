package com.KhaledAlabsi.Kasse.services;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.KhaledAlabsi.Kasse.modells.Rechnung;

import reactor.core.publisher.Mono;

@Service
public class RechnungService {
	private final WebClient webClient;

	public RechnungService(WebClient.Builder webClientBuilder) {
		this.webClient = webClientBuilder.baseUrl("http://localhost:8080").build();
	}

	public Mono<Rechnung> getById(String name) {
		return this.webClient
				.get()
				.uri("/rechnungen/{name}", name)
				.retrieve()
				.bodyToMono(Rechnung.class);
	}
	
	
	public Mono<List<Rechnung>> getAll() {
		return this.webClient
				.get()
				.uri("/rechnungen")
				.retrieve()
				.bodyToMono(new ParameterizedTypeReference<List<Rechnung>>() {});
	}
	

}
