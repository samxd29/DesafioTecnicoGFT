package exercicio4;

import java.util.List;

public class Agenda {
    private List<Pessoa> contatos;

    public List<Pessoa> getContatos() {
        return contatos;
    }

    public void setContatos(List<Pessoa> contatos) {
        this.contatos = contatos;
    }

    public void adicionar(Pessoa pessoa){
        contatos.add(pessoa);
    }

    public void remover(String codigo){
        contatos.remove(codigo);
    }

    public void editar(Pessoa pessoa){

    }
}
