import java.util.*;
class Main {
	public static void main (String[] args) {
      int sum = 0,rem = 1;
		Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      while(a>0){
      rem = a%10;
      sum = sum+rem;
      a = a/10;
      }
      System.out.println(sum);
	}
}