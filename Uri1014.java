import java.util.Scanner;
public class Uri1014{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int distanciapercorrida = input.nextInt();
        double qtdcombustivel = input.nextDouble();

        double mediacombustivelgasto = distanciapercorrida / qtdcombustivel;

        System.out.printf("%.3f km/1%n" , mediacombustivelgasto);
    }
}

