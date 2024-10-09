package Escandalosos;

import java.util.ArrayList;
import java.util.List;


public class ClasePrincipal {
	
	public static void main (String[] args ) {
		
		List<String> caracteristicasDelOso = new ArrayList<String>();
		caracteristicasDelOso.add("Amistoso");
		caracteristicasDelOso.add("divertidos");
		caracteristicasDelOso.add("graciosos");
		caracteristicasDelOso.add("traviesos");
		caracteristicasDelOso.add("peludos");
		caracteristicasDelOso.add("timido");
		caracteristicasDelOso.add("romantico");
		caracteristicasDelOso.add("imponentes");
		caracteristicasDelOso.add("violento");
		caracteristicasDelOso.add("habilidoso");
		caracteristicasDelOso.add("gustos musicales");
		
		List<String> habilidades = new ArrayList<String>();
		habilidades.add("cocinar");
		habilidades.add("liderasgo");
		habilidades.add("sigiloso");
		habilidades.add("artes marciales");
		Oso hermoso = new Oso("maduros" , true);
		
		List<Oso> Osos = new ArrayList<Oso>();
		Osos.add(hermoso);
		
	}
}