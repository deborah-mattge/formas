import java.util.ArrayList;

public class Triangulo  extends FormasGeometricas{
    private static ArrayList<Triangulo> listaTriangulo=new ArrayList<>();
    private double lado2,lado3;
    private String tipo;

    public Triangulo(double lado1, double lado2, double lado3){
        this.lado2=lado2;
        this.lado1=lado1;
        this.lado3=lado3;
        this.setPerimetro(lado1,lado2,lado3);
        this.setTipo(lado1,lado2,lado3);


    }

    public String getTipo() {
        return tipo;
    }

    private void setTipo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado1 == lado3) {
            this.tipo = "equilátero";
            Equilatero equilatero = new Equilatero(lado1, lado2, lado3);
            this.area=equilatero.getArea(lado1);

        }
    }
        private void setPerimetro(double lado1, double lado2, double lado3){
        this.perimetro=lado1+lado2+lado3;


        }

        public static void addLista(Triangulo triangulo){
        listaTriangulo.add(triangulo);
        }
        public static void mostrarLista(){
            for (Triangulo trig : listaTriangulo) {
                System.out.println(trig.toString());
            }
        }
    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                "lado2=" + lado2 +
                "lado3=" + lado3 +
                ", area=" + area +
                "tipo=" + tipo +
                ", perimetro=" + perimetro +
                '}';
    }
    }







