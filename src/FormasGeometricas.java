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


  public abstract void setArea();
  public abstract void setPerimetro();

}
