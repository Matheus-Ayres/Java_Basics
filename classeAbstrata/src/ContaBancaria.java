public abstract class ContaBancaria {
    private String cliente;
    private double saldo;

    public ContaBancaria(String cliente, double saldo){ 
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public String getCliente(){ return cliente; }
    public double getSaldo(){ return saldo; }

    public void setSaldo(double saldo){ this.saldo = saldo; }


    public void depositar(double v){
        saldo += v;
    };

    public void sacar(double v){
        saldo -= v;
    };

    public abstract void calcularTarifa();
}
