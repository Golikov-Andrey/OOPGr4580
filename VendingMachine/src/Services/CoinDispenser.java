package Services;

public class CoinDispenser {
      private int nominal;

      public CoinDispenser(int nominal){
        this.nominal=nominal;
      }
     
      public String toString(){
        return "Номинал монеты равен " + nominal;
      }

      

    public int getSumm(int insertCoin, int outCoin){
        int summCoin;
        summCoin=insertCoin+outCoin;
        return summCoin;
    } 
    public int giveChahge(int summCoin, int price ){
        int change;
        if (price<summCoin){
            change=summCoin-price;
        }
        else if (price==summCoin){
            change=summCoin-price;
        }
        else change=0;
        return change;
    }

    public boolean dispense(int price) {
        return false;
    }      
       
}
