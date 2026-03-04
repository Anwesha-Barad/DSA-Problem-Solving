//Sum of Array Elements

import java.util.Scanner;
class Sum_of_array{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter index size: ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        int sum=0;
        System.out.println("Enter element for the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("sum of all the index is: "+sum);
        
    }
}