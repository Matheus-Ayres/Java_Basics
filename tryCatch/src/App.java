public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();

        conta.saldo = 30;

        conta.depositar(40);
        conta.exibirSaldo();
        
        try {
            conta.sacar(90); // pode dar erro
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

        conta.exibirSaldo();
    }
}
