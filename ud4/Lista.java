package Lista;

import java.util.Arrays;

public class Lista {
	Integer[]lista;
	int capacidad;
	int cima;
Lista(){
	this.lista = new Integer[10];
	this.cima = 0;
	}

Lista(int capacidad) {
	this.lista = new Integer[capacidad];
	this.cima = 0;
	}

public void insertarFinal(int n) {
	if(cima == lista.length) {
		ampliar();
		}
	lista[cima] = n;
	cima++;
	}

public void insertarIndice(int ind, int n){
	if(ind >= 0 && ind <= cima) {
		if(cima == lista.length) {
			ampliar();
		}
		
		for(int i= cima; i> ind; i--) {
			lista[i] = lista[i-1];
		}
		lista[ind] = n;
		cima ++;
	} else
		System.out.println("Indice fuera de rango");
}

public void eliminarIndice(int ind) {
	if( ind  >= 0 && ind <cima ) {
		for(int i = ind; i<cima -1; i++) {
			lista[i] = lista[i+1];
		}
		lista[cima-1] = null;
		cima--;
	}
}

public void insertarPrincipio(int n) {
	if(cima == lista.length) {
		ampliar ();
	}
	
	for(int i = cima; i > 0; i--) {
		lista[i] = lista[i-1];
	}
	lista[0] = n;
	cima++;
}

public void insertarLista(Integer[]lista2) {
	for(int i = 0; i<lista2.length; i++) {
		if(lista2[i] != null) {
			if(cima == lista.length) {
				ampliar();
			}
			
			lista[cima] = lista2[i];
			cima++;
		}
	}
}

public Integer devolverElemento(int ind) {
	if (ind >= 0 && ind < cima) {
        return lista[ind];
    } else {
        System.out.println("Indice fuera de rango o vacio");
        return null;
    }
}

public Integer buscaNumero(int n) {
	int i = 0;
	while(i<cima) {
		if(lista[i] != null && lista[i] == n) {
			return i;
		}
		i++;
	}
	System.out.println("No existe el numero en la lista");
	return -1;
}

public void ampliar() {
	Integer[]nueva = new Integer [lista.length * 2];
	for(int i = 0; i<lista.length; i++) {
		nueva[i] = lista[i];
	}
	lista = nueva;
	}

@Override
public String toString() {
	return "Lista [lista=" + Arrays.toString(lista) + "]";
}


}
