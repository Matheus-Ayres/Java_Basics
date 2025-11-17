public class Funcionario {
    private String nome;
    private int salario;

    public Funcionario(String nome, int salario){
        this.nome = nome;
        this.salario = salario;
    }

    public int getSalario(){
        return salario;
    }

    public String getNome(){
        return nome;
    }

    public double calcularBonus(){
        return 0;
    }
}
