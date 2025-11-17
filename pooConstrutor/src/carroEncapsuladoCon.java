public class carroEncapsuladoCon {
    private String marca, nome;
    private int ano;

    // construtor
    public carroEncapsuladoCon(String marca, String nome, int ano) {
        this.marca = marca;
        this.nome = nome;
        this.ano = ano;
    }

    // getters
    public String getMarca() { return marca; }
    public String getNome() { return nome; }
    public int getAno() { return ano; }

    // setters
    public void setMarca(String marca) { this.marca = marca; }
    public void setNome(String nome) { this.nome = nome; }
    public void setAno(int ano) { this.ano = ano; }

    public void acelerar() {
        System.out.println("O carro " + getNome() + " acelerou");
    }

    public void exibirDados(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Nome: " + getNome());
        System.out.println("Anos: " + getAno());
    }
}
