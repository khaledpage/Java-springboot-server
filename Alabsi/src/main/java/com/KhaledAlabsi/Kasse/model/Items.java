package com.KhaledAlabsi.Kasse.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Items {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String details;
	private int menge;
	private float Preis;
	private String notizen;
	@JsonManagedReference
	
	@ManyToMany(mappedBy = "items", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Rechnung> Rechnung ;
	

	public List<Rechnung> getRechnung() {
		return Rechnung;
	}
	public void setRechnung(List<Rechnung> rechnung) {
		Rechnung = rechnung;
	}
	public float getPreis() {
		return Preis;
	}
	public void setPreis(float preis) {
		Preis = preis;
	}

	public Items() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public int getMenge() {
		return menge;
	}
	public void setMenge(int menge) {
		this.menge = menge;
	}
	public String getNotizen() {
		return notizen;
	}
	public void setNotizen(String notizen) {
		this.notizen = notizen;
	}
	

}
