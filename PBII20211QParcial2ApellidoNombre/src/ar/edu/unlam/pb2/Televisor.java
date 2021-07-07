package ar.edu.unlam.pb2;

public class Televisor extends Producto implements Electrodomestico {
	
	private Integer garantia;
	private Integer pulgadas;

	public Televisor(Integer codigo, String descripcion, Integer pulgadas, Integer garantia,
			String marca, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.setGarantia(garantia);
		this.setPulgadas(pulgadas);
	}

	public Object getPulgadas() {
		// TODO Auto-generated method stub
		return this.pulgadas;
	}

	@Override
	public Integer getGarantia() {
		// TODO Auto-generated method stub
		return this.garantia;
	}

	public void setGarantia(Integer garantia) {
		this.garantia = garantia;
	}

	public void setPulgadas(Integer pulgadas) {
		this.pulgadas = pulgadas;
	}

}
