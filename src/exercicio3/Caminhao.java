package exercicio3;

public class Caminhao extends Automovel{
    public Caminhao(String combustivel) {
        super(combustivel);
    }

    @Override
    public String tipoCombustivel(Automovel automovel) {
        return super.getCombustivel();
    }

}
