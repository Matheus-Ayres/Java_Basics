public class Atendente extends Funcionario {
    
    public Atendente(String nome, int salario){
        super(nome, salario);
    }

    @Override
    public double calcularBonus(){
        return getSalario() + (getSalario() * 0.10);
    }
}
