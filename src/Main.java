import java.util.Scanner;
public class  Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        add();
        telaInicial();
//     FormasGeometricas forma1 =new FormasGeometricas();
//        FormasGeometricas forma2 =new Quadrado(1);
//        Quadrado forma3 =new Quadrado(2);
//        Quadrado  quadrado =(Quadrado) forma2;/


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
                cont=3;
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
            System.out.println("Informe o raio: ");
            double raio = sc.nextDouble();
            FormasGeometricas forma= new Circulo(raio);

        }
        public static void cadastroTriangulo(){
            System.out.println("Informe o lado 1 do triangulo: ");
            double lado1= sc.nextDouble();
            System.out.println("Informe o lado 2 do triangulo: ");
            double lado2= sc.nextDouble();
            System.out.println("Informe o lado 3 do triangulo: ");
            double lado3= sc.nextDouble();
            if ((lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado1 + lado3 > lado2)) {
                Triangulo.defineTipo(lado1,lado2,lado3);

            } else {
                System.out.println("Os valores não formam um triângulo.");
            }
        }
        public static void cadastrarQuadrado(){
            System.out.println("Informe o lado do quadrado: ");
            double lado= sc.nextDouble();
            Quadrado quadrado = new Quadrado(lado);




        }
        public static void cadastrarRetangulo(){
            System.out.println("Informe o lado 1: ");
            double lado1= sc.nextDouble();
            System.out.println("Informe o lado 2: ");
            double lado2= sc.nextDouble();
        if(lado1!=lado2){
            Retangulo retangulo=new Retangulo(lado1, lado2);


        }else{
            System.out.println("forma inválida");
            }

        }
        public static void listas(){
        String objetos=" ";
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
                    objetos=Circulo.mostrarObjetos();
                    System.out.println(objetos);
                    break;
                case 2:
                    objetos=Triangulo.mostrarObjetos();
                    System.out.println(objetos);
                    break;

                case 3:
                    objetos=Quadrado.mostrarObjetos();
                    System.out.println(objetos);
                    break;
                case 4:
                    objetos=Retangulo.mostrarObjetos();
                    System.out.println(objetos);
                    break;
                case 5:
                    objetos=FormasGeometricas.mostrarObjeto();
                    System.out.println(objetos);
                    break;
                case 6:
                    return;


            }
        }while(true);

        }


    }

