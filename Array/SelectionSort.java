//Selection sort

import java.util.Scanner;
class SelectionSort{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the index size:");
        int n=sc.nextInt();
        int arr[]=new int[n];

         System.out.println("enter the element for array:");
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }

         for(int i=0;i<n;i++){
            int min=i;

            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
         }

         System.out.println("sorted array: ");

         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
         }

    }
}