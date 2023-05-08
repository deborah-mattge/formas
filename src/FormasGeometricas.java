import java.util.ArrayList;


public class FormasGeometricas {
     double area;
     double perimetro;
    double lado1;
     static ArrayList<FormasGeometricas> listaFormas = new ArrayList<>();

     public static void  mostrarTodos(){
         for(FormasGeometricas form : listaFormas){
             System.out.println(form.toString());
         }
     }








}
