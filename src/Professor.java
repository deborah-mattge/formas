import java.util.ArrayList;

public class Professor {
    private String senha;
    static ArrayList<Professor> listaProfessor = new ArrayList<>();

    public void Professor(String senha) {
        this.senha = senha;

    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {

        this.senha = senha;
    }

    public static boolean verificar(String senhaDigitada) {
        System.out.println(listaProfessor);
        for (Professor professor : listaProfessor) {
            System.out.println(listaProfessor);
            if (professor.senha == senhaDigitada) {
                return true;

            }
        }


        return false;
    }
}


