public class Coin {

     public  void  throwCoin(){
        int coinSide = (int)Math.random();
        if(coinSide < 0.5){
            System.out.println("HEADS");
    } else {
            System.out.println("TREADS");
        }
     }

}