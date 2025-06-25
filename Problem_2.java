import java.util.Scanner;

public class Problem_2 {
   int a;
    
    
    public void series(){
       int num = 1;
        for (int i = 1; i <= a; i++) {
            System.out.print(num);
            if (i < a) {
                System.out.print(", ");
            }
            num += 2; 
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Problem_2 srs=new Problem_2();

        System.out.println("Enter the value a");
        srs.a=sc.nextInt();

        System.out.println("series is:" );
        srs.series();
}

}  

