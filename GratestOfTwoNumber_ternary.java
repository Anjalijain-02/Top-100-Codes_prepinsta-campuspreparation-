import java.util.Scanner;

public class GratestOfTwoNumber_ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2=sc.nextInt();
        //ternary method
        if (n1 == n2)
            System.out.println ("Both are Equal\n");
        else
        {
            int temp = n1 > n2 ? n1 : n2;
            System.out.println (temp + " is largest");
        }
    }
}
