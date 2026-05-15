import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Digite o valor do raio: ");
        double r = entrada.nextDouble();
        System.out.println("Área da bola = " + (4 * pi * r * r));

    }
}
