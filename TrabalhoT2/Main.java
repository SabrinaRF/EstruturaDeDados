package TrabalhoT2;

public class Main {
    
    public static void main(String[] args) {
        Pilha pilha = new Pilha(3);
        
        pilha.imprimeResultado("arara");
        pilha.imprimeResultado("cocota");
        pilha.imprimeResultado("anna");

        System.out.println("Tamanho do vetor: " + pilha.getTamanhoVetor());
    }
}
