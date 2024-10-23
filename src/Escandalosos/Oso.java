package Escandalosos;

import java.util.ArrayList;
import java.util.List;

public class Oso {
	
	private String nombre;
	boolean esproblematico;//true - false
	String gustoMusical;
	List<String> caracteristicasDelOso = new ArrayList<String>();
	List<String> habilidades = new ArrayList<String>();
	
	public Oso(String nombre, boolean esproblematico, String gustoMusical, List<String> caracteristicasDelOso,
			List<String> habilidades) {
		this.nombre = nombre;
		this.esproblematico = esproblematico;
		this.gustoMusical = gustoMusical;
		this.caracteristicasDelOso = caracteristicasDelOso;
		this.habilidades = habilidades;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Oso() {
		
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean isEsproblematico() {
		return esproblematico;
	}


	public void setEproblematico(boolean esproblematico) {
		this.esproblematico = esproblematico;
	}


	public String getGustoMusical() {
		return gustoMusical;
	}


	public void setGustoMusical(String gustoMusical) {
		this.gustoMusical = gustoMusical;
	}


	public List<String> getCaracteristicasDelOso() {
		return caracteristicasDelOso;
	}


	public void setCaracteristicasDelOso(List<String> caracteristicasDelOso) {
		this.caracteristicasDelOso = caracteristicasDelOso;
	}


	public List<String> getHabilidades() {
		return habilidades;
	}


	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}
	
	public Oso (String nombre, boolean esproblematico) {
		this.nombre = nombre;
		this.esproblematico = esproblematico;
	}
	
	
	public Oso (String pNombre) {
		this.nombre = pNombre;
	}
	
	public void mostrarHabilidades() {
		System.out.println(this.getHabilidades());
	}
}