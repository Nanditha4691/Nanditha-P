import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem_4 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter numbers separated by spaces:");
        String inputLine = sc.nextLine();  

        
        String[] inputStrings = inputLine.split("\\s+");
        int[] numbers = new int[inputStrings.length];
        for (int i = 0; i < inputStrings.length; i++) {
            numbers[i] = Integer.parseInt(inputStrings[i]);
        }

       
        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }
         
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

       
        System.out.println("Output:");
        System.out.println(countMap);
    }
}
