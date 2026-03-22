//Linear search

import java.util.Scanner;
class Linearsearch{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter index size: ");
        int n=sc.nextInt();
         System.out.print("Enter element: ");
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter element for search: ");
       int key=sc.nextInt();
       boolean found=false;
       for(int i=0;i<n;i++){
        if(arr[i]==key){
             System.out.print("element found at index: "+i);
             found=true;
             break;
        }
       }
       if(!found){
             System.out.print("element not found ");
        }
    }
}