package arbolesavl;

public class ArbolesAvl {

    public static void main(String[] args) {

        ArbolAvl miArbolAVL = new ArbolAvl();

        miArbolAVL.insertar(9);
        miArbolAVL.insertar(6);
        miArbolAVL.insertar(1);

        miArbolAVL.inorden(miArbolAVL.raiz);
    }

}
