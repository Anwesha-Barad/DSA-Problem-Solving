import java.util.Scanner;
class SecondSmallestNumber{
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
        int sec_small=arr[1];
        for(int  i=0;i<n;i++){
            if(arr[i]<small){
                sec_small=small;
                small=arr[i];
            }else if (arr[i] < sec_small && arr[i] != small) {
                sec_small = arr[i];
            }
        }
        System.out.print("Second Smallest Elements:"+sec_small);
    }
}