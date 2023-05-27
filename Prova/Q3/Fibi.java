package Q3;

public class Fibi {

    public int fiborec( int n){
        if(n < 2){
            return n
        }else{
            return fiborec(n - 1) + fiborec(n - 2);
        }
    }
    
}
