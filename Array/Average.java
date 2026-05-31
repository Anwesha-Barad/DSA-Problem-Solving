import java.util.Scanner;
class Average{
    public static void main (String s[]){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
       
        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        double sum=0;
        for(int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        double avg=sum/arr.length;
        System.out.println("Average is :"+avg);


    }
}