import java.util.Scanner;
class RemoveVowelsUsingReplace{
    public static void main(String s[]){
      
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter String with space:");
        String str=sc.nextLine();
        str= str.replaceAll("[AEIOUaeiou]","");
        System.out.println("after removing space the string is:"+str);
    }
}