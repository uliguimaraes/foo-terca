# foo-terca: Cadastro de Clientes em Java

> Um exercício de console para praticar cadastro, listagem, edição e remoção de clientes em memória.

## Visão geral

O **foo-terca** é um projeto Java didático centrado em uma lista de clientes. A aplicação apresenta um menu de operações, lê dados pelo terminal e manipula objetos `Cliente` dentro de uma `ArrayList`. Esse formato é ideal para praticar os fundamentos de CRUD em memória antes de avançar para banco de dados ou interfaces gráficas.[1]

| Funcionalidade | Descrição |
|---|---|
| Adicionar cliente | Lê nome e CPF, cria um objeto e adiciona à lista. |
| Listar clientes | Percorre a lista e imprime os registros. |
| Remover cliente | Busca por CPF e remove o item correspondente. |
| Editar cliente | Localiza o cliente e atualiza nome, CPF e saldo. |
| Sair | Encerra o laço do menu. |

## Estrutura

O arquivo `Cliente.java` representa os dados do cliente, enquanto `aula06Main.java` concentra o menu e as operações. O projeto mostra o papel de classes, construtores e sobrescrita de `toString()` para exibição amigável.

## Como executar

```bash
git clone https://github.com/uliguimaraes/foo-terca.git
cd foo-terca
javac src/aula06/*.java src/*.java
java -cp src aula06Main
```

Dependendo do ambiente, pode ser necessário ajustar o pacote declarado em `Cliente.java` para coincidir com a pasta do arquivo.

## Referências

[1]: https://docs.oracle.com/en/java/ "Java documentation"
