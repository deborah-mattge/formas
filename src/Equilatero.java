public class Equilatero extends Triangulo{
    public Equilatero(double lado1) {
        super(lado1, lado1, lado1);
        this.setArea();
       super.setTipo("equilatero");

    }



    public double getArea() {
        return area;
    }
    public void setArea(){
        this.area = (Math.sqrt(3) / 4) * Math.pow(lado1, 2);
    }


}