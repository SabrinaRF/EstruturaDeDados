package Q1;

class Lista {
    private Noh primeiro;
    private Noh ultimo;
    
    public Lista() {
        this.primeiro = null;
        this.ultimo = null;
    }
    
    public boolean estaVazia() {
        return primeiro == null;
    }
    
    public void inserir(int valor) {
        Noh novoNoh = new Noh(valor);
        
        if (estaVazia()) {
            primeiro = novoNoh;
            ultimo = novoNoh;
        } else {
            ultimo.prox = novoNoh;
            novoNoh.ant = ultimo;
            ultimo = novoNoh;
        }
    }
    
    public Lista encontrarIntersecao(Lista lista1, Lista lista2) {
        Lista intersecao = new Lista();
        Noh atualLista1 = lista1.primeiro;
        
        while (atualLista1 != null) {
            Noh atualLista2 = lista2.primeiro;
            
            while (atualLista2 != null) {
                if (atualLista1.valor == atualLista2.valor) {
                    intersecao.inserir(atualLista1.valor);
                    break;
                }
                
                atualLista2 = atualLista2.prox;
            }
            
            atualLista1 = atualLista1.prox;
        }
        
        return intersecao;
    }
    
    public void exibirLista() {
        Noh atual = primeiro;
        
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.prox;
        }
        
        System.out.println();
    }
}