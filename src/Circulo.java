import java.util.ArrayList;

public class Circulo extends FormasGeometricas {
    private static ArrayList<Circulo> listaCirculo = new ArrayList<>();
    private double diametro;
    private double  raio;


    public Circulo( double diametro){
        this.diametro = diametro;
        this.setPerimetro(diametro);
        this.setArea(diametro);
        this.setRaio(diametro);


    }

    public double getPerimetro() {
        return perimetro;
    }
    private void setPerimetro(double diametro){
        this.perimetro=3.14*diametro;
    }
    public double getRaio(){
        return this.raio;
    }

    private void setRaio(double diametro) {
        this.raio = diametro/2;
    }

    public double getArea() {
        return area;
    }
    private void setArea(double diametro) {
        raio=diametro/2;
        this.area = 3.14*raio*raio;
    }
    public static void addLista(Circulo circulo){
        listaCirculo.add(circulo);
       listaFormas.addAll(listaCirculo);
    }
    public static void mostrarLista(){
        for (Circulo circ : listaCirculo) {
            System.out.println(circ.toString());
        }
    }


    @Override
    public String toString() {
        return "Circulo{" +
                ", diametro=" + diametro +
                ", raio=" + raio +
                ", perimetro=" + perimetro +
                ", area=" + area +
                '}';
    }
}
