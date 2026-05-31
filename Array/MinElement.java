import java.util.Scanner;
class MinElement{
    public static void main (String s[]){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
       
        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
            int temp=arr[i];
            arr[i]=min;
            min=temp;
        }
        }
        System.out.println("min element:"+min);

    }
}