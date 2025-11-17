public class Moto extends Veiculos{
    private int cilindrada;

    public Moto(String modelo, int ano, int cilindrada){
        super(modelo, ano);
        this.cilindrada = cilindrada;
    }

    public void empinar(){
        System.out.println("A moto empinou");
    }

    public void exibirDados(){
        super.exibirDados();
        System.out.println("Cilindrada: " + cilindrada);
    }
}
