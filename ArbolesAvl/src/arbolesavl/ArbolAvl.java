package arbolesavl;

public class ArbolAvl {
    
    Nodo raiz;
    Nodo actual;
    
    public ArbolAvl() {
        raiz = null;
        actual = null;
    }
    
    public void rotacion_derecha(Nodo p, Nodo q) {
        p.hijoIzquierdo = q.hijoDerecho;
        q.hijoDerecho = p;
        p.FB = 0;
        q.FB = 0;
    }
    
    public void rotacion_izquierda(Nodo p, Nodo q) {
        p.hijoDerecho = q.hijoIzquierdo;
        q.hijoDerecho = p;
        p.FB = 0;
        q.FB = 0;
    }
    
    public Nodo doble_rotacion_derecha(Nodo p, Nodo q) {
        Nodo r = q.hijoDerecho;
        int factor_r = r.FB;
        rotacion_izquierda(q, r);
        rotacion_derecha(p, r);
        
        switch(factor_r) {
            case 0:
                p.FB = 0;
                q.FB = 0;
                break;
                
            case 1:
                p.FB = -1;
                q.FB = 0;
                break;
                
            case -1:
                p.FB = 0;
                q.FB = 1;
                break;
                
        }
        r.FB = 0;
        return r;
        
    }
    
        public Nodo doble_rotacion_izquierda(Nodo p, Nodo q) {
        Nodo r = q.hijoIzquierdo;
        int factor_r = r.FB;
        rotacion_derecha(q, r);
        rotacion_izquierda(p, r);
        
        switch(factor_r) {
            case 0:
                p.FB = 0;
                q.FB = 0;
                break;
                
            case 1:
                p.FB = 0;
                q.FB = -1;
                break;
                
            case -1:
                p.FB = 1;
                q.FB = 0;
                break;
                
        }
        r.FB = 0;
        return r;
    }
        
        public void insertar(int dato) {
            
            Nodo x = new Nodo(dato);
            Nodo p = raiz;
            Nodo q = null;
            Nodo pivote = raiz;
            Nodo pp = null;
            
            if (raiz == null) {
                raiz = x;
                actual = x;
            } else {
                while (p != null) {
                    
                    if (p.clave == dato) {
                        return;
                    }
                    
                    if (p.FB != 0) {
                        pivote = p;
                        pp = q;
                    }
                    
                    q = p;
                    
                    if (p.clave > dato) {
                        p = p.hijoIzquierdo;
                    } else {
                        p = p.hijoDerecho;
                    }
                    
                    if (q.clave > dato) {
                        q.hijoIzquierdo = x;
                    } else {
                        q.hijoDerecho = x;
                    }
                    
                    if (pivote.clave > dato) {
                        pivote.FB = pivote.FB + 1;
                        q = pivote.hijoIzquierdo;
                    } else {
                        pivote.FB = pivote.FB - 1;
                        q = pivote.hijoDerecho;
                    }
                    
                    p = q;
                    
                    while (p != x) {
                        if (p.clave > dato) {
                            p.FB = 1;
                            p = p.hijoIzquierdo;
                        } else {
                            p.FB = -1;
                            p = p.hijoDerecho;
                        }
                    }
                    
                    if (pivote.FB == 0 || pivote.FB == -1 || pivote.FB == 1) {
                        return;
                    } else if (pivote.FB == 2 && q.FB == 1) {
                        rotacion_derecha(pivote, q);
                    } else if (pivote.FB == -2 && q.FB == -1) {
                        rotacion_izquierda(pivote, q);
                    } else if (pivote.FB == 2 && q.FB == -1) {
                        q = doble_rotacion_derecha(pivote, q);
                    } else if (pivote.FB == -2 && q.FB == 1) {
                        q = doble_rotacion_izquierda(pivote, q);
                    }
                    
                    if (pp == null) {
                        raiz = q;
                        return;
                    }
                    
                    if (pivote == pp.hijoIzquierdo) {
                        pp.hijoIzquierdo = q;
                    } else {
                        pp.hijoDerecho = q;
                    }
                    
                }
            }
        }
        
        public void inorden(Nodo r) {
            if (r != null) {
                inorden(r.hijoIzquierdo);
                System.out.println(r.clave);
                inorden(r.hijoDerecho);
            }
        }
        
}
