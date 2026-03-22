//duplicate value
import java.util.Scanner;
class Duplicate_Element{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size: ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter array element: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    for(int k=j;k<n-1;k++){
                        arr[k]=arr[k+1];
                    }
                      n--;
                j--;
                }
            }
        }
        System.out.println("removed duplicate value");
        for(int i=0;i<n;i++){
             System.out.println(arr[i]+" ");
        }
    }
}