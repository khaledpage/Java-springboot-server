package com.KhaledAlabsi.Kasse.modells;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




public class Rechnung {

	
	@JsonIgnoreProperties(ignoreUnknown = true)
	private Long id;
    private java.sql.Date sqlDate;
    private java.sql.Time sqlTime;
    private List<Items> items ;
    
	private Tisch tisch;
	private Mitarbeitern mitarbeiter;
	
	
	
	
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public java.sql.Date getSqlDate() {
		return sqlDate;
	}
	public void setSqlDate(java.sql.Date sqlDate) {
		this.sqlDate = sqlDate;
	}
	public java.sql.Time getSqlTime() {
		return sqlTime;
	}
	public void setSqlTime(java.sql.Time sqlTime) {
		this.sqlTime = sqlTime;
	}

	
	public Tisch getTisch() {
		return tisch;
	}
	public void setTisch(Tisch tisch) {
		this.tisch = tisch;
	}
	
	
	public Mitarbeitern getMitarbeiter() {
		return mitarbeiter;
	}
	public void setMitarbeiter(Mitarbeitern mitarbeiter) {
		this.mitarbeiter = mitarbeiter;
	}
	public Rechnung() {
		super();
	}


	  
}
