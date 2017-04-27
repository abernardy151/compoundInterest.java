/**
 * Created by Yael on 4/26/2017.
 */
import java.util.Scanner;

class compoundInterest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    float value, total, interest, interest2;

    System.out.println("Input the total");
    total = input.nextFloat();

    System.out.println("Input the interest");
    interest = input.nextFloat();
    interest2 = interest / 100;

    value = (total * interest2) + total;
    System.out.printf("The value total plus interest is " + value);

  }
}