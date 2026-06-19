/*>= is greater than or equal to
<= is less than or equal to
== is equal to*/

//AMOUNT OF DEBUG TOOLS: 6
//UPDATE THE ABOVE LINE EVERY TIME YOU ADD A DEBUG TOOL.


import java.util.Scanner;
import java.util.Random;
import java.util.Locale;

public class v1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner Input = new Scanner(System.in);
        Random random = new Random();
        int jackpot = 1000000;
        int earnings = 50;
        int cash = 40;
        int cost = 2;
        int givem = 1000000;
        int remcom = cost;
        int endcom = 10000000;
        int upcom = cost;



        Thread.sleep(1000);
        System.out.println("The Text Slots Game!");
        Thread.sleep(1000);
        System.out.println("This program uses GNU General Public License v2\n");

        while (true) {
            Thread.sleep(500);
            System.out.println("EARNINGS: " + earnings);
            System.out.println("[S]pin [$" + cost + "] or [U]pgrade Earnings [-$20 | +10 on earnings]");
            System.out.println("Wallet: " + cash);
            Thread.sleep(200);
            System.out.printf("CHOICE: ");
            String a = Input.next();
            String input = a.toUpperCase(Locale.ROOT);
            //String input = Character.toUpperCase(a);


            if (input.equals("S") && cash >= 2) {
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
                    cash += earnings;
                }
                else if (number1 == 0 && number2 == 0 && number3 == 6 && number4 == 6 && number5 == 6) {
                    System.out.println("WELL WELL WELL WELL WELL WELL WELL WELL... $666 FUNDED ...");
                    cash += 666;
                }
                else if (number1 == 0 && number2 == 0 && number3 == 0 && number4 == 0 && number5 == 0) {
                    System.out.println("JACKPOT ... JACKPOT ... PAYOUT: $" + jackpot);
                    cash += jackpot;
                }
                else {
                    System.out.println("You loose!\n");
                    cash -= cost;
                }
            }


            else if (input.equals("U") && earnings >= 20) {
                if (earnings <= 200) {
                    Thread.sleep(500);
                    System.out.println("You have increased your earnings!\n");
                    earnings += 20;
                    cash -= 20;
                }
                else if (earnings >= 200) {
                    Thread.sleep(500);
                    System.out.println("You have reached the maximum.");
                }
            }

            else if (input.equals("GIVEM")) {
                System.out.println("\nDEVELOPER COMMAND 'GIVEM' USED. +1,000,000.\n");
                cash += givem;
            }

            else if (input.equals("REM")) {
                System.out.println("\nDEVELOPER COMMAND 'REM' USED. REMOVING SPIN COSTS.\n");
                cost -= remcom;
            }

            else if (input.equals("END")) {
                System.out.println("\nDEVELOPER COMMAND 'END' USED. REMOVING ALL CASH FROM WALLET.\n");
                cash -= endcom;
            }

            else if (input.equals("UP")) {
                System.out.println("\nDEVELOPER COMMAND 'UP' USED. UPPING COST BY " + upcom + ".\n");
                cost += upcom;
            }

            else if (input.equals("CASHOFF")) {
                System.out.println("\nDEVELOPER COMMAND 'CASHOFF' USED.");
                System.out.printf("How much cash to remove from your wallet: ");
                int e = Input.nextInt();

                cash = cash - e;
                System.out.printf("\n");
            }

            else if (input.equals("CASHADD")) {
                System.out.println("\nDEVELOPER COMMAND 'CASHADD' USED.");
                System.out.printf("How much cash to add to your wallet: ");
                int f = Input.nextInt();

                if (f <= 2000000) {
                    cash = cash + f;
                    System.out.printf("\n");
                }
                else if (f >= 2000000) {
                    Thread.sleep(500);
                    System.out.println("Requested amount exceeds $2,000,000.\n");
                }
                else {
                    Thread.sleep(500);
                    System.out.println("Input is either not an integer or an error.\n");
                }
            }

            else {
                Thread.sleep(500);
                System.out.println(input + " IS INVALID INPUT OR YOU HAVE LESS THAN REQUIRED FOR IT.\n");
            }




            if (cash <= 7) {
                Thread.sleep(500);
                System.out.println("Well... You are out of cash...");
                System.out.println("Want to borrow $40 for -$5 off your earnings? Y/N  [DEV HERE: This is to make it easier]");
                System.out.printf("CHOICE: ");
                char b = Input.next().charAt(0);
                char sinput = Character.toUpperCase(b);

                if (sinput == 'Y') {
                    Thread.sleep(500);
                    System.out.println("\nYou traded your $5 of your total earnings for 40 more dollars.");
                    cash += 40;
                    earnings -= 5;
                }
                else {
                    Thread.sleep(500);
                    System.out.println("\nNo? Alright... Well, you are out of money, you now have to leave ...");
                    break;
                }
            }

            else if (cash >= 2000000) {
                Thread.sleep(500);
                System.out.println("\nYou have officially reached $2,000,000+. You are now a rich man and won!");
                break;
            }
        }

    Input.close();
    }
}