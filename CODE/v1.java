/*>= is greater than or equal to
<= is less than or equal to
== is equal to*/

//AMOUNT OF DEBUG TOOLS: 6
//UPDATE THE ABOVE LINE EVERY TIME YOU ADD A DEBUG TOOL.


import java.util.Scanner;
import java.util.Locale;

public class v1 {
    public static int jackpot = 1000000;
    public static int earnings = 50;
    public static int cash = 40;
    public static int cost = 2;
    public static int givem = 1000000;
    public static  int remcom = cost;
    public static int endcom = 10000000;
    public static int upcom = cost;

    public static void main(String[] args) throws InterruptedException {
        Scanner Input = new Scanner(System.in);

        Thread.sleep(1000);
        System.out.println("The Text Slots Game!");
        Thread.sleep(1000);
        System.out.println("This program uses GNU General Public License v2\n");
        Thread.sleep(2000);
        screen.clear();

        while (true) {
            Thread.sleep(500);
            System.out.println("EARNINGS: " + earnings);
            System.out.println("[S]pin [$" + cost + "] or [U]pgrade Earnings [-$20 | +10 on earnings]");
            System.out.println("Wallet: " + cash);
            Thread.sleep(200);
            System.out.printf("CHOICE: ");
            String a = Input.next();
            String input = a.toUpperCase(Locale.ROOT);


            if (input.equals("S") && cash >= 2) {
                spin.wins();
                screen.clear();
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
                Thread.sleep(2000);
                screen.clear();
            }


            else if (input.equals("COMMANDS")) {
                Thread.sleep(500);
                System.out.println("\nTYPE 'HELP' FOR LIST OF COMMANDS.");

                Thread.sleep(500);
                System.out.printf("COMMAND: ");
                
                commands.cheats();
            }


            else {
                Thread.sleep(500);
                System.out.println(input + " IS INVALID INPUT OR YOU HAVE LESS THAN REQUIRED FOR IT.\n");
                
                Thread.sleep(2000);
                screen.clear();
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
                Thread.sleep(2000);
                screen.clear();
            }

            else if (cash >= 2000000) {
                Thread.sleep(500);
                System.out.println("\nYou have officially reached $2,000,000+. You are now a rich man and won!");
                
                Thread.sleep(2000);
                screen.clear();
                break;
            }
        }

    Input.close();
    }
}