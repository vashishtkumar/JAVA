import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int fact=1;
        for (;a>0;a--){
            fact*=a;
        }
        System.out.println(fact);
    }
}
