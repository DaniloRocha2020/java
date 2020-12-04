import java.util.Scanner;
   public class Uri1020{
       public static void main(String args []){
           Scanner teclado = new Scanner (System.in);
           int ano, meses, dias;
           int ndias;
                 

           //entrada - ler os valores de ano, meses e dias
           ndias = teclado.nextInt();
           
           //processamento - dividir ndias
           ano = ndias/365;
           meses = (ndias%365) /30;
           dias = (ndias%365) %30;

           //Saida  - Exibir o valor de ano, meses e dias
           System.out.println(ano + " ano(s)");
           System.out.println(meses + " mes(es)");
           System.out.println(dias + " dia(s)");
       }
   }    