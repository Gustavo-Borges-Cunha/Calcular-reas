import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int c,l,h;
        System.out.println("Insira o comprimento");
        c = entrada.nextInt();
        System.out.println("Insira a largura");
        l = entrada.nextInt();
        System.out.println("Insira a altura");
        h = entrada.nextInt();
        System.out.println("Area da Caixa = "+ 2 * (c*l + c*h + l*h));
       }
}      
    
