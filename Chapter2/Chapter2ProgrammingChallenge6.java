public class Chapter2ProgrammingChallenge6
{
/*
   Gaddis-pg.106
      Sales Prediction
      East Coast sales division makes 62 percent of total sales.
      Total sales will be $4.6 million. How much will the East Coast division make?
*/
   public static void main (String[] args)
   {
      double percentage = 0.62, totalSales = 4600000.0, eastCoastRevenue = 0.0;
      eastCoastRevenue = totalSales * percentage;
      System.out.println("East Coast division sales is $" + eastCoastRevenue);
      
   }
}