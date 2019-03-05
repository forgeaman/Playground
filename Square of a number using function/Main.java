import java.util.Scanner;
class Main
{
  static int i;
 public static void aman(int n){
    i = n*n;
  System.out.println(i);
  }
	public static void main (String[] args)
    {
	Scanner sc = new Scanner(System.in);
      int m = sc.nextInt();
      aman(m);
	} 
}