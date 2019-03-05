import java.util.Scanner;
class Main{
 static int i,sum = 0;
  static void aman(int n)
 {
 
   for(i = 0;i<=n;i++){
     sum = sum+i;
 
   }
    System.out.println(sum);
  }
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
      int m = sc.nextInt();
      aman(m);
    }	}
