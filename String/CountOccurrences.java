import java.util.Scanner;
class CountOccurrences{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String str=sc.nextLine();
        System.out.print("Enter Character:");
        char ch=sc.next().charAt(0);;
        int count=0;
        for(int i=0;i<str.length();i++){
        if(str.charAt(i) == ch){
            count++;
        }
       }
        System.out.print("not of times"+ch+" occuered "+count);

    }
}