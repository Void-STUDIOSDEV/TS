import java.util.Random;

public class spin {
    public static void wins() throws InterruptedException {
        Random random = new Random();

        Thread.sleep(500);
        System.out.println("\nTO WIN YOU NEED TO MATCH ALL NUMBERS");

        int number1 = random.nextInt(7);
        int number2 = random.nextInt(7);
        int number3 = random.nextInt(7);
        int number4 = random.nextInt(7);
        int number5 = random.nextInt(7);

        
        Thread.sleep(500);
        System.out.println("NUMBERS: " + number1 + number2 + number3 + number4 + number5);


        if (number1 == number2 && number2 == number3 && number3 == number4 && number4 == number5) {
            System.out.println("CONGRATULATIONS. You have earned $50.");
            v1.cash += v1.earnings;
        }


        else if (number1 == 0 && number2 == 0 && number3 == 6 && number4 == 6 && number5 == 6) {
            System.out.println("WELL WELL WELL WELL WELL WELL WELL WELL... $666 FUNDED ...");
            v1.cash += 666;
        }


        else if (number1 == 0 && number2 == 0 && number3 == 0 && number4 == 0 && number5 == 0) {
            System.out.println("JACKPOT ... JACKPOT ... PAYOUT: $" + v1.jackpot);
            v1.cash += v1.jackpot;
        }


        else {
            System.out.println("You loose!\n");
            v1.cash -= v1.cost;
        }

        Thread.sleep(2000);
    }
}
