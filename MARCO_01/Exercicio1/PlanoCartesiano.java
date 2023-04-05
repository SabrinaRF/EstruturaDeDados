package Exercicio1;

public class PlanoCartesiano {
    private PontoCartesiano p1;
    private PontoCartesiano p2;

    //construtor
    PlanoCartesiano(){
       p1 = new PontoCartesiano(0,0);
       p2 = new PontoCartesiano(0,0);
    }
    
    PlanoCartesiano(PontoCartesiano p1,PontoCartesiano p2){
        this.p1 = p1;
        this.p2=p2;
    }

    public PontoCartesiano getP1() {
        return p1;
    }

    public void setP1(PontoCartesiano p1) {
        this.p1 = p1;
    }

    public PontoCartesiano getP2() {
        return p2;
    }

    public void setP2(PontoCartesiano p2) {
        this.p2 = p2;
    }


    // Método  que calcule a distância
    //euclidiana entre dois pontos
    public double calculoDistancia(){
        double distanciax = Math.pow((p1.getX() - p1.getY()),2);
        double distanciay = Math.pow((p2.getX() - p2.getY()),2);
        
        double d =Math.sqrt(distanciax + distanciay);
        return d;
    }
}
