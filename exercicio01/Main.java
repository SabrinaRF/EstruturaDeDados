public class Main {
    
     public static void main(String[] args) {
     
        PontoCartesiano p1 = new PontoCartesiano(1, 3);  
         PontoCartesiano p2 =new PontoCartesiano(3, 1);   
         
         PlanoCartesiano pc = new PlanoCartesiano();

         pc.setP1(p1);
         pc.setP2(p2);

         System.out.println(pc.calculoDistancia());
        
     }
     
     
}