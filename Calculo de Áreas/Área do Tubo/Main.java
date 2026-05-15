import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pi = 3.14;
        float r, h;
        System.out.println("Digite o valor do raio: ");
        r = entrada.nextFloat();
        System.out.println("Digite o valor da altura: ");
        h = entrada.nextFloat();
        System.out.println("Área do tubo = " + (2 * pi * r * h));
}
}
