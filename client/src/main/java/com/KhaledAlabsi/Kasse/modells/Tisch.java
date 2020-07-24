package com.KhaledAlabsi.Kasse.modells;




public class Tisch {


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
