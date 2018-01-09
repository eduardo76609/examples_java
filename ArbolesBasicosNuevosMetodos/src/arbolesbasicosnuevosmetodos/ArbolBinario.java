package arbolesbasicosnuevosmetodos;

class ArbolBinario {

    Nodo raiz;
    Nodo actual;

    public ArbolBinario() {
        this.raiz = null;
        this.actual = null;
    }

    public boolean esVacio(Nodo n) {
        return (n == null);
    }

    public void insertar(Estudiante dato) {
        if (esVacio(raiz)) {
            raiz = new Nodo(dato);
            actual = raiz;
        } else {
            buscar_lugar(raiz, dato);
        }
    }

    public void buscar_lugar(Nodo n, Estudiante dato) {
        if (!esVacio(n)) {
            if ((n.dato).getCedula() > dato.getCedula()) {
                if (esVacio(n.hijoIzquierdo)) {
                    n.hijoIzquierdo = new Nodo(dato);
                    actual = n.hijoIzquierdo;
                } else {
                    buscar_lugar(n.hijoIzquierdo, dato);
                }
            } else if ((n.dato).getCedula() < dato.getCedula()) {
                if (esVacio(n.hijoDerecho)) {
                    n.hijoDerecho = new Nodo(dato);
                    actual = n.hijoDerecho;
                } else {
                    buscar_lugar(n.hijoDerecho, dato);
                }
            }
        } else {
            System.out.println("!Error¡ referencia a nodo invalidad");
        }
    }

    public Nodo buscar_padre(int cedula) {
        if (esVacio(raiz)) {
            return null;
        } else if (cedula == raiz.dato.getCedula()) {
            System.out.println("El dato no tiene padre ya que es la raiz");
            return null;
        } else {
            return padre(raiz, cedula);
        }
    }

    public Nodo padre(Nodo raiz, int cedula) {
        if (!esVacio(raiz.hijoIzquierdo) && (cedula < raiz.dato.getCedula())) {
            if (raiz.hijoIzquierdo.dato.getCedula() == cedula) {
                return raiz;
            } else {
                return padre(raiz.hijoIzquierdo, cedula);
            }
        } else if (!esVacio(raiz.hijoDerecho) && (cedula > raiz.dato.getCedula())) {
            if (raiz.hijoDerecho.dato.getCedula() == cedula) {
                return raiz;
            } else {
                return padre(raiz.hijoDerecho, cedula);
            }
        } else {
            System.out.println("Hijo no encontrado");
            return null;
        }
    }

    public Nodo find_key(int cedula) {
        return buscar_dato(raiz, cedula);
    }

    public Nodo buscar_dato(Nodo raiz, int cedula) {
        while (!esVacio(raiz)) {
            if (raiz.dato.getCedula() == cedula) {
                return raiz;
            } else if (raiz.dato.getCedula() > cedula) {
                raiz = raiz.hijoIzquierdo;
            } else {
                raiz = raiz.hijoDerecho;
            }

        }
        return null;
    }

}
