import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Operadores lógicos: &, ||, !
        // operadores relacionais: >, <, >=, <=, ==, !=
        // Operador de atribuição: =
        // Operadores aritméticos: +, -, /, *, % (mod)

        /*
         * int a = 1;
         * int b = 2;
         * 
         * double resultado = a / (double) b;
         * 
         * System.out.println(resultado);
         * System.out.printf("%.4f \n",resultado);
         */

        int a = 1;
        int b = 2;
        /* a = a + 1;
        a += 1;
        a++;
        a--; */

        if (a == 1 && b == 2){
            System.out.println("Entrou no if");
        }else{
            System.out.println("Entrou no else");
        }

        teclado.close();
    }
}
