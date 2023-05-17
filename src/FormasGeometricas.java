import java.util.ArrayList;


public abstract class FormasGeometricas {
     double area;
     double perimetro;
    double lado1;

     static ArrayList<FormasGeometricas> listaFormas = new ArrayList<>();



    public static void adicionarForma(FormasGeometricas forma){
        listaFormas.add(forma);

    }

     public static void  mostrarTodos(){
         for(FormasGeometricas form : listaFormas){
             System.out.println(form.toString());
         }
     }
    public static void mostrarCirculo(){
        for(FormasGeometricas forma :listaFormas){
            if(forma instanceof Circulo){
                System.out.println(forma);
            }
        }
    }
    public static void mostrarTriangulo(){
        for(FormasGeometricas forma :listaFormas){
            if(forma instanceof Triangulo){
                System.out.println(forma);
            }
        }
    }
    public static void mostrarQuadrado(){
        for(FormasGeometricas forma :listaFormas){
            if(forma instanceof Quadrado){
                System.out.println(forma);
            }
        }
    }
    public static void mostrarRetangulo(){
        for(FormasGeometricas forma :listaFormas){
            if(forma instanceof Retangulo){
                System.out.println(forma);
            }
        }
    }


  public abstract void setArea();
  public abstract void setPerimetro();

}
