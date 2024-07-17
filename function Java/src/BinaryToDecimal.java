import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int binary=sc.nextInt();
        int decimal=0;
        int k=0;
        while(binary > 0){
            int rem=binary%10;
            decimal+=rem*((int)Math.pow(2,k++));
            binary=binary/10;
        }
        System.out.println(decimal);
    }
}
