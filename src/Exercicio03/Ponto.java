package Exercicio03;

public class Ponto {
    int x;
    int y;

    public double calcularDistancia(Ponto p2){
        double dist = Math.sqrt(Math.pow((p2.x - x), 2) + Math.pow((p2.y - y),2));
        return dist;
    }

    public double distOrigem(){
        double dist = Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));
        return dist;
    }

    public double maisProx(Ponto p1, Ponto p2){
        double dist1 = p1.distOrigem();
        double dist2 = p2.distOrigem();
        double prox = Math.min(dist2, dist1);
        return prox;
    }

    public void dados(){
        System.out.println(x + "," + y);

    }
}
