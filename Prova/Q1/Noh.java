package Q1;


public class Noh {
    private int valor;
    private Noh proximo;
    private Noh anterior;

    public Noh(int a){
        this.valor = a;
        this.proximo = null;
        this.anterior = null;
    }

    public int getInfo(){
        return valor;
    }
    public Noh getProximo() { 
        return proximo;
    }
    public Noh getAnterior(){
        return anterior;
    }
    public void setProximo(Noh n) {  
        this.proximo = n; 
    }
    public void setAnterior(Noh n){
        this.anterior = n;
    }
    public int getNumero(){
        return valor;
    }

}
