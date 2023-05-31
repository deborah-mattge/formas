import java.util.ArrayList;


public abstract class FormasGeometricas {
     double area;
     double perimetro;
    double lado1;

     static ArrayList<FormasGeometricas> listaFormas = new ArrayList<>();



    public static void adicionarForma(FormasGeometricas forma){
        listaFormas.add(forma);

    }
    public static String mostrarObjeto(){
        String objetos="";
        for(FormasGeometricas forma : listaFormas){
            objetos+="\n"+forma+"\n";
        }
        return objetos;
    }




  public abstract void setArea();
  public abstract void setPerimetro();

}
