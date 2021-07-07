package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Supermercado {
	
	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el número de venta)
	Integer contadorDeVentas; // Identificador del número de venta
	
	public Supermercado(String nombre) {
		this.nombre = nombre;
		this.productosExistentes = new TreeSet <Producto>();
		this.productosDisponibles = new ArrayList<>();
		this.ventasRealizadas = new HashMap <Integer, Venta>();
	}

	public void ingresarProducto(Producto nuevo) {
		productosExistentes.add(nuevo);
	}

	public Set<Producto> getOfertaDeProductos() {
		return this.productosExistentes;
	}
	
	public Integer getStock(Integer codigo) {
		for(Producto disponible: productosDisponibles) {
			
		}
	}
	
	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente{
		Boolean existe = false;
		for (Producto producto: productosExistentes) {
			if(producto.getCodigo().equals(codigoDeProducto)) {
				existe = true;
			} else {
				throw new ProductoInexistente();
			}
		}
		
		return existe;
	}
	
	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {
		for(Producto producto: productosDisponibles) {
			
		}
	}
	
	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}
	
	public Venta getVenta(Integer nueroDeVenta) {
		// Devuelve una venta en función de su número identificatorio
	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto) throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el "numeroDeVenta", el producto identificado por el "codigoDeProducto"
	}
	

}
