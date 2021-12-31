import java.util.Scanner;
public class Ganmbling {
    public static void gamble() {
        int stake = 100;
        int bet = 1;
        int count_win = 0;
        int count_lost = 0;
        int count = 0;
        int luckiestday = 0;
        int unluckiestday = 0;
        int day = 0;
        System.out.println("Gambling world,Everyday stake is:" + stake + "  Bet for every game is:" + bet);
        for (int i = 1; i < 30; i++) {
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
                System.out.println("total  amount win " + count_win);
                System.out.println(" Gambler is won day: " + i);
                System.out.println("how much win :" + count);
            } else {
                count = count_lost - count_win;
                System.out.println(" Gambler is lost day: " + i);
                System.out.println("how much lost : " + count);

            }

        }
        if (count_win > count_lost) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You won the match this month,Press 2 for continue: ");
            int choice = scanner.nextInt();
            while (choice == 2) {
                gamble();
            }
        }
    }

            public static void main (String[]args){
                gamble();

            }
 }