package modificacionmetodosrecorrido;

import java.util.Stack;

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

    public void inorder_nr(Nodo r) {
        Stack<Nodo> s = new Stack<Nodo>();
        while (true) {
            while (r != null) {
                s.push(r);
                r = r.hijoIzquierdo;
            }
            if (s.isEmpty()) {
                return;
            }
            r = s.pop();
            System.out.println((r.dato).codigo);
            r = r.hijoDerecha;
        }
    }

    public void preorder_nr(Nodo r) {
        Stack<Nodo> s = new Stack<Nodo>();
        while (true) {
            while (r != null) {
                System.out.println((r.dato).codigo);
                s.push(r);
                r = r.hijoIzquierdo;
            }
            if (s.isEmpty()) {
                return;
            }
            r = s.pop();
            r = r.hijoDerecha;
        }
    }

    public void postorder_nr(Nodo r) {
        Stack<Nodo> s1 = new Stack<Nodo>();
        Stack<Nodo> s2 = new Stack<Nodo>();
        s1.push(r);
        while (s1.isEmpty() == false) {
            Nodo temp = s1.pop();
            s2.push(temp);
            if (temp.hijoIzquierdo != null) {
                s1.push(temp.hijoIzquierdo);
            }
            if (temp.hijoDerecha != null) {
                s1.push(temp.hijoDerecha);
            }
        }
        while (s2.isEmpty() == false) {
            System.out.println(s2.pop().dato.codigo);
        }
    }

}
