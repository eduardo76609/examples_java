package arbolesbasicosviernes;

public class Arbolbin {

    Nodo raiz;
    Nodo actual;

    public Arbolbin() {
        raiz = null;
        actual = null;
    }

    public boolean esVacio(Nodo a) {
        return (a == null);
    }

    public void insertar(Cuenta dato) {
        if (esVacio(raiz)) {
            raiz = new Nodo(dato);
            actual = raiz;
        } else {
            buscar_lugar(raiz, dato);
        }
    }

    public void buscar_lugar(Nodo r, Cuenta dato) {
        if (!esVacio(r)) {
            if ((r.dato).key() > dato.key()) {
                if (esVacio(r.hijoIzquierdo)) {
                    r.hijoIzquierdo = new Nodo(dato);
                    actual = r.hijoIzquierdo;
                } else {
                    buscar_lugar(r.hijoIzquierdo, dato);
                }
            } else if ((r.dato).key() < dato.key()) {
                if (esVacio(r.hijoDerecha)) {
                    r.hijoDerecha = new Nodo(dato);
                    actual = r.hijoDerecha;
                } else {
                    buscar_lugar(r.hijoDerecha, dato);
                }
            
            } 
            
        } else {
            System.out.println("!Error¡ referencia a nodo invalidad");
        }
    }

    public void preorden(Nodo r) {
        if (!esVacio(r)) {
            System.out.println((r.dato).codigo);
            preorden(r.hijoIzquierdo);
            preorden(r.hijoDerecha);
        }
    }

    public void posorden(Nodo r) {
        if (!esVacio(r)) {
            posorden(r.hijoIzquierdo);
            posorden(r.hijoDerecha);
            System.out.println((r.dato).codigo);
        }
    }

    public void inorden(Nodo r) {
        if (!esVacio(r)) {
            inorden(r.hijoIzquierdo);
            System.out.println((r.dato).codigo);
            inorden(r.hijoDerecha);
        }
    }

}
