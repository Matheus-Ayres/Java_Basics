public class Carro extends Veiculos {
    private String modelo;

    public Carro(String marca, int ano, String modelo){
        super(marca, ano);
        this.modelo = modelo;
    }

    public void abrirPorta(){
        System.out.println("A porta do carro abriu");
    }

    public void exibirDados(){
        super.exibirDados();
        System.out.println("Modelo: " + modelo);
    }
}