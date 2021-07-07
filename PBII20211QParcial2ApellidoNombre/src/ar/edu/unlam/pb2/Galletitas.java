package ar.edu.unlam.pb2;

import ar.edu.unlam.interfaces.Comestible;

public class Galletitas extends Producto implements Comestible {
	
	private String fechaElab;
	private String fechaVenc;
	
	public Galletitas (Integer codigo, String nombre, String fechaElab, String fechaVenc, 
			String marca, Double precio) {
		super(codigo, nombre, marca, precio);
		this.fechaElab = fechaElab;
		this.fechaVenc = fechaVenc;
	}

	public String getFechaElab() {
		return fechaElab;
	}

	public void setFechaElab(String fechaElab) {
		this.fechaElab = fechaElab;
	}

	public String getFechaVenc() {
		return fechaVenc;
	}

	public void setFechaVenc(String fechaVenc) {
		this.fechaVenc = fechaVenc;
	}



}
