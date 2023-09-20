public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int anoFabricacao;
    protected double preco;

    public Veiculo(String marca, String modelo, int anoFabricacao, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + anoFabricacao + ") - R$" + preco;
    }
}
