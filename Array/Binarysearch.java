//Binary search

import java.util.Scanner;
class Binarysearch{
    public static void main(String s[]){

        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of the array:");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter the array element: ");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int high=n-1;
        int low=0;
        int mid;
        boolean found=false;
        System.out.println("enter the element to find: ");
        int key=sc.nextInt();

        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==key){
                System.out.println("Element found "+mid);
                found=true;
                break;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(!found){
            System.out.println("enter valid number");
        }


    }
}