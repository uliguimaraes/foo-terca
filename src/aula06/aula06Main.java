import aula6.Cliente;

void main() {
    ArrayList<Cliente> clientes = new ArrayList<>();

    boolean desejaSair = false;

    while (!desejaSair) {
        int opcaoEscolhdida = menu();

        switch (opcaoEscolhdida) {
            case 1:
                salvarCliente(clientes);
                break;
            case 2:
                listarClientes(clientes);
                break;
            case 3:
                removerCliente(clientes);
                break;

            case 4:
                editarCliente(clientes);
                break;
            case 5:
                desejaSair = true;
        }

    }
}

public void salvarCliente(ArrayList<Cliente> clientes) {
    String nome = IO.readln("Digite o nome do cliente: ");
    String cpf = IO.readln("Digite o cpf do cliente: ");
    Float saldo = 0f;

    Cliente cliente = new Cliente(nome, cpf, saldo);

    clientes.add(cliente);
    System.out.println("Cliente salvo com sucesso");

}

public void listarClientes(ArrayList<Cliente> clientes) {
    for (int i = 0; i < clientes.size(); i++) {
        System.out.println(clientes.get(i));
        IO.println(clientes.get(i));
    }
}

public void removerCliente(ArrayList<Cliente> clientes) {
    String cpf = IO.readln("Informe o cpf do cliente: ");
    boolean encontrouCliente = false;
    for (int i = 0; i < clientes.size(); i++) {
        if (clientes.get(i).cpf.equals(cpf)) {
            clientes.remove(i);
            encontrouCliente = true;
        }
    }

    if(!encontrouCliente) {
        System.out.println("Cliente nao encontrado");
    }else {
        System.out.println("Cliente removido com sucesso!");
    }
}
public void editarCliente(ArrayList<Cliente> clientes) {
    String cpf = IO.readln("Digite o CPF do cliente que deseja editar: ");
    boolean encontrouCliente = false;

    for (int i = 0; i < clientes.size(); i++) {
        Cliente cliente = clientes.get(i);

        if (cliente.cpf.equals(cpf)) {
            encontrouCliente = true;

            System.out.println("Cliente encontrado: " + cliente);

            String novoNome = IO.readln("Digite o novo nome: ");
            String novoCpf = IO.readln("Digite o novo CPF: ");
            Float novoSaldo = Float.parseFloat(IO.readln("Digite o novo saldo: "));

            cliente.nome = novoNome;
            cliente.cpf = novoCpf;
            cliente.saldo = novoSaldo;

            System.out.println("Cliente atualizado com sucesso!");
            break;
        }
    }

    if (!encontrouCliente) {
        System.out.println("Cliente não encontrado!");
    }
}
public int menu() {
    System.out.println("Digite uma das opcoes abaixo: ");
    System.out.println("1 = Adicionar novo cliente");
    System.out.println("2 = Listar clientes");
    System.out.println("3 = Remover cliente");
    System.out.println("4 = Editar cliente");
    System.out.println("5 = Sair");

    int opcaoEscolhida = Integer.parseInt(IO.readln());
    return opcaoEscolhida;
}