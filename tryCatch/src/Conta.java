public class Conta {
    double saldo = 0;

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if (valor > saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }else{
            System.out.println("Valor" + valor + "sacado!");
            saldo -= valor;
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }
}
