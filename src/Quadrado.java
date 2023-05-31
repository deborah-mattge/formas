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
    @Override
    public void setPerimetro(){
        this.perimetro=lado1*4;
    }

    public double getArea() {
        return area;
    }
    @Override
    public void setArea(){
        this.area=lado1*lado1;
    }

    public static String mostrarObjetos(){
        String objetos="";
        for(FormasGeometricas forma :listaFormas){
            if(forma instanceof Quadrado){
                objetos+=forma+"\n";
            }
        }
        return objetos;
    }


    @Override
    public String toString() {
        return "\nQuadrado" +
                "\nlado=" + lado1 +
                "\narea=" + area +
                "\nperimetro=" + perimetro ;
    }
}

