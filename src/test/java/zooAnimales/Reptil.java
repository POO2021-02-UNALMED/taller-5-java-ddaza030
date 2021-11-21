package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona, String color, int largo) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		this.setColorEscamas(color);
		this.setLargoCola(largo);
		setTotalAnimales(getTotalAnimales() + 1);
		listado.add(this);
	}
	
	static public int cantidadReptiles() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "reptar";
	}
	
	public Reptil crearIguana(String nombre, int edad, String genero, ArrayList<Zona> zona) {
		iguanas++;
		return new Reptil(nombre, edad, "humedal",genero, zona,"verde", 3);
	}
	
	public Reptil crearSerpiente(String nombre, int edad, String genero, ArrayList<Zona> zona) {
		serpientes++;
		return new Reptil(nombre, edad, "jungla",genero, zona,"blanco", 1);
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
}
