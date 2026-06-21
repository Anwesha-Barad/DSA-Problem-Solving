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
           boolean duplicate=false;
           for(int j=0;j<i;j++){
            if(arr[i]==arr[j]){
                duplicate= true;
                break;
            }
           }
          
           if(!duplicate){
             System.out.print(arr[i]+" ");
           }
        }
    }
}
