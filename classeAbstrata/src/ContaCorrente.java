public class ContaCorrente extends ContaBancaria {
    
    public ContaCorrente(String cliente, double saldo){
        super(cliente, saldo);
    }

    public void calcularTarifa(){
        setSaldo(getSaldo() - 12);
    }
}
