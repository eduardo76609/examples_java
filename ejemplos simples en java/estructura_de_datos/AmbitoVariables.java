public class AmbitoVariables(){

  public static void main(String[] args){

    int numeroEstudiante = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estudiantes"));

    Estudiante Sistemas[] = new Estudiante[NumeroEstudiantes];

    for(int i = 0; i < Sistemas.length; i++){
      int Carne = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de carnet del estudiante " + i));
      String Nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante " + i);
      Sistemas[i] = new Estudiante(Carne, Nombre);
    }

    for(int i = 0; i < Sistemas.length; i++){
      System.out.println("El estudiante con carne: " + Sistemas[i].getCarnet() + " Se llama: " + Sistemas[i].getNombre())
    }

  }

}
