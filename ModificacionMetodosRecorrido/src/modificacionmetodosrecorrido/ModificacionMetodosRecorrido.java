package modificacionmetodosrecorrido;

public class ModificacionMetodosRecorrido {

    public static void main(String[] args) {
        
        Arbolbin miarbol = new Arbolbin();

        //Se crea una cuenta que va a ser insertada en el árbol
        Cuenta cuenta1 = new Cuenta(20, 1000);
        miarbol.insertar(cuenta1);

        Cuenta cuenta2 = new Cuenta(10, 2000);
        miarbol.insertar(cuenta2);

        Cuenta cuenta3 = new Cuenta(30, 5000);
        miarbol.insertar(cuenta3);
        
        System.out.println("inorder_nr: ");
        miarbol.inorder_nr(miarbol.raiz);
        
        System.out.println("preorder_nr: ");
        miarbol.preorder_nr(miarbol.raiz);
        
        System.out.println("postorder_nr: ");
        miarbol.postorder_nr(miarbol.raiz);

    }
    
}
