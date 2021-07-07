package ar.edu.unlam.pb2;

public class Heladera extends Producto implements Electrodomestico {
	
	private Boolean isFrost;
	private Integer garantia;

	public Heladera(Integer codigo, String descripcion, Boolean frost, Integer garantia,
			String marca, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.setIsFrost(frost);
		this.setGarantia(garantia);
	}

	@Override
	public Integer getGarantia() {
		// TODO Auto-generated method stub
		return this.garantia;
	}

	public void setIsFrost(Boolean isFrost) {
		this.isFrost = isFrost;
	}

	public void setGarantia(Integer garantia) {
		this.garantia = garantia;
	}

	public Boolean isNoFrost() {
		return this.isFrost;
	}

}
