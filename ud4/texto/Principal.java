package ud4.texto;

public class Principal {
public static void main(String[] args) {
	
		Texto t = new Texto(10);
		
		t.añadirAlFinal('o');
		t.añadirAlPrincipio('H');
		t.mostrarInformacion();
		
		t.cadenaAlFinal("la");
		t.cadenaAlPrincipio("¡");
		t.mostrarInformacion();
		
		
		t.cadenaAlFinal("!");
		t.cadenaAlFinal("mundo");
		t.mostrarInformacion();
	}
}
