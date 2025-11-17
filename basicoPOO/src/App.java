public class App {
    public static void main(String[] args) throws Exception {
        Carro car = new Carro();

        car.marca = "Ford";
        car.modelo = "Ka";
        car.ano = 2001;

        car.acelerar();
    }
}
