public class Equilatero extends Triangulo{
    public Equilatero(double lado1) {
        super(lado1, lado1, lado1);
        this.calcularArea(lado1);
    }



    public double getArea() {
        return area;
    }
    public double calcularArea(double lado1){
        area = (Math.sqrt(3) / 4) * Math.pow(lado1, 2);
        return area;

    }


}