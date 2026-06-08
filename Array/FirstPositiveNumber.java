import java.util.Scanner;

class FirstPositiveNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");

        int n = sc.nextInt();
        System.out.println("Enter elements:");
        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        boolean found=false;
        for(int i=0;i<n;i++) {
            if(arr[i]>0){
                 System.out.println("First Positive Number: "+arr[i]);
                 found=true;
                 break;
            }
        }
         if(found == false) {
            System.out.println("No Positive Number Found");
        }

    }
}