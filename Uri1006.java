import java.util.Scanner;
 public class Uri1006{
     public static void main(String args []){
         Scanner teclado = new Scanner (System.in);
         double A, B, C, Media;

         //entrada - ler os valores de A, B e C
         A = teclado.nextDouble();
         B = teclado.nextDouble();
         C = teclado.nextDouble();

         //processamento - somar ambos os valores e armazenar em Media
         Media = (A * 2 + B * 3 + C * 5) / 10;

         //Saida - exibir o valor da Media
         System.out.printf("MEDIA = %.1f%n" , Media);
     }
 }