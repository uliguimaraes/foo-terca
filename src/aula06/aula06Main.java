import aula06.Cliente;

import javax.lang.model.element.NestingKind;

void main() {
    ArrayList<Cliente> clientes = new ArrayList<>();

    boolean desejaSair = false;

    while (!desejaSair){

        int opcaoEscolhida = menu();

        switch (opcaoEscolhida){

            case 1:
                //
                String nome = IO.readln("Digite o nome do novo cliente: \n");
                String cpf = IO.readln("Digite o cpf do cliente: \n");

                clientes.add(new Cliente(nome,cpf));
                break;
            case 2:
                //
                break;
            case 0:
                desejaSair = true;
        }



    }


}
public int menu(){
    IO.println("Digite umas das opções abaixo:");
    IO.println("1 = Adicionar novo cliente");
    IO.println("2 = Listar clientes");
    IO.println("3 = Remover cliente");
    IO.println("4 = Editar cliente");
    IO.println("0 = Sair");

    int opcaoEscolhida = Integer.parseInt(IO.readln());
    return opcaoEscolhida;


}
