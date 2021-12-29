public class Ganmbling {

    public static void main(String[] args) {

        int stake = 100;
        int bet = 1;
        int count_win = 0;
        int count_lost = 0;
        int count = 0;
        for (int i = 1; i < days_of_month.length; i++) {
             while (stake != 50 && stake != 150) {
                    double random = Math.random();
                    if (random < 0.5) {
                        count_win = count_win + 1;
                        stake = stake + bet;
                        System.out.println("Lost amount is: " + bet + "  and stake amount is: " + stake);
                    } else {
                        count_lost = count_lost + 1;
                        stake = stake - bet;
                        System.out.println("Win amount is :" + bet + " And stake amount is: " + stake);
                    }
             }
            if (count_win > count_lost) {
                count = count_win - count_lost;
                System.out.println(" Gambler is win day: " + i);
                System.out.println("how much win :" + count);
            } else {
                count = count_lost - count_win;
                System.out.println(" Gambler is lost day: " + i);
                System.out.println("how much lost : " + count);
            }
        }
    }
}
