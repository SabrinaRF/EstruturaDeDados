package Q5;

public class Lista {
    private Noh primeiro;
    private Noh ultimo;
    private int tamanho;

    public Lista() {
        primeiro = null;
        ultimo = null;
        tamanho = 0;
    }

    private class Noh {
        private int info;
        private Noh ant;
        private Noh prox;

        public Noh(int info) {
            this.info = info;
            ant = null;
            prox = null;
        }
    }

    public void inserirInicio(int valor) {
        Noh novoNoh = new Noh(valor);
        if (primeiro == null) {
            primeiro = novoNoh;
            ultimo = novoNoh;
        } else {
            novoNoh.prox = primeiro;
            primeiro.ant = novoNoh;
            primeiro = novoNoh;
        }
        tamanho++;
    }

    public void inserirFim(int valor) {
        Noh novoNoh = new Noh(valor);
        if (ultimo == null) {
            primeiro = novoNoh;
            ultimo = novoNoh;
        } else {
            ultimo.prox = novoNoh;
            novoNoh.ant = ultimo;
            ultimo = novoNoh;
        }
        tamanho++;
    }

    public void removerInicio() {
        if (primeiro == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        if (primeiro == ultimo) {
            primeiro = null;
            ultimo = null;
        } else {
            primeiro = primeiro.prox;
            primeiro.ant = null;
        }
        tamanho--;
    }

    public void removerFim() {
        if (ultimo == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        if (primeiro == ultimo) {
            primeiro = null;
            ultimo = null;
        } else {
            ultimo = ultimo.ant;
            ultimo.prox = null;
        }
        tamanho--;
    }

    public int getTamanho() {
        return tamanho;
    }
}
