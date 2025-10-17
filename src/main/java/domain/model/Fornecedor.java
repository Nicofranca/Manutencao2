package domain.model;

public class Fornecedor {
    private String nome;
    private String cnpj;

    public Fornecedor() {
    }

    public Fornecedor(String nome, String cnpj) {
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("*O Nome é obigatorio!");
        }
        if (!cnpjValido(cnpj)){
            throw new IllegalArgumentException("*O CNPJ é invalido");
        }
        this.nome = nome;
        this.cnpj = cnpj;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    private boolean cnpjValido(String cnpj){
        return cnpj != null && cnpj.matches("\\d{14}");
    }
}
