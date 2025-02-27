package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();

        jogador.nome = jogador.nome();
        jogador.pontuacao = jogador.pontos();
        jogador.total = jogador.pontuacaoFinal();

        System.out.println(jogador.nome);

        for (int i = 0; i < jogador.pontuacao.length; i++) {
            System.out.println("Pontos " + (i+1) + ": " + jogador.pontuacao[i]);
        }

        System.out.println("Score total: ");
        System.out.println(jogador.total);

    }
}