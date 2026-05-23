import java.util.Scanner;
class Sortingarray{
    public static void main (String s[]){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        boolean sorted=true;
        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<=n;i++){
            if(arr[i+1]<arr[i]){
            sorted=false;
            break;
        }
        }
        if(sorted){
             System.out.println("sorted");
        }
        else{
             System.out.println(" not sorted");
        }

    }
}