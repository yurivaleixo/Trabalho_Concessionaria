public class Motocicleta extends Veiculo {
    private int cilindradas;

    public Motocicleta(String marca, String modelo, int anoFabricacao, double preco, int cilindradas) {
        super(marca, modelo, anoFabricacao, preco);
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + cilindradas + " cilindradas";
    }
}