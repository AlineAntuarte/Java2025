import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Operadores lógicos: &, ||, !
        // operadores relacionais: >, <, >=, <=, ==, !=
        // Operador de atribuição: =
        // Operadores aritméticos: +, -, /, *, % (mod)

        double a = 10;
        double b = 3;

        double resultado = a / b;

        System.out.println(resultado);
        System.out.printf("%.4f \n",resultado);
        
        teclado.close();
    }
}
