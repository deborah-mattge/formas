public class Escaleno extends Triangulo{
    public Escaleno(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
        this.setArea(lado1, lado2,lado3);
        this.setTipo("escaleno");


    }
    public double getArea() {
        return area;
    }
    public void setArea(double lado1, double lado2, double lado3){
        double s = perimetro / 2.0;
        System.out.println(s);
         this.area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));;
    }


}
