import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listaDeNomes = new ArrayList<>();
        String novoNome = "Lucas";
        listaDeNomes.add(novoNome);

        int desejaContinuar = 1;

        do {
            IO.println("Digite um nome: ");
            novoNome = IO.readln(); // não redeclara a variável
            listaDeNomes.add(novoNome);

            IO.println("Quer continuar adicionando?");
            IO.println("Digite 1 para SIM ou qualquer outro número para NÃO:");
            desejaContinuar = Integer.parseInt(IO.readln());

        } while (desejaContinuar == 1);

        IO.println("\nLista de nomes cadastrados:");
        for (String nome : listaDeNomes) {
            IO.println(nome);
        }
    }
}