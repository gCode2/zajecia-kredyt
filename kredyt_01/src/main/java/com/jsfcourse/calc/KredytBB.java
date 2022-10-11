package com.jsfcourse.calc;

import javax.inject.Inject;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named
@RequestScoped
//@SessionScoped
public class KredytBB {
	private String kwota;
	private String lat;
	private String procent;
	
	private Double result;

	@Inject
	FacesContext ctx;
	
	public String getKwota() {
		return kwota;
	}
	public void setKwota(String kwota) {
		this.kwota = kwota;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getProcent() {
		return procent;
	}
	public void setProcent(String procent) {
		this.procent = procent;
	}
	
	public Double getResult() {
		return result;
	}
	public void setResult(Double result) {
		this.result = result;
	}
	
	public String calc() {
		Double kwota = Double.parseDouble(this.kwota);
		Double lat = Double.parseDouble(this.lat);
		Double procent = Double.parseDouble(this.procent);
		result = (kwota+(kwota*lat*procent/100))/lat;
		
		
		return null;
	}
}
