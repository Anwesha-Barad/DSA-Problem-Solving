import java.util.Scanner;

class CountElements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");

        int n = sc.nextInt();
        System.out.println("Enter elements:");
        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Target:");
        int target=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>target){
                count++;
            }
        }
        System.out.println("Output:"+count);
    }
}