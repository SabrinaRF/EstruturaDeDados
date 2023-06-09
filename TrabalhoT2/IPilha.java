package TrabalhoT2;

public interface IPilha {
    public boolean isEmpty();
    public int tamanho();
    public boolean Push(Object info);
    public Object Pop();
    public Object Top(); 
    public  boolean testaPalindromo(String palavra);
    public void imprimeResultado(String palavra);
    public boolean remove();
}

