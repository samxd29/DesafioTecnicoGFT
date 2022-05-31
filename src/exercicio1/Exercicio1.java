package exercicio1;

public class Exercicio1 {
   public String descobreTelefone(String expressao) {
       if (expressao.contains("A") || expressao.contains("B") || expressao.contains("C")) {
           return "2";
       } else if (expressao.contains("D") || expressao.contains("E") || expressao.contains("F")) {
           return "3";
       } else if (expressao.contains("G") || expressao.contains("H") || expressao.contains("I")) {
           return "4";
       } else if (expressao.contains("J") || expressao.contains("K") || expressao.contains("L")) {
           return "5";
       } else if (expressao.contains("M") || expressao.contains("N") || expressao.contains("O")) {
           return "6";
       } else if (expressao.contains("P") || expressao.contains("Q") || expressao.contains("R") || expressao.contains("S")) {
           return "7";
       } else if (expressao.contains("T") || expressao.contains("U") || expressao.contains("V")) {
           return "8";
       } else if (expressao.contains("W") || expressao.contains("X") || expressao.contains("Y") || expressao.contains("Z")) {
           return "9";
       }
        else{
            return "0";
       }
   }
}
