package Exercicio4;

public class LSE implements Lista {

    private Noh<Object> inicio;
    private int totalLista=0;
    
    public LSE () {
        this.inicio = null;
    }

    @Override
    public void insereInicio(Object o) {
        
        Noh<Object> novo = new Noh<>(o);
        if (inicio == null) {
            inicio = novo;
            totalLista++;
        } else {
            novo.setProximo(inicio);
            inicio=novo;
            totalLista++;
        }
    }

    @Override
    public void insereFim(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereFim'");
    }

    @Override
    public boolean estahVazia(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'estahVazia'");
    }

    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int tamanho() {
        return totalLista;
        
    }

    public void printLista(){
        Noh<Object> i = inicio;
        while (i != null) {
            System.out.println( i.getObject().toString() + " ");
            i = i.getProximo();
        }
        System.out.println();
        
    }
  
}