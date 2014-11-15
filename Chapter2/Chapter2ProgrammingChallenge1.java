class Chapter2ProgrammingChallenge1
{
/*
 test
 Gaddis pg. 105
   store your age, name, and annual income as literals in these variables.
   Should display these values as:
      My name is Joe Mahoney, my age is 26 and 
      I hope to earn $100000.0 per year.
 */
   public static void main (String[] args)
   {
      String name = "Rabin";
      int age = 43;
      double annualPay = 90000;
      
      System.out.println("My name is " + name + ", my age is " + age + " and");
      System.out.println("I hope to earn $" + annualPay + " per year.");
   }
}