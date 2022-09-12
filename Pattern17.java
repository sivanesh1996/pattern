class Pattern17
{
    public static void main(String[] args)
    {
     for(int row=1;row<=7;row++)
     {
      for(int col=7;col>=row;col--)
       {
        System.out.print("*");
        }
      System.out.println();
     }
    }
}
