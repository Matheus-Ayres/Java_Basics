public class carroEncapsulado {
    private String marca, nome;
    private int ano;

    public String getMarca(){
        return marca;
    }

    public String getNome(){
        return nome;
    }

    public int getAno(){
        return ano;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    void acelerar(){
        System.out.println("O carro " + getNome() + " acelerou");
    }
}
