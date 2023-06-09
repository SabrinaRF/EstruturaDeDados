package TrabalhoT2;

public class Pilha implements IPilha{
    private Object[] pilha;
    private int element = 0;

    public Pilha (int tamanho){
        this.pilha = new Object[tamanho];
    }

    @Override
    public boolean Push(Object info) {
        if(this.element == pilha.length){
            System.out.println("Pilha Cheia");
            return false;
        }
        this.pilha[this.element] = info;
        this.element++;
        return true;
    }

    @Override
    public Object Pop() {
        Object o = null;
        if(this.isEmpty()){
            System.out.println("Pilha Vazia");
            return null;
        }
        o = this.pilha[element - 1];
        this.pilha[element - 1] = null;
        this.element --;
        return o;
    }

    @Override
    public Object Top() {
        if (this.isEmpty()) {
            System.out.println("Pilha Vazia");
            return null;
        }
        return this.pilha[element - 1];
    }

   

    @Override
    public boolean testaPalindromo(String palavra){ 
        Pilha pilhaLocal = new Pilha(palavra.length());
        for (int i = 0; i < palavra.length(); i++) {
            pilhaLocal.Push(palavra.charAt(i));
        }
        String palavraInversa = "";
        while (!pilhaLocal.isEmpty()) {
            palavraInversa += pilhaLocal.Pop();
        }

            if(palavraInversa.equals(palavra)){
                return true;
            }
        return false;
    }
    @Override
    public void imprimeResultado(String palavra) {
        System.out.println("Palavra: " + palavra);
        System.out.println(testaPalindromo(palavra));
        System.out.println();
    } 
    @Override
    public boolean isEmpty() {
        return this.element == 0;
    }

    @Override
    public int tamanho() {
        return this.element;  
    }
    
    public int getTamanhoVetor() {
        return pilha.length;
    }
}
