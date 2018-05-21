public class Coin {

     public int throwCoin(){
        int c = 10;
        int coinSide = (int)(Math.random()*c);
        if(coinSide < 4.5){
            System.out.println("HEADS");
    } else {
            System.out.println("TREADS");
        }
         return c;
     }

}