package gestion;
import java.util.ArrayList;
import zooAnimales.*;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	
	public Zona(String nombre, Zoologico zoo) {
		this.setAnimales(animales);
		this.setZoo(zoo);
		zoo.agregarZonas(this);
	}
	
	public Zona() {
	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		for(int i = 0; i < animales.size();i++) {
			animales.get(i).setZona(this);
		}
	}
	
	public void agregarAnimales() {
		animales.add(new Animal());
		animales.get(animales.size()-1).setZona(this);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
}
