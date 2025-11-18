import java.util.*;

public class App {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Ana", "123"));
        clientes.add(new Cliente("Pedro", "456"));
        clientes.add(new Cliente("Ana", "123")); // permitido, mas queremos evitar

        // Exercício 1 — imprimir todos os clientes
        for (Cliente c : clientes) {
            System.out.println(c.getNome() + " - " + c.getCpf());
        }
    }
}
