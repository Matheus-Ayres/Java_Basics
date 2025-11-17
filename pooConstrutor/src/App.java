public class App {
    public static void main(String[] args) throws Exception {
        carroEncapsuladoCon carro = new carroEncapsuladoCon("Ford", "Ka", 2001);
        carroEncapsuladoCon carro2 = new carroEncapsuladoCon("Fiat", "Uno", 2002);

        carro.acelerar();
        carro.exibirDados();
        carro2.exibirDados();
    }
}
