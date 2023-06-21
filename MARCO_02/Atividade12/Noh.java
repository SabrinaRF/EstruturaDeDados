package Atividade12;

public class Noh {
    private Object objeto;
    private Noh proximo;
    
    public Noh (Object info){
        this.objeto = info;
        this.proximo = null;
    }

    public Object getObjeto() {
        return objeto;
    }
    public Noh getProximo() {
        return proximo;
    }
    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }
    public void setProximo(Noh proximo) {
        this.proximo = proximo;
    }
}
