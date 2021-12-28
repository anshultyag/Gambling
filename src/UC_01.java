public class UC_01 {

    public static void main(String[] args) {

        int stake = 100;
        int bet = 1;
        System.out.println("Gambling world,Everyday stake is:" + stake + "  Bet for every game is:" + bet);
        double random = Math.random();
        if (random>0.5){
            int total = stake-bet;
            System.out.println("Lost amount is:" + stake + "and stake amount is" + total);
        }else{
            int total = stake+bet;
            System.out.println("Win amount is :" + bet + "And stake amount is" + total);
        }

    }
}
