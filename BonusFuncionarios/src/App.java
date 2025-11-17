public class App {
    public static void main(String[] args) throws Exception {
        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = new Estagiario("Kleber", 1200);
        funcionarios[1] = new Gerente("Murilo", 5000);
        funcionarios[2] = new Atendente("Pam", 2400);

        for(Funcionario funcionario : funcionarios){
            System.out.println("Salario do " + funcionario.getNome() + " apos o bonus:" + funcionario.calcularBonus());
        }

    }
}
