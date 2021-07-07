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
		Integer contadorProducto = 0;
		for(Producto disponible: productosDisponibles) {
			if(disponible.getCodigo().equals(codigo)) {
				contadorProducto++;
			}
		}
		
		return contadorProducto;
	}
	
	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente{
		for (Producto producto: productosExistentes) {
			if(producto.getCodigo().equals(codigoDeProducto)) {
				return true;
			} else {
				throw new ProductoInexistente();
			}
		}
		
		return false;
	}
	
	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {
		
		for(Producto producto: productosDisponibles) {
			if(producto.getCodigo().equals(codigoDeProducto)) {
				return producto;
			} else {
				throw new ProductoSinStock();
			}
		}
		
		return null;
	}
	
	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}
	
	public Venta getVenta(Integer nueroDeVenta) {
		return ventasRealizadas.get(nueroDeVenta);	
		}
	

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto) throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el "numeroDeVenta", el producto identificado por el "codigoDeProducto"
		if(productoExiste(codigoDeProducto)) {
			for(Producto producto: productosDisponibles) {
				if(producto.getCodigo().equals(codigoDeProducto)) {
					
				} else {
					throw new ProductoSinStock();
				}
			}
		} else {
			throw new ProductoInexistente();
		}
	}
	

}
