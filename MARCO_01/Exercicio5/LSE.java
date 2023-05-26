package Exercicio5;

public class LSE implements Lista {

    private Noh inicio;
    private Noh fim;
    private int totalLista=0;
    
    public LSE () {
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public void insereInicio(int numero) {
        
        Noh novo = new Noh(numero);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
            totalLista++;
        } else {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio=novo;
            totalLista++;
        }
    }

    @Override
    public void insereFim(int numero) {
        
        Noh novo = new Noh(numero);
        if (fim == null) {
            inicio = novo;
            fim=novo;
        } else {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }
        
    }

    @Override
    public boolean estahVazia() {
        
        if (inicio == null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(int valor) {
        Noh p =inicio;
        while (p!=null && p.getInfo() != valor) {
            p =p.getProximo();

            if (p == null) {
                return false;
            }
            if (p == inicio) {
                inicio = p.getProximo();
                if (inicio != null) {
                    inicio.setAnterior(null);
                } else {
                    fim=null;
                }
            }else if (p.getProximo() == null){
                p.getAnterior().setProximo(null);
                fim= p.getAnterior();
            }else{
                p.getAnterior().setProximo(p.getProximo());
                p.getProximo().setAnterior(p.getAnterior());
            } 
        }return true;
    }

    @Override
    public int tamanho() {
        return totalLista;
        
    }

    public void printLista(){
        Noh i = inicio;
        while (i != null) {
            System.out.println( i.getNumero() + " ");
            i = i.getProximo();
        }
        System.out.println();
        
    }
  
}