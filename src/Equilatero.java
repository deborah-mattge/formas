public class Equilatero extends Triangulo{
    public Equilatero(double lado1) {
        super(lado1, lado1, lado1);
        this.setArea(lado1);

    }



    public double getArea() {
        return area;
    }
    public void setArea(double lado1){
        this.area = (Math.sqrt(3) / 4) * Math.pow(lado1, 2);
    }


}