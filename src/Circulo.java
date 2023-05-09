import java.util.ArrayList;

public class Circulo extends FormasGeometricas {

    private double diametro;
    private double  raio;


    public Circulo( double raio){
        this.diametro = raio*2;
        this.setPerimetro(raio);
        this.setArea(raio);
        this.setRaio(raio);
        FormasGeometricas.adicionarForma(this);



    }

    public double getPerimetro() {
        return perimetro;
    }
    private void setPerimetro(double raio){
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
    private void setArea(double raio) {
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
