package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Veiculo {
	private String placa;
	private String modelo;
	private String valor;
	private Socio socio;
	private ArrayList<Estadia> estadias;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public ArrayList<Estadia> getEstadias() {
		return estadias;
	}
	public void setEstadias(ArrayList<Estadia> estadias) {
		this.estadias = estadias;
	}

}
