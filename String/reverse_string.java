
//string reverse

import java.util.Scanner;
class reverse_string{
    public static void main(String s[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String:");
      String s1=sc.nextLine();
      String rev= "";
      for(int i=s1.length()-1;i>=0;i--){
        rev+= s1.charAt(i);
      }
      System.out.println("reverse of: "+s1+" is :"+rev);


    }
}
















