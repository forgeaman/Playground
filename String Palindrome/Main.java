import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String a = str;
      String reverse ="";
      for(int i = str.length()-1;i>=0;i--){
        reverse = reverse+str.charAt(i);
      }
      if(a.equals(reverse))
        System.out.println("Yes");
      else
             System.out.println("No");
}
    }
    
    