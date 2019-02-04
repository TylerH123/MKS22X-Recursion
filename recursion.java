import java.util.*;

public class recursion{
  public static double squareRoot(double n, double g){
    if (Math.abs((n - g * g) / n * 100) <= 0.00001){
      return g;
    }
    else{
      return squareRoot(n,(n / g + g) / 2);
    }
  }
  public static double squareRoot(double n){
    return squareRoot(n,1);
  }
  public static int fib(int n, int next, int current){
    if (n == 0){
      return current;
    }
    else{
      return fib(n-1,next+current,next);
    }
  }
  public static int fib(int n){
    return fib(n,1,0);
  }
  public static void makeAllSums(int n, int sum, ArrayList<Integer> L){
    if (n > 0){
      makeAllSums(n - 1,sum + n,L);
      makeAllSums(n - 1,sum,L);
    }
    else{
      L.add(sum);
    }
  }
  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList<Integer> L = new ArrayList<Integer>();
    makeAllSums(n,0,L);
    return L;
  }
  public static void main(String[] args){
    //System.out.println(squareRoot(100));
    //System.out.println(squareRoot(25));
    //System.out.println(fib(0));
    System.out.println(makeAllSums(3).toString());
  }
}
