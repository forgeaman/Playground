import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner sc = new Scanner(System.in);
      int n,sum,last;
      n = sc.nextInt();
      last = n%10;
      while(n>=10){
        n = n/10;
      }
      sum = n+last;
      System.out.println(sum);
	}
}