package Exercicio4;

public class Noh<Object> {
    private Object ob;
    private Noh<Object> proximo;

    public Noh(Object a){
        this.ob = a;
        this.proximo = null;
    }

   // public int getInfo(){}
    public Noh<Object> getProximo() { 
        return proximo;
    }
    public void setProximo(Noh<Object> n) {  
        this.proximo = n; 
    }
    public Object getObject(){
        return ob;
    }


}
