
import java.util.Scanner;
class CountVowels{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String:");
        String str=sc.nextLine();

        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' ||ch=='O' ||ch=='U'  ){
                 System.out.println("the vowels are:"+ch+ " ");
                count++;
            }
        }
         System.out.println("number of vowels are:"+count);
    }
}