public class Estagiario extends Funcionario {
    
    public Estagiario(String nome, int salario) {
        super(nome, salario);
    }
    
    @Override
    public double calcularBonus() {
        return getSalario() + (getSalario() * 0.05);
    }
}
