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
    @Override
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

    @Override
    public void setArea() {
       this.area = 3.14*raio*raio;

    }

    public static String mostrarObjetos(){
        String objetos="";
        for(FormasGeometricas forma :listaFormas){
            if(forma instanceof Circulo){
                objetos+=forma+"\n";
            }
        }
        return objetos;
    }





    @Override
    public String toString() {
        return "\nCirculo" +
                "\ndiametro=" + raio*2 +
                "\nraio=" + getRaio() +
                "\nperimetro=" + getPerimetro() +
                "\narea=" + getArea();
    }
}
