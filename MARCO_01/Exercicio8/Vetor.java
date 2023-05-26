package Exercicio8;

public class Vetor {

    private int[] elementos;
    private int tamanho;

    public Vetor(int i) {
        this.elementos = new int[i];
        this.tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public int elemento(int indice) {
        if (!(indice >= 0 && indice < tamanho)) {
            throw new IndexOutOfBoundsException(" Inválido");
        }
        return this.elementos[indice];
    }

    public void inserir(int elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new RuntimeException("Valor maximo atingido");
        }
    }
    
    public void ordenar() {
        Arrays.sort(this.elementos, 0, this.tamanho);
    }

    public int buscaBinariaIterativa(int valor) {
        long tempoDeExecucaoInicio = System.nanoTime();
        int inicio = 0;
        int fim = tamanho - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (elementoVetor[meio] == valor) {
                long tempoDeExecucaoFim = System.nanoTime();
                tempoDeExecucao = tempoDeExecucaoFim - tempoDeExecucaoInicio;
                return meio;
            } else if (elementoVetor[meio] > valor) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        long tempoDeExecucaoFim = System.nanoTime();
        tempoDeExecucao = tempoDeExecucaoFim - tempoDeExecucaoInicio;
        return -1;
    }


    public int buscaBinariaRecursiva(int valor, int inicio, int fim) {
        long tempoDeExecucaoInicio = System.nanoTime();
        if (inicio > fim) {
            return -1;
        }

        int meio = (inicio + fim) / 2;

        if (elementoVetor[meio] == valor) {
            long tempoDeExecucaoFim = System.nanoTime();
            tempoDeExecucao = tempoDeExecucaoFim - tempoDeExecucaoInicio;
            return meio;
        } else if (elementoVetor[meio] > valor) {
            return buscaBinariaRecursiva(valor, inicio, meio - 1);
        } else {
            return buscaBinariaRecursiva(valor, meio + 1, fim);
        }
    }

}
