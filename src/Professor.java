import java.util.ArrayList;

public class Professor {
    private String senha;
    private static ArrayList<Professor> listaProfessor = new ArrayList<>();

    public  Professor(String senha) {
        this.senha = senha;

    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {

        this.senha = senha;
    }

    public static void adicionar(Professor professor){
        listaProfessor.add(professor);
    }



    public static boolean verificar(String senhaDigitada) {
        boolean login =true;
        for (Professor professor : listaProfessor) {

            if (professor.senha.equals(senhaDigitada)) {
                login=true;
                return login;

            }else{
                login=false;


            }
        }


        return login;
    }
}


