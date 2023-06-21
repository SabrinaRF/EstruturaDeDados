package Atividade14;

public class Noh<Object> {
    private Object ob;
    private Noh<Object> proximo;
    private Noh<Object> anterior;

    public Noh(Object a){
        this.ob = a;
        this.proximo = null;
        this.anterior = null;
    }

   // public int getInfo(){}
    public Noh<Object> getProximo() { 
        return proximo;
    }
    public Noh<Object> getAnterior(){
        return anterior;
    }
    public void setProximo(Noh<Object> n) {  
        this.proximo = n; 
    }
    public void setAnterior(Noh<Object> n){
        this.anterior = n;
    }
    public Object getObject(){
        return ob;
    }

}
