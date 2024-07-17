import java.util.Scanner;

import static java.util.Collections.swap;

public class NegativeAndPostive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int index=0;
        for(int i=0;i<a;i++){
            if(arr[i]<0 && i!=0){
                arr[index]=arr[i]+arr[index];
                arr[i]=arr[index]-arr[i];
                arr[index]=arr[index]-arr[i];
                index++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
