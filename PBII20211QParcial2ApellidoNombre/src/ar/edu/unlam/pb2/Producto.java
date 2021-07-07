package ar.edu.unlam.pb2;

public class Producto {

	private Integer codigo;
	private String marca;
	private Double precio;
	private String descripcion;
	
	
	public Producto (Integer codigo, String descripcion, String marca, Double precio) {
		this.codigo = codigo;
		this.marca = marca;
		this.precio = precio;
		this.setDescripcion(descripcion);
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	
	

}
