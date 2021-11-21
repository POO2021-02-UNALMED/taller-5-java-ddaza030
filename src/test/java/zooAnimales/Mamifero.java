package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona, boolean pelaje, int patas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		this.setPelaje(pelaje);
		this.setPatas(patas);
		setTotalAnimales(getTotalAnimales() + 1);
		listado.add(this);
		
	}
	
	public Mamifero() {
		setTotalAnimales(getTotalAnimales() + 1);
		listado.add(this);
	}
	
	static public int cantidadMamiferos() {
		return listado.size();
	}
	

	
	static public Mamifero crearCaballo(String nombre, int edad, String genero, ArrayList<Zona> zona) {
		caballos++;
		return new Mamifero(nombre, edad, "pradera",genero, zona,true,4);
	}
	
	static public Mamifero crearLeon(String nombre, int edad, String genero, ArrayList<Zona> zona) {
		leones++;
		return new Mamifero(nombre, edad, "selva",genero, zona,true,4);
	}
	
	
	
	//get y set
	public static ArrayList<Mamifero> getListado() {
		return listado;
	}
	
	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public boolean getPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
}
