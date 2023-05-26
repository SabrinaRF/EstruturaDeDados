public class Vetor {
    private int[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new int[capacidade];
        this.tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public int elemento(int indice) {
        if (!(indice >= 0 && indice < tamanho)) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        return this.elementos[indice];
    }

    public void inserir(int elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new RuntimeException("Capacidade máxima do vetor atingida");
        }
    }
}