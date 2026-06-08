import java.util.Scanner;

class LargestConsecutiveDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");

        int n = sc.nextInt();
        System.out.println("Enter elements:");
        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int max = Math.abs(arr[1] - arr[0]);
        for(int i=0;i<n-1;i++) {
            int diff = Math.abs(arr[i+1] - arr[i]);

            if(diff > max) {
                max = diff;
            }
        }

        System.out.println(max);
    }
}