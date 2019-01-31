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
  public static void main(String[] args){
    //System.out.println(squareRoot(100));
    //System.out.println(squareRoot(25));
  }
}
