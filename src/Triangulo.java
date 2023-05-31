import java.util.ArrayList;

public abstract class Triangulo  extends FormasGeometricas{

    double lado2,lado3;
    private String tipo;

    public Triangulo(double lado1, double lado2, double lado3){
        this.lado2=lado2;
        this.lado1=lado1;
        this.lado3=lado3;
        this.setPerimetro();
        FormasGeometricas.adicionarForma(this);




    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo=tipo;
    }

    public static Triangulo defineTipo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado1 == lado3) {
            return new Equilatero(lado1);
        }else if(lado1!=lado2 && lado2!=lado3 && lado1!=lado3){
            return new Escaleno(lado1, lado2, lado3);

        }else if(lado1==lado2 && lado1!=lado3 || lado1==lado3 && lado1!=lado2 || lado2==lado3 && lado3!=lado2){
           return new Isosceles(lado1, lado2, lado3);


        }
        return null;
    }


    @Override
    public void setPerimetro(){
        this.perimetro=lado1+lado2+lado3;
        }


    public static String mostrarObjetos(){
        String objetos="";
        for(FormasGeometricas forma :listaFormas){
            if(forma instanceof Triangulo){
                objetos+=forma;
            }
        }
        return objetos;
    }


    @Override
    public String toString() {
        return "\nTriangulo" +
                "\nlado1=" + lado1 +
                ",lado2=" + lado2 +
                ",lado3=" + lado3 +
                "\narea=" + area +
                "\ntipo=" + tipo +
                "\nperimetro=" + perimetro;
    }
    }







