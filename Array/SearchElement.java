import java.util.Scanner;
class SearchElement{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size:");
        int n=sc.nextInt();
        System.out.print("Enter elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Target: ");
        int target=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
             found=true;
             break;
            }
        }
         if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    
    }
}