package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico() {
		
	}
	public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas) {
		this.setNombre(nombre);
		this.setUbicacion(ubicacion);
		this.setZonas(zonas);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZonas() {
		return zonas;
	}

	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	
	
	public int cantidaTotalAnimales() {
		int cantidad = 0;
		for(int i=0;i < zonas.size(); i++) {
			cantidad += zonas.get(i).cantidadAnimales();
		}
		
		return cantidad;
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	
	
}