package arbolesbasicosviernes;

public class Cuenta {
    
    int codigo;
    String nombreCliente;
    int saldo;

    public Cuenta(int codigo, float saldo) {
        this.codigo = codigo;
        this.saldo = 0;
    }

    public Cuenta() {
        this.codigo = 0;
        this.nombreCliente = "";
        this.saldo = 0;
    }
    
//    public Cuenta(int codigo, String nombreCliente, float saldo) {
//        this.codigo = codigo;
//        this.nombreCliente = nombreCliente;
//        this.saldo = saldo;
//    }
    
    public int key(){
        return codigo;
    }
       
}
