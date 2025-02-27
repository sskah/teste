package exercicio01;

import java.util.Scanner;
public class Jogador {
    public static Scanner entrada = new Scanner(System.in);
    String nome;
    int[] pontuacao = new int[3];
    int total;

    public String nome(){
        System.out.println("Informe o seu nome");
        return entrada.next();
    }

    public int[] pontos(){
        for(int i = 0; i < pontuacao.length; i++){
            System.out.println("Digite a sua pontuacao:");
            pontuacao[i] = entrada.nextInt();
        }
        return pontuacao;
    }

    public int pontuacaoFinal(){
        int score = 0;
        for (int i = 0; i < pontuacao.length; i++) {
            score += pontuacao[i];
        }
        return score;
    }

}
