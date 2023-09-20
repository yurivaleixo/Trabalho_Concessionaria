public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo, int anoFabricacao, double preco, int numPortas) {
        super(marca, modelo, anoFabricacao, preco);
        this.numPortas = numPortas;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + numPortas + " portas";
    }
}