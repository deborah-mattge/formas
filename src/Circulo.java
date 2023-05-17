import java.util.ArrayList;

public class Circulo extends FormasGeometricas {

    private double diametro;
    private double  raio;


    public Circulo( double raio){
        this.diametro = raio*2;
        this.setPerimetro();
        this.setArea();
        this.setRaio(raio);
        FormasGeometricas.adicionarForma(this);



    }

    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(){
        this.perimetro=3.14*2*raio;

    }
    public double getRaio(){
        return this.raio;
    }

    private void setRaio(double raio) {
        this.raio =raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea() {
       this.area = 3.14*raio*raio;

    }




    @Override
    public String toString() {
        return "Circulo{" +
                ", diametro=" + raio*2 +
                ", raio=" + getRaio() +
                ", perimetro=" + getPerimetro() +
                ", area=" + getArea() +
                '}';
    }
}
