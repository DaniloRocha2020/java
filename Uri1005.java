
    import java.util.Scanner;
    public class Uri1005{
        public static void main(String args []){
            Scanner teclado = new Scanner (System.in);
            double A, B, Media;
            
            //entrada - ler os valores de A e B 
            A = teclado.nextDouble();
            B = teclado.nextDouble();

            //processamento - somar ambos os valores e armazenar em Media
            Media = (A * 3.5 + B * 7.5) / 11;
            
            //Saida - exibir o valor de Media
            System.out.printf("MEDIA = %.5f%n" , Media);
        }
    }