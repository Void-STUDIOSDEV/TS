//WARNING: THE ARRAY, SHUFFLE, AND CONVERTER IS VIBE CODED (SADLY).
//WARNING: THE ARRAY, SHUFFLE, AND CONVERTER IS VIBE CODED (SADLY).
//WARNING: THE ARRAY, SHUFFLE, AND CONVERTER IS VIBE CODED (SADLY).
//WARNING: THE ARRAY, SHUFFLE, AND CONVERTER IS VIBE CODED (SADLY).
//Everything is tested and works


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class spin {
    public static void wins() throws InterruptedException {
        String sep = " / ";
        String jackpot = "0000";
        String combination1 = "24120";
        String combination2 = "21300";
        String combination3 = "54241";
        String ee1 = "00333";
        String ee2 = "00777";

        Thread.sleep(500);
        System.out.printf("\nWINNING COMBINATIONS: ");
        System.out.println(combination1 + sep + combination2 + sep + combination3 + sep + jackpot + " IS JACKPOT.");

        
        List<Integer> numbers = new ArrayList<>(List.of(0, 1, 2, 3, 4));
        // Create an ArrayList containing numbers 0 through 4
        // ArrayList is used because it is mutable (can be shuffled)

        Collections.shuffle(numbers);
        // Randomly reorder the elements in the list in-place
        // After this line, "numbers" is in a new random order


        // Convert each Integer in the list into a String,
        // then join all strings together with no separator
        // Example: [2, 0, 4, 1, 3] -> "20413"
        String result = numbers.stream()
            .map(String::valueOf)   // convert Integer -> String
            .collect(Collectors.joining()); // concatenate everything


        if (result == combination1) {
            System.out.println("CONGRATULATIONS. WON: " + v2.earnings + "\n");
            v2.cash += v2.earnings;
        }

        else if (result == combination2) {
            System.out.println("CONGRATULATIONS. WON: " + v2.earnings + "\n");
            v2.cash += v2.earnings;
        }

        else if (result == combination3) {
            System.out.println("CONGRATULATIONS. WON: " + v2.earnings + "\n");
        }





        else if (result == ee1) {
            System.out.println("WELL ... W3LL ... 23LL ... 2311 ...\n");
            v2.cash += 666;
        }

        else if (result == ee2) {
            System.out.println("4NG31S\n");
            v2.earnings += 777777;
            v2.cash += 777;
        }

        else if (result == jackpot) {
            System.out.println("JACKPOT ... JACKPOT ... PAYOUT: $" + v2.jackpot + ".\n");
            v2.cash += v2.jackpot;
        }


        else {
            Thread.sleep(500);
            System.out.println("YOU DID NOT WIN!");
        }
    }
}
