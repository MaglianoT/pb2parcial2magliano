package ar.edu.unlam.pb2;

import ar.edu.unlam.interfaces.Indumentaria;

public class Remera extends Producto implements Indumentaria {
	private String talle;
	private String color;

	public Remera (Integer codigo, String descripcion, String talla, String marca, String color,
			Double precio) {
		super(codigo, descripcion, marca, precio);
		this.setTalle(talla);
		this.setColor(color);
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
