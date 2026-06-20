import java.util.Locale;
import java.util.Scanner;

public class commands {
    public static void cheats() throws InterruptedException {
        Scanner cominput = new Scanner(System.in);
        String a = cominput.next();
        String cinput = a.toUpperCase(Locale.ROOT);


        if (cinput.equals("HELP")) {
            System.out.println("\nGIVEM, REM, END, CASHADD, CASHOFF");
            System.out.println("[DEVELOPER HERE, COULD POTENTIALLY HAVE COMMANDS NOT LISTED]\n");
        }
        
        if (cinput.equals("GIVEM")) {
            System.out.println("\nDEVELOPER COMMAND 'GIVEM' USED. +1,000,000.\n");
            v1.cash += v1.givem;
            Thread.sleep(2000);
            screen.clear();
        }

        else if (cinput.equals("REM")) {
            System.out.println("\nDEVELOPER COMMAND 'REM' USED. REMOVING SPIN COSTS.\n");
            v1.cost -= v1.remcom;
            Thread.sleep(2000);
            screen.clear();
        }

        else if (cinput.equals("END")) {
            System.out.println("\nDEVELOPER COMMAND 'END' USED. REMOVING ALL CASH FROM WALLET.\n");
            v1.cash -= v1.endcom;
            Thread.sleep(2000);
            screen.clear();
        }

        else if (cinput.equals("UP")) {
            System.out.println("\nDEVELOPER COMMAND 'UP' USED. UPPING COST BY " + v1.upcom + ".\n");
            v1.cost += v1.upcom;
            Thread.sleep(2000);
            screen.clear();
        }

        else if (cinput.equals("CASHOFF")) {
            System.out.println("\nDEVELOPER COMMAND 'CASHOFF' USED.");
            System.out.printf("How much cash to remove from your wallet: ");
            int e = cominput.nextInt();

            v1.cash = v1.cash - e;
            System.out.printf("\n");
            Thread.sleep(10000);
            screen.clear();
        }

        else if (cinput.equals("CASHADD")) {
            System.out.println("\nDEVELOPER COMMAND 'CASHADD' USED.");
            System.out.printf("How much cash to add to your wallet: ");
            int f = cominput.nextInt();

            if (f <= 2000000) {
                v1.cash = v1.cash + f;
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
            Thread.sleep(10000);
            screen.clear();
        }
    }
}