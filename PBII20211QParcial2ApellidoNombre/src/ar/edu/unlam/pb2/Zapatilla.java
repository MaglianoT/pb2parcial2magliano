package ar.edu.unlam.pb2;

import ar.edu.unlam.interfaces.Indumentaria;

public class Zapatilla extends Producto implements Indumentaria {
	
	private String talle;
	private String color;

	public Zapatilla (Integer codigo, String descripcion, String talle, String marca, String color,
			Double precio) {
		super(codigo, descripcion, marca, precio);
		this.setTalle(talle);
		this.setColor(color);
	}
	



	public String getTalle() {
		// TODO Auto-generated method stub
		return this.talle;
	}

	public void setTalle(String talle2) {
		this.talle = talle2;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
