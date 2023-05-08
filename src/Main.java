import java.util.Scanner;
public class  Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        add();
        telaInicial();


    }

    public static void add() {
        Professor professor = new Professor("123");
        Professor.adicionar(professor);


    }

    public static void telaInicial() {
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


    public static void menu() {

        do {
            System.out.println("""
                    Informe a forma que deseja cadastrar:
                    1- circulo 
                    2- triângulo
                    3- quadrado
                    4- retângulo 
                    5- Listar formas
                    6- logout
                    """);
            int opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    cadastroCirculo();
                    break;
                case 2:
                    cadastroTriangulo();
                    break;
                case 3:
                    cadastrarQuadrado();
                    break;
                case 4:
                    cadastrarRetangulo();
                    break;
                case 5:
                    listas();
                    break;
                case 6:
                    return;



            }
        }while (true) ;



        }
        public static void cadastroCirculo(){
            System.out.println("Informe o diametro: ");
            double diametro = sc.nextDouble();
            Circulo circulo = new Circulo(diametro);
            Circulo.addLista(circulo);
            System.out.println(circulo.toString());
        }
        public static void cadastroTriangulo(){
            System.out.println("Informe o lado 1 do triangulo: ");
            double lado1= sc.nextDouble();
            System.out.println("Informe o lado 2 do triangulo: ");
            double lado2= sc.nextDouble();
            System.out.println("Informe o lado 3 do triangulo: ");
            double lado3= sc.nextDouble();
            Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
            Triangulo.addLista(triangulo);
            Triangulo.mostrarLista();

        }
        public static void cadastrarQuadrado(){
            System.out.println("Informe o lado do quadrado: ");
            double lado= sc.nextDouble();
            Quadrado quadrado = new Quadrado(lado);
            Quadrado.addLista(quadrado);
            Quadrado.mostrarLista();


        }
        public static void cadastrarRetangulo(){
            System.out.println("Informe o lado 1: ");
            double lado1= sc.nextDouble();
            System.out.println("Informe o lado 2: ");
            double lado2= sc.nextDouble();
        if(lado1!=lado2){
            Retangulo retangulo=new Retangulo(lado1, lado2);
            Retangulo.addLista(retangulo);
            Retangulo.mostrarLista();
        }else{
            System.out.println("forma inválida");
            }

        }
        public static void listas(){
        do {
            System.out.println("""
                    Informe a lista que deseja vizualizar:
                    1- circulo 
                    2- triangulo
                    3- quadrado
                    4- retangulo
                    5- todos
                    6- voltar 
                    """);
            int opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    Circulo.mostrarLista();
                    break;
                case 2:
                    break;
                case 3:
                    Quadrado.mostrarLista();
                    break;
                case 4:
                    Retangulo.mostrarLista();
                case 5:
                    FormasGeometricas.mostrarTodos();
                    break;
                case 6:
                    return;

            }
        }while(true);

        }


    }

