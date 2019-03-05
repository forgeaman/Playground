import java.util.Scanner;
class Main{
 static void greatest(){
   int a,b,c;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
    if(a>b &&a>c)
      System.out.println(a);
     if(b>c && b>a)
        System.out.println(b);
    if(c>b &&c>a)
      System.out.println(c);
  }
	public static void main (String[] args){
	greatest();   
	}
}