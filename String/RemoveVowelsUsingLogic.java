import java.util.Scanner;
class RemoveVowelsUsingLogic{
    public static void main(String s[]){
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String :");
        String str=sc.nextLine();
        String result="";
        for(int i=0;i< str.length();i++){
            char ch=str.charAt(i);
            if(ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u'&&
               ch!='A'&& ch!='E'&& ch!='I'&& ch!='O'&& ch!='U'
             ){
                result= result+ ch;
             }
        }
        System.out.println("Result:"+result);
    }
}