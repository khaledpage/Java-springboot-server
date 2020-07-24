package com.KhaledAlabsi.Kasse.modells;


import java.util.List;



public class Items {

	private long id;
	private String name;
	private String details;
	private int menge;
	private float Preis;
	private String notizen;
	
	

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
	public Items() {
		super();
	}
	

}
