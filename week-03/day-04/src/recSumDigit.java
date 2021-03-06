// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

public class recSumDigit {

  public static void main(String[] args) {
    int number = 158;
    System.out.println(recDigits(number));


  }

  public static int recDigits(int n) {
    if (n == 0) {
      return 0;
    } else {

      return recDigits(n / 10) + n % 10;
    }

  }
}





