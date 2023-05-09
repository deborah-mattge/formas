import java.util.ArrayList;

public class Retangulo extends FormasGeometricas {
     private double lado2;

     public Retangulo(double lado1, double lado2){
         this.lado1=lado1;
         this.lado2=lado2;
         this.setArea(lado1,lado2);
         this.setPerimetro(lado1,lado2);


     }
     public double getArea(){
         return area;
     }
     private void setArea(double lado1,double lado2){
         this.area=lado1*lado2;
     }
    private void setPerimetro(double lado1,double lado2){
        this.perimetro=2*(lado1+lado2);
    }
    public static void addLista(Retangulo retangulo){
        FormasGeometricas.adicionarForma(retangulo);


    }
    public static void mostrarLista() {
        for (Retangulo ret : listaRetangulo) {
            System.out.println(ret.toString());
        }
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
