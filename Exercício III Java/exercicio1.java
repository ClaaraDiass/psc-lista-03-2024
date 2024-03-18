import java.util.Scanner;
public class exercicio1 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
        System.out.println("Escreva o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Escreva o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Escreva o terceiro número: ");
        double numero3 = scanner.nextDouble();

        if (numero1>numero2 && numero1>numero3 ) {
            System.out.println("O maior número é: " + numero1);
        }

        else if (numero2>numero1 && numero2>numero3 ) {
            System.out.println("O maior número é: " + numero2);
        }
      
        else if (numero3>numero1 && numero3>numero2 ) {
            System.out.println("O maior número é: " + numero3);
        }

        else if (numero1 == numero2 ){
            System.out.println("Os números " + numero1 + " e " +numero2 + " são Iguais");
        }

        else if (numero1 == numero3 ){
            System.out.println("Os números " + numero1 + " e " + numero3 + " são Iguais");
        }

        else if (numero2 == numero3 ){
            System.out.println("Os números " + numero2 + " e " + numero3 + " são Iguais");
        }

        else {
            System.out.println("Os 3 números são iguais");
        }

        if (numero1<numero2 && numero1<numero3 ) {
            System.out.println("O menor número é: " + numero1);
        }

        else if (numero2<numero1 && numero2<numero3 ) {
            System.out.println("O menor número é: " + numero2);
        }
      
        else if (numero3<--numero1 && numero3<numero2 ) {
            System.out.println("O menor número é: " + numero3);
        }

        double media = (numero1 + numero2 + numero3) / 3;
        System.out.println("O valor da média desses números é: " + media);


      
      
        
       
      
        scanner.close();
      }
   }

   
