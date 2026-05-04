//String palindrome

import java.util.Scanner;
class Stringpalindrome {
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=sc.nextLine();

        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equalsIgnoreCase(rev))
            System.out.println(str+" is a palindrome .");
        else
            System.out.println(str+" is not a palindrome .");

    }
}