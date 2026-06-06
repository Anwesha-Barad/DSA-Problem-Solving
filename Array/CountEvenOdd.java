import java.util.Scanner;
class CountEvenOdd{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size:");
        int n=sc.nextInt();
        System.out.print("Enter elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int even_count=0;
        int odd_count=0;
        for(int i=0;i<n;i++){
           if(arr[i]%2==0){
            even_count++;
           }
           else{
            odd_count++;
           }
        }
       
        System.out.println("even :"+even_count);
        System.out.println("even :"+odd_count);
    }
}