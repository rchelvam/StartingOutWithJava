public class Chapter2ProgrammingChallenge3
{
/*
   Gaddis - pg. 106
      Write a program that displays the following information, each on a separate line:
      Your name
      Your address, with city, state, and ZIP
      Your telephone number
      Your college major
      
      Although these items should be displayed on separate output lines,
      USE ONLY A SINGLE println statement.
*/
   public static void main (String[] args)
   {
      String name = "Rabin Chelvam", streetAddress = "6815 Brighton Hill Ln", city = "Katy", state = "Texas", zipCode = "77450", telephone = "713-688-2081", collegeMajor = "Computer Science";
      System.out.println (name + "\n" + streetAddress + "\n" + city + ", " + state + " " + zipCode + "\n" + telephone + "\n" + collegeMajor);
      
   }
}