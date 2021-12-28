public class Ganmbling {

    public static void main(String[] args) {

        int stake = 100;
        int bet = 1;
        int count_win = 0;
        int count_lost = 0;
        System.out.println("Gambling world,Everyday stake is:" + stake + "  Bet for every game is:" + bet);
        for (int i = 1; i < 21; i++){
          while (stake != 50 && stake != 150) {
              double random = Math.random();
              if (random < 0.5) {
                  count_win =count_win + 1;
                  stake = stake + bet;
                  System.out.println("Lost amount is: " + bet + "  and stake amount is: " + stake);
              } else {
                  count_lost = 0;
                  stake = stake - bet;
                  System.out.println("Win amount is :" + bet + " And stake amount is: " + stake);
              }
          }
        }
        System.out.println("total Amount Win : "+ count_win);
    }
}