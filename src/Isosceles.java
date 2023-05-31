public class Isosceles extends Triangulo{

    public Isosceles(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
        this.setArea();
        super.setTipo("isosceles");

    }
    @Override
    public void setArea() {
        if (lado1 == lado2) {
            double altura = Math.sqrt(lado1 * lado1 - (lado3 * lado3) / 4);
            area = lado3 * altura / 2;
        } else if (lado2 == lado3) {
            double altura = Math.sqrt(lado2 * lado2 - (lado1 * lado1) / 4);
            area = lado1 * altura / 2;
        } else if (lado1 == lado3) {
            double altura = Math.sqrt(lado3 * lado3 - (lado2 * lado2) / 4);
            area = lado2 * altura / 2;
        }

    }
    public double getArea(){
        return area;
    }

}

