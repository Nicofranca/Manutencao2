package domain.model;

public class NotaEntradaItem {
    private int idMaterial;
    private double quantidade;

    public NotaEntradaItem() {
    }

    public NotaEntradaItem(int idMaterial, double quantidade) {
        this.idMaterial = idMaterial;
        this.quantidade = quantidade;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}
