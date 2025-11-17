import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorA = 0;
        int valorB = 0;
        
        System.out.println("Escolha uma operação: ");
        char n = sc.nextLine().charAt(0);

        System.out.println("Insira o primeiro numero: ");
        valorA = sc.nextInt();
        System.out.println("Insira o segundo numero: ");
        valorB = sc.nextInt();

        switch(n){
            case '+':
                Matematica.somar(valorA, valorB);
                break;
            case '-':
                Matematica.subtrair(valorA, valorB);
                break;
            case '*':
                Matematica.multiplicar(valorA, valorB);
                break;
            case '/':
                Matematica.dividir(valorA, valorB);
                break;
            }
    }
}
