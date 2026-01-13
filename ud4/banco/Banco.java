package ud4.cuenta;

public class Banco {
private final String nombre;
private double capital;
private String direccion;

Banco(String nombre, String direccion){
	this.nombre= nombre;
	this.direccion = direccion;
	this.capital = 5200000;
	}

public String getNombre() {
    return nombre;
	}

public double getCapital() {
    return capital;
	}

public void setCapital(double capital) {
    this.capital = capital;
	}

public String getDireccion() {
    return direccion;
	}

public void setDireccion(String direccion) {
    this.direccion = direccion;
	}

public void mostrarInformacion() {
    System.out.println("BANCO: " + nombre);
    System.out.println("Capital: " + capital + " €");
    System.out.println("Dirección Central: " + direccion);
    System.out.println("---------------------------");
	}
}

