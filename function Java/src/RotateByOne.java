import java.util.Scanner;

public class RotateByOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        while(k>0) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            k--;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
