import java.util.Scanner;
class Main{
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int temp = n;int rem = 1; int sum = 0;
      while(n>0){
        rem = n%10; 
        n = n/10;
        sum = sum+(rem*rem*rem);
       
      }
  if(temp == sum)
    System.out.println("Armstrong Number");
        else
          System.out.println("Not a Armstrong Number");
        
	}
}