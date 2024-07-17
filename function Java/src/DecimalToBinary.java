import java.sql.SQLOutput;
import java.util.Scanner;

public class DecimalToBinary {

    public static int Decimal(int decimal){
        int binary=0;
        int k=0;
        while(decimal >0){
            int rem=decimal%2;
            binary+=rem*(int)Math.pow(10,k++);
            decimal/=2;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int decimal=sc.nextInt();
        System.out.println(Decimal(decimal));

    }
}
