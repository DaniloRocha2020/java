import java.util.Scanner;
  public class Uri1019{
      public static void main(String args[]){
          Scanner teclado = new Scanner (System.in);
          int horas, minutos, segundos,time,sobra;

          //entrada - ler os valores de horas, minutos, segundos
          time = teclado.nextInt();

          //processamento
          horas = (time / 3600);
          sobra = (time % 3600);
          minutos = (sobra / 60);
          segundos = (sobra % 60);

          //saida 
          System.out.println(horas + ":" + minutos + ":" + segundos);
      }
  }