public class UC_01 {

    public static void main(String[] args) {

        int stake = 100;
        int bet = 1;
        System.out.println("Gambling world,Everyday stake is:" + stake + "  Bet for every game is:" + bet);
<<<<<<< HEAD
        while (stake != 50 && stake != 150) {
            double random = Math.random();
            if (random < 0.5) {
                stake = stake + bet;
                System.out.println("Lost amount is: " + bet + "  and stake amount is: " + stake);
            } else {
               stake = stake - bet;
                System.out.println("Win amount is :" + bet + " And stake amount is: " + stake);
            }
=======
        double random = Math.random();
        if (random>0.5){
            stake = stake + bet;
            System.out.println("Lost amount is:" + stake + "and stake amount is" + stake);
        }else{
            stake = stake - bet;
            System.out.println("Win amount is :" + bet + "And stake amount is" +stake);
        }
>>>>>>> b855da1c005da8f9593de9205347df1b3ff06f35

        }
    }
}