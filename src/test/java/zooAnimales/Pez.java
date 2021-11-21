package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal{
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona, String color, int aletas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		this.setColorEscamas(color);
		this.setCantidadAletas(aletas);
		setTotalAnimales(getTotalAnimales() + 1);
		listado.add(this);
	}
	
	static public int cantidadPeces() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "nadar";
	}
	
	public Pez crearSalmon(String nombre, int edad, String genero, ArrayList<Zona> zona) {
		salmones++;
		return new Pez(nombre, edad, "oceano",genero, zona,"rojo", 6);
	}
	
	public Pez crearBacalao(String nombre, int edad, String genero, ArrayList<Zona> zona) {
		bacalaos++;
		return new Pez(nombre, edad, "oceano",genero, zona,"gris", 6);
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
}
