import java.util.ArrayList;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        

       int[] notas = { 50, 20, 10, 5, 2, 1 };

        
        System.out.println("Digite o que deseja comprar: [1, 2, 3, ou 4]");
        System.out.println(" 1-Refrigerante R$10 \n 2-Doce R$2 \n 3-Sucos R$4 \n 4- Salgadinhos R$7");
        int opcao = scanner.nextInt();
        
        int valor;

        switch (opcao) {
            case 1:
              valor = 10;
              break;
            case 2:
              valor = 5;
              break;
            case 3:
              valor = 2;
              break;
            case 4:
              valor = 4;
              break;
            default:
              System.out.println("Opcao invalida");
              return;
          }
      
          System.out.println("Valor pago:");
          int valorPago = scanner.nextInt();
      
          if (valorPago < valor) {
            System.out.println("Valor insuficiente!");
          }
      
          int troco = valorPago - valor;
      
          System.out.println("Troco a ser dado:" + troco);
      
          for (int nota : notas) {
            int quantidadeNota = troco / nota;
            if (quantidadeNota > 0) {
              System.out.println("Notas de R$" + nota + ": " + quantidadeNota);
              troco %= nota;
            }
          }
          scanner.close();
        }
      }
