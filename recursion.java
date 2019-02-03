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
  public static ArrayList<Integer> makeAllSums(int n, int g, int size){
    ArrayList<Integer> L = new ArrayList<Integer>();
    if (L.size() == Math.pow(2, size)){
      return L;
    }
    if (n == 0){
      L.add(g);
    }
    else{
      return makeAllSums(n-1,g+n);
    }
    if (n == 0){
      L.add(g);
    }
    else{
      return makeAllSums(n-1,g);
    }
  }
  public static ArrayList<Integer> makeAllSums(int n){
    return makeAllSums(n,0,n.size());
  }
  public static void main(String[] args){
    //System.out.println(squareRoot(100));
    //System.out.println(squareRoot(25));
    //System.out.println(fib(0));
    System.out.println(makeAllSums(3).toString());
  }
}
