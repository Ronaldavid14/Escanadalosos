package Escandalosos;

import java.util.ArrayList;
import java.util.List;

public class Oso {
	
	private String nombre;

	boolean esPeligroso;//true - false
	String gustoMusical;
	List<String> caracteristicasDelOso = new ArrayList<String>();
	List<String> habilidades = new ArrayList<String>();
	
	public String getNombre() {
		return nombre;
	}
	
	public Oso() {
		
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean isEsPeligroso() {
		return esPeligroso;
	}


	public void setEsPeligroso(boolean esPeligroso) {
		this.esPeligroso = esPeligroso;
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
	
	public Oso (String nombre, boolean esPeligroso) {
		this.nombre = nombre;
		this.esPeligroso = esPeligroso;
	}
	
	
	public Oso (String pNombre) {
		this.nombre = pNombre;
	}
	
	public void mostrarHabilidades() {
		System.out.println(this.getHabilidades());
	}
}