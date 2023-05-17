import java.util.ArrayList;

public class Retangulo extends FormasGeometricas {
     private double lado2;

     public Retangulo(double lado1, double lado2){
         this.lado1=lado1;
         this.lado2=lado2;
         this.setArea();
         this.setPerimetro();
         FormasGeometricas.adicionarForma(this);


     }
     public double getArea(){
         return area;
     }
     public void setArea(){
         this.area=lado1*lado2;
     }
    public void setPerimetro(){
        this.perimetro=2*(lado1+lado2);
    }
    public static void addLista(Retangulo retangulo){
        FormasGeometricas.adicionarForma(retangulo);


    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "lado1=" + lado1 +
                "lado2=" + lado2 +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }
}
