import java.util.*;
public class Swap {
    public static void swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("the value of a and b after swapping  :" + a +" "+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        swap(a,b);
    }
}
