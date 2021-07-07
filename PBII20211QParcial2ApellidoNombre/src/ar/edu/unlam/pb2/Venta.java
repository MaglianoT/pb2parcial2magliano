package ar.edu.unlam.pb2;

public class Venta {
	private Integer dniComprador;
	private String nombreComprador;
	private Double importe;
	
	public Venta(Integer dniDelComprador, String nombreDelComprador) {
		this.setDniComprador(dniDelComprador);
		this.setNombreComprador(nombreDelComprador);
	}

	public Integer getDniComprador() {
		return dniComprador;
	}

	public void setDniComprador(Integer dniComprador) {
		this.dniComprador = dniComprador;
	}

	public String getNombreComprador() {
		return nombreComprador;
	}

	public void setNombreComprador(String nombreComprador) {
		this.nombreComprador = nombreComprador;
	}

	public double getImporte() {
		// TODO Auto-generated method stub
		return 0;
	}
}
