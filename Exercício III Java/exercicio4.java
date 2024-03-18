import java.util.Scanner;

public class exercicio4 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o indicador de operação (1 para perímetro do círculo, 2 para área do círculo, 3 para volume da esfera):");
    int operacao = scanner.nextInt();

    System.out.println("Digite o raio do círculo ou esfera:");
    double raio = scanner.nextDouble();

    double resultado = 0;

    if (operacao == 1) {
        resultado = 2 * Math.PI * raio;
        System.out.println("Perímetro do círculo: " + resultado);
    } else if (operacao == 2) {
        resultado = Math.PI * raio * raio;
        System.out.println("Área do círculo: " + resultado);
    } else if (operacao == 3) {
        resultado = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        System.out.println("Volume da esfera: " + resultado);
    } else {
        System.out.println("Código da operação inválido.");
    }

    scanner.close();
}
}