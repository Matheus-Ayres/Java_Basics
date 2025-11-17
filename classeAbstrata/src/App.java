public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente contaBancaria = new ContaCorrente("Mauro", 0);

        contaBancaria.depositar(20);
        contaBancaria.calcularTarifa();
        System.out.println("Saldo final: " + contaBancaria.getSaldo());
    }
}
