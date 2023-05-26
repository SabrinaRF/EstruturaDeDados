import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int tamanho = 1000;
        Vetor vetor = new Vetor(tamanho);
        Random random = new Random();
        
        // Preenche o vetor com números inteiros aleatórios
        for (int i = 0; i < tamanho; i++) {
            int numero = random.nextInt(1000);
            vetor.inserir(numero);
        }
        
        // Método recursivo
        long inicioRecursivo = System.nanoTime();
        int maiorRecursivo = encontrarMaiorRecursivo(vetor, tamanho - 1);
        long fimRecursivo = System.nanoTime();
        long tempoRecursivo = fimRecursivo - inicioRecursivo;
        System.out.println("Maior elemento (recursivo): " + maiorRecursivo);
        System.out.println("Tempo de execução (recursivo): " + tempoRecursivo + " nanosegundos");
        
        // Método iterativo
        long inicioIterativo = System.nanoTime();
        int maiorIterativo = encontrarMaiorIterativo(vetor);
        long fimIterativo = System.nanoTime();
        long tempoIterativo = fimIterativo - inicioIterativo;
        System.out.println("Maior elemento (iterativo): " + maiorIterativo);
        System.out.println("Tempo de execução (iterativo): " + tempoIterativo + " nanosegundos");
    }
    
    public static int encontrarMaiorRecursivo(Vetor vetor, int indice) {
        if (indice == 0) {
            return vetor.elemento(0);
        }
        
        int atual = vetor.elemento(indice);
        int anterior = encontrarMaiorRecursivo(vetor, indice - 1);
        return Math.max(atual, anterior);
    }
    
    public static int encontrarMaiorIterativo(Vetor vetor) {
        int maior = vetor.elemento(0);
        int tamanho = vetor.tamanho();
        
        for (int i = 1; i < tamanho; i++) {
            int atual = vetor.elemento(i);
            if (atual > maior) {
                maior = atual;
            }
        }
        
        return maior;
    }
}

