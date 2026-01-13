package ud4.cuenta;



public class Principal {
public static void main(String[] args) {
	CuentaCorriente c1 = new CuentaCorriente("Ana", "11122233X");
	CuentaCorriente c2 = new CuentaCorriente(1000.50);
	CuentaCorriente c3 = new CuentaCorriente(500, -100, "44455566Y");
	Banco miBanco = new Banco("CajaRural", "Calle Oro 123");
	
	
	//funciona porque es public
	c1.nombre= "Luis";
	//Funciona porque las dos clases estan en el mismo paquete
	c1.dni = "87654321X";
	//c2.saldo = 5000; 'The field CuentaCorriente.saldo is not visible' porque es privado
	//c3.limiteDescubrimiento = -100; tampoco se puede porque es privado
	
	System.out.println("Mostrando cuenta 1:");
    c1.mostrarInformacion();
    
    System.out.println("\nMostrando cuenta 2:");
    c2.mostrarInformacion();
    
    System.out.println("\nMostrando cuenta 3:");
    c3.mostrarInformacion();
    
    CuentaCorriente.setNombreBanco("Caixa Bank");
    
    c1.ingresarDinero(200);
    c1.sacarDinero(50);
    
    System.out.println("Mostrando cuenta 1:");
    c1.mostrarInformacion();
    
    c2.sacarDinero(1200);
    System.out.println("\nMostrando cuenta 2:");
    c2.mostrarInformacion();
    
    System.out.println("\nMostrando cuenta 3:");
    c3.mostrarInformacion();
    
    miBanco.mostrarInformacion();

    
    miBanco.setCapital(7500000); 
    miBanco.setDireccion("Avenida Central 45");
    
    System.out.println("--- DESPUÉS DE LAS MODIFICACIONES ---");
    miBanco.mostrarInformacion();

  
    // miBanco.nombre = "Otro Banco"; // Error: El atributo es private
    // miBanco.setNombre("Otro Banco"); // Error: El método no existe 
    
    System.out.println("El nombre " + miBanco.getNombre() + " no se puede editar");
	}

}

