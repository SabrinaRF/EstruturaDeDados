package Q5;

public class Pares{
    public static int Pares(Noh ant) {
        int count = 0;
        Noh current = ant;

        while (current != null) {
            if (current.getInfo() % 2 == 0) {
                count++;
            }
            current = current.getProx();
        }

        return count;
    }
}
