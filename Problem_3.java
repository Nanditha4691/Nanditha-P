import java.util.Scanner;

public class Problem_3 {
    
 int a;

    public void series() {
        int count = (a % 2 == 0) ? a - 1 : a; // if even, reduce by 1
        int num = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(num);
            if (i < count) {
                System.out.print(", ");
            }
            num += 2;
        }
        System.out.println(); // move to new line after series2
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem_3 srs = new Problem_3();

        System.out.print("Enter the value of a: ");
        srs.a = sc.nextInt();

        System.out.print("Output: ");
        srs.series();
    }
}
