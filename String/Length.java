import java.util.Scanner;
class Length{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String str=sc.nextLine();
        int count=0;
        for(int i=1;i<=str.length();i++){
            count++;
        }
        System.out.print("The String length is:"+count);

    }
}