import java.util.Scanner;
public class TesteSwitch{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float DDD;
        System.out.println("Digite um valor inteiro");
        valor = teclado.nextFloat();

        switch(DDD){
            case 1;
            System.out.println("Brasilia");
            break;
            case 2;
            System.out.println("Salvador");
            break;
            case 3;
            System.out.println("Sao Paulo");
            break;
            default:
            System.out.println("Digitou outro valor");
            break;

        }
        System.out.println("   FIM DO PROGRAMA ");
    }
}