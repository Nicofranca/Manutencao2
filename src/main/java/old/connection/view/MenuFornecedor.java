package old.connection.view;

import domain.model.Fornecedor;

import java.util.Scanner;

public class MenuFornecedor {

    Scanner sc = new Scanner(System.in);

    public Fornecedor cadastrarFornecedor(){

        System.out.println("Insira o nome do Fornecedor: ");
        String nome = sc.nextLine();

        System.out.println("Insira o CNPJ do fornecedor: ");
        String cnpj = sc.nextLine();

        var novoFornecedor = new Fornecedor(nome, cnpj);

        return novoFornecedor;
    }
}
