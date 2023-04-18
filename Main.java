public class Main {

  static int a;
  static int b;
  static int c;
  static int d;

  public static void main(String[] args) {
    a = 55;
    b = 54;
    c = 55;
    d = 56;
    int s1 = a + b;
    int s2 = c + d;
    System.out.println(s1 > s2);
    s1++;
    s2-=2;
    System.out.println(s1 > s2);
    System.out.println( (s1 % 2 == 0) || (s2 % 2 == 0) );
  }

}
