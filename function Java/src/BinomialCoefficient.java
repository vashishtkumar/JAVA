import java.util.Scanner;

public class BinomialCoefficient {

    public static int Factorial(int num){
        int fact=1;
        for(;num>0;num--){
            fact*=num;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int r=sc.nextInt();

        float f=(Factorial(n))/(Factorial(r)*Factorial(n-r));
        System.out.println(f);

    }
}
