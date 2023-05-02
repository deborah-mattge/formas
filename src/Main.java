import java.util.Scanner;
public class Main {
    private Professor professor =new Professor();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        telaInicial();

    }
    private void add(){
        Professor professor =new Professor();
        professor.setSenha("123");
        Professor.listaProfessor.add(professor);

    }
    public static void telaInicial(){
        int i=1;
        do {
            System.out.println("Informe a senha: ");
            String senha = sc.next();
            boolean verificar = Professor.verificar(senha);
            if (verificar) {
                menu();

            } else {
                int cont = 1;
                System.out.println("senha incorreta");
                cont++;
                if (cont == 3) {
                    System.exit(0);
                }
            }
        }while(i==0);

    }

    public static void menu(){
        System.out.println("""
                1- circulo """);
    }
}