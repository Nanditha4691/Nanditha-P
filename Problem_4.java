import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem_4 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user to enter the numbers
        System.out.println("Enter numbers separated by spaces:");
        String inputLine = sc.nextLine();  // Example: 1 2 8 9 12 46 76 82 15 20 30

        // Split input and convert to list of integers
        String[] inputStrings = inputLine.split("\\s+");
        int[] numbers = new int[inputStrings.length];
        for (int i = 0; i < inputStrings.length; i++) {
            numbers[i] = Integer.parseInt(inputStrings[i]);
        }

        // Initialize map with keys 1 to 9
        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }
         // Count divisibility
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        // Display result
        System.out.println("Output:");
        System.out.println(countMap);
    }
}
