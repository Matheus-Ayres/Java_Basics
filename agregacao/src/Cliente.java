public class Cliente {
    private String nome;
    private int telefone;
    private Endereco endereco;

    public Cliente(String nome, int telefone, Endereco endereco){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome(){ return nome; }
    public int getTelefone(){ return telefone; }

    public void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println(endereco.exibir() );
    }
}
