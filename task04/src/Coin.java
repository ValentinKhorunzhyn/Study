public class Coin {

     public  void  throwCoin(){
        double coinSide = Math.random();
        if(coinSide < 0.5){
            System.out.println("HEADS");
    } else {
            System.out.println("TREADS");
        }
     }

}