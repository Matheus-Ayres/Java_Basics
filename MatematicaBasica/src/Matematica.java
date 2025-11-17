public class Matematica {
    static void somar(int a, int b) {
        System.out.println("Resultado: " + (a + b));
        
    }

    static void subtrair(int a, int b) {
        System.out.println("Resultado: " + (a - b));
    }

    static void multiplicar(int a, int b) {
        System.out.println("Resultado: " + (a * b));
    }

    static void dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
        }
        System.out.println("Resultado: " + (a / b));
    }
}
