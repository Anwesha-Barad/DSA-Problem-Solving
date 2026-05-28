import java.util.Scanner;
class RemoveSpaceUsingLogic{
    public static void main(String s[]){
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String with space:");
        String str=sc.nextLine();
        String replace="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!= ' '){
                replace+=str.charAt(i);

            }
        }
         System.out.println("Result:"+replace);
    }
}