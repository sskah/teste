package Exercicio03;

public class Main {
    public static void main(String[] args) {

        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        p1.x = -6;
        p1.y = 8;

        p2.x = 6;
        p2.y = 1;

        double dist = p1.calcularDistancia(p2);
        System.out.println("Distancia entre p1 e p2: " + dist);

        double d1 = p1.distOrigem();
        System.out.println("Distancia da origem: " + d1);

        double d2 = p2.distOrigem();
        System.out.println("Distancia da origem: " + d2);

        double prox = p1.maisProx(p1,p2);
        System.out.println("Mais proximo: " + prox);
        p1.dados();
        p2.dados();

    }
}
