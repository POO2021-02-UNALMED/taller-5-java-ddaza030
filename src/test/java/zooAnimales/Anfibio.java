package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona, String color, boolean venenoso) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		this.setColorPiel(color);
		this.setVenenoso(venenoso);
		setTotalAnimales(getTotalAnimales() + 1);
		listado.add(this);
	}
	public Anfibio() {
		setTotalAnimales(getTotalAnimales() + 1);
		listado.add(this);
	}
	
	static public int cantidadAnfibios() {
		return listado.size();
	}
	
	static public Anfibio crearRana(String nombre, int edad, String genero, ArrayList<Zona> zona) {
		ranas++;
		return new Anfibio(nombre, edad, "selva",genero, zona,"rojo", true);
	}
	
	static public Anfibio crearSalamandra(String nombre, int edad, String genero, ArrayList<Zona> zona) {
		salamandras++;
		return new Anfibio(nombre, edad, "selva",genero, zona,"negro y amarillo", false);
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean getVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
}
