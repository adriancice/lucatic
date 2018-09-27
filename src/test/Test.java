package test;

import java.util.HashMap;
import java.util.Map;

import beans.Localidad;

public class Test {

	public static void main(String[] args) {

		Localidad l1 = new Localidad(29603, "Marbella", 50500);
		Localidad l2 = new Localidad(29640, "Fuengirola", 30560);
		Localidad l3 = new Localidad(28640, "Pozuelo", 30560);
		Localidad l4 = new Localidad(28640, "Alcobendas", 25000);
		Map<String, Localidad> malaga = new HashMap<String, Localidad>();
		Map<String, Localidad> madrid = new HashMap<String, Localidad>();

		malaga.put("Marbella", l1);
		malaga.put("Fuengirola", l2);

		Map<String, Map> pais = new HashMap<String, Map>();
		pais.put("Madrid", madrid);
		pais.put("Malaga", malaga);

		for (Map.Entry<String, Map> entry : pais.entrySet()) {
			String provincia = entry.getKey();
			Map<String, Localidad> localidades = entry.getValue();

			for (Map.Entry<String, Localidad> entry2 : localidades.entrySet()) {
				Localidad aux = (Localidad) entry2.getValue();
				System.out.println(
						provincia + " -> " + aux.getCodigo() + ", " + aux.getNombre() + ", " + aux.getPoblacion());
			}
		}
	}
}
