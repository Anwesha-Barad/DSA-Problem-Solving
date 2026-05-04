//Missing number
import java.util.*;
class Missing_number{
public static void main (String s[]){

     Scanner sc=new Scanner(System.in);
        System.out.print("enter array size: ");
        int n=sc.nextInt();

        int arr[]=new int[n-1];
        System.out.println("enter array element: ");
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        int total = n*(n+1)/2;
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }

        System.out.println("missing number :"+(total-sum));
}
}