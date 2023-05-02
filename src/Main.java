import java.util.Scanner;
public class  Main {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        add();
        telaInicial();


    }
   public static void add(){
        Professor professor = new Professor("123");
        Professor.adicionar(professor);


    }

    public static void telaInicial(){
        int cont = 3;
        while (cont > 0) {
            System.out.println("Informe a senha: ");
            String senha = sc.next();
            boolean verificar = Professor.verificar(senha);
            if (verificar) {
                menu();
                return;
            } else {
                System.out.println("Senha incorreta. Tentativas restantes: " + (--cont));
            }
        }
        System.out.println("Número de tentativas excedido. Encerrando programa.");
        System.exit(0);
    }


    public static void menu(){
        System.out.println("""
                1- circulo """);
    }
}