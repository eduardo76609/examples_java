package arbolesbasicosviernes;

public class ArbolesBasicosViernes {

    public static void main(String[] args) {
        //Se crea un árbol
        Arbolbin miarbol = new Arbolbin();

        //Se crea una cuenta que va a ser insertada en el árbol
        Cuenta cuenta1 = new Cuenta(20, 1000);
        miarbol.insertar(cuenta1);

        Cuenta cuenta2 = new Cuenta(10, 2000);
        miarbol.insertar(cuenta2);

        Cuenta cuenta3 = new Cuenta(30, 5000);
        miarbol.insertar(cuenta3);
        
        System.out.println("inorden: ");
        miarbol.inorden(miarbol.raiz);
        
        System.out.println("preorden: ");
        miarbol.preorden(miarbol.raiz);
        
        System.out.println("posorden: ");
        miarbol.posorden(miarbol.raiz);

    }

}
