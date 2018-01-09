// ejercicio clase 20 de febrero

public class Rectangulo(){

  float base, altura, area, perimetro;

  public Rectangulo(float mbase, float maltura){
    this.base = mbase;
    this.altura = maltura;
    this.area = (mbase * maltura);
    this.perimetro = (2 * mbase) + (2 + maltura);
  }

  public float calcularArea(){
    return (this.base * this.altura);
  }

  public float calcularPerimetro(){
    return (this.base * 2) + (this.altura * 2);
  }

  //

  public void setBase(float mbase){
    this.base = mbase;
  }

  public void setAltura(){}

  public void setArea(){}

  public void setPerimetro(){}

  //

  public float getBase(){
    return this.base;
  }

  public float getAltura(){}

  public float getArea(){}

  public float getPerimetro(){}

}
