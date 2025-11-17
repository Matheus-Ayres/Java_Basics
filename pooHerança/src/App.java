public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("Fiat", 2002, "Uno");
        Moto moto = new Moto("Honda", 2016, 250);

        moto.empinar();
        carro.abrirPorta();

        moto.exibirDados();
        System.out.println("");
        carro.exibirDados();
    }
}
