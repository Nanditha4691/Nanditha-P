import java.util.Scanner;

public class Problem_1 {
    double a;
    double b;
    double res;
    String operator;

      public void calculator(){
        switch (operator) {
            case "+":
                res=a+b;
                break;
            case "-":
                res=a-b;
                break;
            case "*":
                res=a*b;
                break;
            case "%":
                res=a%b;
                break;
            case "/":
                if (b!=0){
                    res=a/b;
                }
                else{
                    System.out.println("Divison is not possibvle");
                }
                break;
        
            default:
            System.out.println("Invalid Input");
                break;
        }
         System.out.println("a=" +a);
        System.out.println("b=" +b);
        System.out.println("operator=" +operator);
        System.out.println("Result=" +res);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Problem_1 calc=new Problem_1();

        System.out.println("Enter the value of a: ");
        calc.a=sc.nextDouble();

        System.out.println("Enter the value of b: ");
        calc.b=sc.nextDouble();

        System.out.println("Enter the value of Operator(+,-,%,*,/) : ");
        calc.operator=sc.next();

        calc.calculator();
    }
}


