package Exercicio1;

public class PontoCartesiano {
    private double X;
    private double Y;

    //construtor
    PontoCartesiano(double X, double Y){
        this.X =X;
        this.Y=Y;
    }

    //Getters
    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    //Setters
    public void setY(double Y) {
        this.Y = Y;
    }
    public void setX(double X) {
        this.X = X;
    }
}
