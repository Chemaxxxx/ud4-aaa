package Lista;

public class Main {
public static void main(String[] args) {
	Lista l = new Lista();
	
	l.insertarFinal(8);
	l.insertarIndice(1, 5);
	l.insertarPrincipio(1);
	System.out.println(l.devolverElemento(0));
	System.out.println(l.buscaNumero(5));
	l.insertarPrincipio(6);
	l.insertarPrincipio(7);
	l.insertarIndice(0, 0);
	System.out.println(l);
}
}
