package com.KhaledAlabsi.Kasse.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tisch {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String ort;
	private Integer grosse;
	private String bereich;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getGrosse() {
		return grosse;
	}
	public void setGrosse(Integer grosse) {
		this.grosse = grosse;
	}
	public Tisch() {
		super();
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public String getBereich() {
		return bereich;
	}
	public void setBereich(String bereich) {
		this.bereich = bereich;
	}
	public String getNotizten() {
		return notizten;
	}
	public void setNotizten(String notizten) {
		this.notizten = notizten;
	}
	private String notizten;
	
}
