package exercicio4;

public class Pessoa {
    String codigoPessoa;
    String numeroTelefone;
    String idade;

    public Pessoa(){

    }

    public Pessoa(String codigoPessoa, String numeroTelefone, String idade) {
        this.codigoPessoa = codigoPessoa;
        this.numeroTelefone = numeroTelefone;
        this.idade = idade;
    }

    public String getCodigoPessoa() {
        return codigoPessoa;
    }

    public void setCodigoPessoa(String codigoPessoa) {
        this.codigoPessoa = codigoPessoa;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }


}
