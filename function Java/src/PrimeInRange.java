import java.util.Scanner;

public class PrimeInRange {

    public static boolean Prime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void PrimeRange(int n){
        for(int i=2;i<=n;i++){
            if(Prime(i)){
                System.out.print(" "+i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        PrimeRange(a);
    }
}
