package Escandalosos;

import java.util.ArrayList;
import java.util.List;


public class ClasePrincipal {
	
	public static void main (String[] args ) {
		
		List<String> caracteristicasDeHermoso = new ArrayList<String>();
		caracteristicasDeHermoso.add("Amistoso");
		caracteristicasDeHermoso.add("divertidos");
		caracteristicasDeHermoso.add("graciosos");
		caracteristicasDeHermoso.add("traviesos");
		caracteristicasDeHermoso.add("peludos");
		caracteristicasDeHermoso.add("timido");
		caracteristicasDeHermoso.add("romantico");
		caracteristicasDeHermoso.add("imponentes");
		caracteristicasDeHermoso.add("violento");
		caracteristicasDeHermoso.add("habilidoso");
		caracteristicasDeHermoso.add("gustos musicales");
		
		List<String> habilidadesHermoso = new ArrayList<String>();
		habilidadesHermoso.add("cocinar");
		habilidadesHermoso.add("liderasgo");
		habilidadesHermoso.add("sigiloso");
		habilidadesHermoso.add("artes marciales");
	
		List<String> habilidadesPolar = new ArrayList<String>();
		habilidadesPolar.add("cocinar");
		habilidadesPolar.add("sigiloso");
		habilidadesPolar.add("artes marciales");
		
		
		Oso hermoso = new Oso("Nombre del oso",true,"gustosMusicales",caracteristicasDeHermoso,habilidadesHermoso);

		Oso panda = new Oso("Panda",false, "gustosMusicales", new ArrayList<String>(),new ArrayList<String>());
		Oso pardo = new Oso("Pardo",false, "gustosMusicales", new ArrayList<String>(),new ArrayList<String>());
		Oso polar = new Oso("Polar",false, "gustosMusicales", new ArrayList<String>(), habilidadesPolar);
		List<Oso> Osos = new ArrayList<Oso>();
		Osos.add(hermoso);
		Osos.add(panda);
		Osos.add(pardo);
		Osos.add(polar);
		
		for (Oso oso : Osos) {
			if(oso.getNombre().charAt(0) == 'P') {
				System.out.println(oso.getNombre());	
			}
		}
		
		for (Oso unOso: Osos) {
			System.out.println(polar.getHabilidades());
		
		}
		
		polar.getHabilidades();
	}
}