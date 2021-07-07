package ar.edu.unlam.pb2;

import ar.edu.unlam.interfaces.Comestible;

public class Carne extends Producto implements Comestible {
	
	private String fechaDeElaboracion;
	private String fechaDeVencimiento;
	private Double kilos;

	public Carne (Integer codigo, String descripcion, String fElab, String fVenc,
			Double kilos, String marca, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.fechaDeElaboracion = fElab;
		this.fechaDeVencimiento = fVenc;
		this.setKilos(kilos);
	}
	
	@Override
	public String getFechaDeElaboracion() {
		return this.fechaDeElaboracion;
	}

	@Override
	public String getFechaDeVencimiento() {
		return this.fechaDeVencimiento;
	}

	public Double getKilos() {
		return kilos;
	}

	public void setKilos(Double kilos) {
		this.kilos = kilos;
	}

}
