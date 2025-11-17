public class Veiculos {
    private String marca;
    private int ano;

    public Veiculos(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca(){ return marca; }
    public int getAno(){ return ano; }

    public void acelerar(){
        System.out.println("O veículo acelerou");
    }

    public void exibirDados(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Ano: " + getAno());
    }
}
