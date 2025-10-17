package infraestructure.view;

import java.util.Scanner;

public class ApplicationView {
    Scanner sc = new Scanner(System.in);

    public int generalMenu(){
        System.out.println("=======Sistema de Gestão d Almoxarifado Industrial=======");
        System.out.println("1. Cadastrar Fornecedor");
        System.out.println("2. Cadastrar MAterial");
        System.out.println("3. Registrar Nota de Entrada");
        System.out.println("4. Criar Requisicao de Material");
        System.out.println("5. Atender Requisicao");
        System.out.println("6. Cancelar Requisicao");
        int escolha = sc.nextInt();

        return escolha;
    }
}
