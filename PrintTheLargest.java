import java.util.Scanner;

public class PrintTheLargest {
    public static void main(String[] args) {
        int n,max;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements in array");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();

        }
        max=arr[0];
        for (int i = 0; i < n; i++) {
            if(max<arr[i]){
                max=arr[i];

        }

        }
        System.out.println("maximum value:"+max);

    }
}
