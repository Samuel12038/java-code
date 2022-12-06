
/***
  functions practice with java
program to calculate invoices
*/

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Currency;
class Main
  {
    // function definition above int main for the invoice calculator
  public static double invoiceCalculator (double rate,double hours,String custName,int discount)
    {
      double grossDue = 0.0, netDue= 0.0, tax =0.0, taxRate= 0.0;
      grossDue = (rate * hours);
      if(discount == 1)
      {
        grossDue = (rate * hours)*0.90;
      }
        else if (discount == 2)
       {
        grossDue = (rate * hours)*0.80;
      }
       else
      {
        grossDue = (rate*hours);
      }
      tax = grossDue * taxRate;
      netDue = grossDue * tax;
      System.out.print(custName + ": ");
      return netDue;
    }
 public static void main (String[] args)
    {
    double result = 0.0;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    System.out.println( invoiceCalculator(95.00,35.50,"Web, LLC",1));
    System.out.println(formatter.format(result));

    result = invoiceCalculator(95.00,27.00, "Dr.T's Turkey Legs",2);
    System.out.println( formatter.format(result));
  }
}

public static void main (String[] args)
{
double result = 0.0;
NumberFormat formatter= NumberFormat.GetCurrencyInstance();
result = invoiceCalculator(rate, hours, custName, discount,1);

}