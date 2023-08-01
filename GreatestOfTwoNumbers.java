import java.util.Scanner;

public class GreatestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2=sc.nextInt();


        // brute force approch

        if(n1>n2)
        {
            System.out.println(n1+" is grater");
        }
        else if(n1==n2)
        {
            System.out.println("equal");
        }
        else{
            System.out.println(n2+"is greater");
        }

        //ternary method
//        if (n1 == n2)
//            System.out.println ("Both are Equal\n");
//        else
//        {
//            int temp = n1 > n2 ? n1 : n2;
//            System.out.println (temp + " is largest");
//        }



    }
}
