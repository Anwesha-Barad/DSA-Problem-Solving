//Bubble sort

import java.util.Scanner;
class Bubblesort{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of index: ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter the elements:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean found=false;

        for(int i=0;i<n-1;i++){                  //for passes
            for(int j=0;j<(n-1)-i;j++){          //for comparison
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    found=true;
                }
            
            }
            if(found==false){
                break;
            }
            
        }
        System.out.println("sorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        

    }
}