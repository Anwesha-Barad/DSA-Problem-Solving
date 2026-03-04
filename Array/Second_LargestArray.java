// second largest element in array

import java.util.Scanner;
class Second_LargestArray{
   public static void main(String s[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter index size: ");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("enter element: ");
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     int max=arr[0];
     int sec_max=arr[1];
     for(int i=1;i<n;i++){
        if(arr[i]>max){
            sec_max=max;
            max=arr[i];

        }
     }
     System.out.println(" second Largest number in the array: "+sec_max);

   }
}