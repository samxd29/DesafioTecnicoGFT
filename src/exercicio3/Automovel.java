package exercicio3;

public abstract class Automovel {
    public Automovel(String combustivel) {
        this.combustivel = combustivel;
    }

    private String combustivel;

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String tipoCombustivel(Automovel automovel){
        return this.combustivel;
    }
}
