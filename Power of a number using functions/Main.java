import java.util.Scanner;
import java.lang.Math; 
class Main{
static void aman(double n,double m){
  double v = Math.pow(n , m);
  System.out.println(v);
}
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int b = sc.nextInt();
    aman(k,b);
  }
}