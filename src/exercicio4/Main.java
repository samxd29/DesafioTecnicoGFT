package exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma opção para começar: 1 - inserir contato, 2 - Remover um contato, 3 - Editar um ");

        int opca = scan.nextInt();

        if(opca == 1){
            Pessoa pessoa = new Pessoa();
            System.out.println("Informe um codigo: ");
            pessoa.setCodigoPessoa(scan.next());
            System.out.println("Informe um telefone: ");
            pessoa.setNumeroTelefone(scan.next());
            System.out.println("Informe sua idade: ");
            pessoa.setIdade(scan.next());
            agenda.adicionar(pessoa);

        } else if(opca == 2) {
           // agenda.remover(Stringcodigo);
        } else if(opca == 3){

           // agenda.editar(pessoa);
        }
        else {
            System.out.println("opçaõ invalida");
        }
    }
}
