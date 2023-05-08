public class Equilatero extends Triangulo {
    public Equilatero(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }

    public double getArea(double lado1) {
        double Lado1=lado1;
        return Math.sqrt(3) / 4 * Math.pow(Lado1, 2);

    }
}