package ar.edu.unlam.pb2;

import ar.edu.unlam.interfaces.Comestible;

public class Galletitas extends Producto implements Comestible {
	
	private String fechaElab;
	private String fechaVenc;
	
	public Galletitas (Integer codigo, String descripcion, String fechaElab, String fechaVenc, 
			String marca, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.fechaElab = fechaElab;
		this.fechaVenc = fechaVenc;
	}

	public String getFechaDeElaboracion() {
		return fechaElab;
	}

	public void setFechaDeElaboracion(String fechaElab) {
		this.fechaElab = fechaElab;
	}

	public String getFechaDeVencimiento() {
		return fechaVenc;
	}

	public void setFechaDeVencimiento(String fechaVenc) {
		this.fechaVenc = fechaVenc;
	}

	public String getDescripcion() {
	 return super.getDescripcion();
	}
	


}
