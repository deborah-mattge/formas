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
     @Override
     public void setArea(){
         this.area=lado1*lado2;
     }
     @Override
    public void setPerimetro(){
        this.perimetro=2*(lado1+lado2);
    }

    public static String mostrarObjetos(){
        String objetos="";
        for(FormasGeometricas forma :listaFormas){
            if(forma instanceof Retangulo){
                objetos+=forma+"\n";
            }
        }
        return objetos;
    }

    @Override
    public String toString() {
        return "\nRetangulo:" +
                "\nlado1=" + lado1 +
                ",lado2=" + lado2 +
                "\narea=" + area +
                "\nperimetro=" + perimetro
                ;
    }
}
