import java.util.ArrayList;

public class Quadrado extends FormasGeometricas {

    private static ArrayList<Quadrado> listaQuadrado = new ArrayList<>();



    public Quadrado (double lado){
        this.lado1=lado;
        this.setPerimetro(lado);
        this.setArea(lado);

    }

    public double getPerimetro() {
        return perimetro;
    }
    private void setPerimetro(double lado){
        this.perimetro=lado*4;
    }

    public double getArea() {
        return area;
    }
    private void setArea(double lado){
        this.area=lado*lado;
    }
    public static void addLista(Quadrado quadrado){
        listaQuadrado.add(quadrado);
        listaFormas.addAll(listaQuadrado);

    }
    public static void mostrarLista(){
        for (Quadrado quad : listaQuadrado) {
            System.out.println(quad.toString());
        }
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

