import java.util.Scanner;

public class SumOfNaturalWithRange {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int sum = num2*(num2+1)/2 - num1*(num1+1)/2 + num1;
            System.out.println("The Sum is "+ sum);

    }
}
