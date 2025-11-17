public class Gerente extends Funcionario {
    
    public Gerente(String nome, int salario){
        super(nome, salario);
    }

    @Override
    public double calcularBonus(){
        return getSalario() + (getSalario() * 0.20);
    }
}
