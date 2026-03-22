//Find Maximum and Minimum Element


import java.util.Scanner;

class MaxMin{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print("maximum: "+max+"\nminimum: "+min);
    }
}