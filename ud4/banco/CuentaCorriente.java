package ud4.cuenta;

public  class CuentaCorriente {

	private double limiteDescubrimiento;
	private double saldo;
	public String nombre;
	 String dni;
	 private static String nombreBanco = "Banco Santander";
	
	
	 CuentaCorriente (String nombre, String dni) {
		this.nombre=nombre;
		this.dni = dni;
		this.saldo = 0;
		this.limiteDescubrimiento = -50;
	}
	 
	 CuentaCorriente (double saldo) {
		 	this.saldo = saldo;
	        this.nombre = "Sin nombre";
	        this.limiteDescubrimiento = 0;
	        this.dni = "DNI desconocido";
		}
	 	
	 CuentaCorriente (double saldo,  double limiteDescubrimiento, String dni) {
		 	this.saldo = saldo;
	        this.limiteDescubrimiento = limiteDescubrimiento;
	        this.dni = dni;
	        this.nombre = "Titular desconocido";
		}
	 
	 
	public double getLimiteDescubrimiento() {
		return limiteDescubrimiento;
	}
	public void setLimiteDescubrimiento(double limiteDescubrimiento) {
		this.limiteDescubrimiento = limiteDescubrimiento;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public boolean sacarDinero(double cantidad) {
		boolean posible;
		
		if(this.saldo-cantidad>=limiteDescubrimiento) {
			this.saldo-=cantidad;
			System.out.println("Operación realizada, ha sacado " + cantidad + " €");
			posible=true;
		}else {
			System.out.println("Error, limite de descubrimiento excedido");
			posible = false;
		}
		return posible;
	}
	
	public void ingresarDinero(double cantidad) {
        this.saldo += cantidad;
        System.out.println("Se han ingresado: " + cantidad + "€");
    }
	
	public void mostrarInformacion() {
        System.out.println("--- INFORMACIÓN DE LA CUENTA ---");
        System.out.println("Banco: " + nombreBanco);
        System.out.println("Titular: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo actual: " + saldo + "€");
        System.out.println("Límite descubierto: " + limiteDescubrimiento + "€");
        System.out.println("--------------------------------");
    }

	public static String getNombreBanco() {
		return nombreBanco;
	}

	public static void setNombreBanco(String nombreBanco) {
		CuentaCorriente.nombreBanco = nombreBanco;
	}
	
}
