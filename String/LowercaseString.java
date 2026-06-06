import java.util.*;
class LowercaseString{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch=(char)(ch+32);
            }
          System.out.print(ch);  
        }
    }
}