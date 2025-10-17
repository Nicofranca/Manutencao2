package infraestructure.controller;

import application.dto.CadastroFornecedorDTO;
import application.port.api.FornecedorService;
import domain.model.Fornecedor;
import infraestructure.view.FornecedorView;

import java.util.Scanner;

public class FornecedorController {
    Scanner sc = new Scanner(System.in);
    FornecedorView fornecedorView = new FornecedorView();
    FornecedorService fornecedorService = new FornecedorService() {
        @Override
        public Fornecedor cadastrarNovoFornecedor(CadastroFornecedorDTO dadosCadastro) {
            return null;
        }
    }


        public void fornecedorController() {
        }

        public void processarCadastroFornecedor() {
            System.out.println("Insira o nome: ");
            String nome = sc.nextLine();

            System.out.println("Insira o cnpj: ");
            String cnpj = sc.nextLine();

            CadastroFornecedorDTO cadastroFornecedorDTO = new CadastroFornecedorDTO(nome, cnpj);


            try {
                Fornecedor fornecedorSalvo = fornecedorService.cadastrarNovoFornecedor(cadastroFornecedorDTO);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
}
