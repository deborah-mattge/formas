import java.util.ArrayList;

public class Quadrado extends FormasGeometricas {





    public Quadrado (double lado){
        this.lado1=lado;
        this.setPerimetro();
        this.setArea();
        FormasGeometricas.adicionarForma(this);

    }

    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(){
        this.perimetro=lado1*4;
    }

    public double getArea() {
        return area;
    }
    public void setArea(){
        this.area=lado1*lado1;
    }
    public static void addLista(Quadrado quadrado){
       FormasGeometricas.adicionarForma(quadrado);

    }


    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado1 +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }
}

