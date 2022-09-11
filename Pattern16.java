
class Pattern16
{
    public static void main(String[] args)
    {
     int i=0;
     for(int row=1;row<=3;row++)
      {
       for(int col=5;col>row+i;col--)
        {
         System.out.print(" ");
        }
         for(int col=1;col<=row+i;col++)
         { 
          System.out.print("* ");
         }
          i++;
      System.out.println();
      }
             i=0;
            for(int row=1;row<=2;row++)
              {
                for(int col=2+i;col>=1;col--)
                  {
                   System.out.print(" ");
                   }
                  for(int col=3-i;col>=1;col--)
                    {
                     System.out.print("* ");
                    }
                    i+=2;
            System.out.println();
               }
    }
}




/*
class Pattern16
{
    public static void main(String[] args)
    {
     int i=0;
     for(int row=1;row<=3;row++)
      {
       for(int col=5;col>row+i;col--)
        {
         System.out.print(" ");
        }
         for(int col=1;col<=row+i;col++)
         { 
          System.out.print("* ");
         }
          i++;
      System.out.println();
      }
             
            for(int row=1;row<=2;row++)
              {
                for(int col=2*row;col>=1;col--)
                  {
                   System.out.print(" ");
                   }
                  for(int col=3/row;col>=1;col--)
                    {
                     System.out.print("* ");
                    }
                   
            System.out.println();
               }
    }
}

*/
