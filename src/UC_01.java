public class Gambling {

    public static void main(String[] args) {

        int stake = 100;
        int bet = 1;
        System.out.println("Gambling world,Everyday stake is:" + stake + "  Bet for every game is:" + bet);
        double random = Math.random();
        if (random>0.5){
            stake = stake + bet;
            System.out.println("Wint amount is:" + stake + "and stake amount is" + stake);
        }else{
            stake = stake - bet;
            System.out.println("Loss amount is :" + bet + "And stake amount is" + stake);
        }

    }
}
