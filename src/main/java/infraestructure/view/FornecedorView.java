package infraestructure.view;

import domain.model.Fornecedor;

import java.util.Scanner;

public class FornecedorView {
    Scanner sc = new Scanner(System.in);
    public int menuFornecedor(){

        System.out.println("Insira o nome: ");
        int escolha = sc.nextInt();
        return escolha;
    }

    public Fornecedor cadastrarFornecedor(){
        System.out.println("Insira o nome: ");
        String nome = sc.nextLine();

        System.out.println("Insira o cnpj: ");
        String cnpj = sc.nextLine();

        var novoFornecedor = new Fornecedor(nome, cnpj);

        return novoFornecedor;
    }
}
