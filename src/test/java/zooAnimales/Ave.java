package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal{
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona, String colorPlumas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		this.setColorPlumas(colorPlumas);
		setTotalAnimales(getTotalAnimales() + 1);
		listado.add(this);
	}
	public Ave() {
		setTotalAnimales(getTotalAnimales() + 1);
		listado.add(this);
	}
	
	static public int cantidadAves() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	
	static public Ave crearHalcon(String nombre, int edad, String genero, ArrayList<Zona> zona) {
		halcones++;
		return new Ave(nombre, edad, "montanas",genero, zona,"cafe glorioso");
	}
	static public Ave crearAguila(String nombre, int edad, String genero, ArrayList<Zona> zona) {
		aguilas++;
		return new Ave(nombre, edad, "montanas",genero, zona,"blanco y amarillo");
	}
	
	// get y set
	public static ArrayList<Ave> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	
}
