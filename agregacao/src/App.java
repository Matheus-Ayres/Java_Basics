public class App {
    public static void main(String[] args) throws Exception {
        Endereco endereco = new Endereco("Coronel Matos", 123);
        Cliente cliente = new Cliente("Matias", 123456789, endereco);

        cliente.exibirDados();
    }
}
