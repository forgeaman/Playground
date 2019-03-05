import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sum = 0, rem = 1;
      for(int i = 0;i<n;i++){
        rem = n%10;
        sum = sum+rem;
        n = n/10;
      }
      System.out.println(sum);
	}
}