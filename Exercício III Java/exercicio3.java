import java.util.Scanner;

public class exercicio3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os coeficientes da equação de segundo grau (ax^2 + bx + c):");
        System.out.print("Coeficiente 'a': ");
        double a = scanner.nextDouble();

        System.out.print("Coeficiente 'b': ");
        double b = scanner.nextDouble();

        System.out.print("Coeficiente 'c': ");
        double c = scanner.nextDouble();

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            System.out.println("Essa é uma equação de primeiro grau.");
            double raiz = -c / b;
            System.out.println("Raiz real da equação: " + raiz);
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais.");
                System.out.println("Raiz real: " + raiz);
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                System.out.println("Raiz 1: " + raiz1);
                System.out.println("Raiz 2: " + raiz2);
            }
        }
        scanner.close();
    }
}
