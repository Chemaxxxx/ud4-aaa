package ud4.texto;

public class Texto {
	private String cadena;
	private int longitudMaxima;
	private static final String  VOCALES = "aeiouAEIOUÁÉÍÓÚáéíóú";
	
	Texto(int longitudMaxima){
		this.longitudMaxima = longitudMaxima;
		this.cadena = "";
	}
	
	public void añadirAlPrincipio(char c) {
		if(cadena.length()+ 1 <= longitudMaxima)
			cadena = c + cadena;
		else
			System.out.println("Error: no hay espacio para el caracter");
	}
	
	public void añadirAlFinal(char c) {
		if(cadena.length()+ 1 <= longitudMaxima)
			cadena = cadena + c;
		else
			System.out.println("Error: no hay espacio para el caracter");
	}
	
	public void cadenaAlPrincipio(String s) {
		if(cadena.length()+ s.length()<= longitudMaxima)
			cadena = s + cadena;
		else
			System.out.println("Error: Cadena demasiado larga");
	}
	
	public void cadenaAlFinal(String s) {
		if(cadena.length()+ s.length()<= longitudMaxima)
			cadena = cadena + s;
		else
			System.out.println("Error: Cadena demasiado larga");
	}
	
	public int contarVocales() {
		int contador = 0;
		for(int i = 0; i<cadena.length(); i++) {
			char letraActual = cadena.charAt(i);
			if(VOCALES.indexOf(letraActual) !=-1)
				contador++;
		}
		return contador;
	}
	
	public void mostrarInformacion() {
        System.out.println("Texto: " + cadena );
        System.out.println("Longitud: " + cadena.length() + "/" + longitudMaxima);
        System.out.println("Vocales: " + contarVocales());
        System.out.println("-------------------------");
    }

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public int getLongitudMaxima() {
		return longitudMaxima;
	}

	public void setLongitudMaxima(int longitudMaxima) {
		this.longitudMaxima = longitudMaxima;
	}

	public static String getVocales() {
		return VOCALES;
	}
}
