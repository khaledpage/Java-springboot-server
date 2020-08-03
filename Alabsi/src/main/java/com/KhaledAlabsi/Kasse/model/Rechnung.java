package com.KhaledAlabsi.Kasse.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Rechnung {
	@NotNull
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	 @JsonFormat(pattern="dd.MM.yyyy")
    private LocalDate datum;
    @Basic
    private java.sql.Time zeit;
    
    
  // ich bin nicht von diese normalisierung der Tabelle überzeugt, da mit der Ziet sehr sehr groß wird!
    // ohne    @JsonBackReference kommt es zo endlose schleife beim abfrage! 
  @JsonBackReference
  @ManyToMany(fetch = FetchType.EAGER,
  cascade = CascadeType.ALL)

    private List<Items> items ;
	
	@OneToOne
	private Tisch tisch;
	@OneToOne
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

	public Rechnung() {
		super();
	}
	public LocalDate getDatum() {
		return datum;
	}
	public void setDatum(LocalDate date) {
		this.datum = datum;
	}
	public java.sql.Time getZeit() {
		return zeit;
	}
	public void setZeit(java.sql.Time sqlTime) {
		this.zeit = sqlTime;
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


	  
}
