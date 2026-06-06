import java.util.Scanner;
class SmallestNumber{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size:");
        int n=sc.nextInt();
        System.out.print("Enter elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int small=arr[0];
        for(int  i=0;i<n;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.print("Smallest Elements:"+small);
    }
}