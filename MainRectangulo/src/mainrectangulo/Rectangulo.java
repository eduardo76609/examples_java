/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainrectangulo;

/**
 *
 * @author Eduardo76609
 */
public class Rectangulo {
    
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
        return 2 * this.base + 2 * this.altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return calcularPerimetro();
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    
}
