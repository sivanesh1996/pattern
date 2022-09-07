class Pattern7
{
    public static void main(String[] args)
    {
     //int i=5;
     int row=1;
     while(row<=4)
        {
         int col=1;
         while(col<=4)
            {
             if(row==1)
                {
                 System.out.print("0");
                }   
              else
                {
                 System.out.print("1");
                }
            col++;
            }
      System.out.println();
      row++;
        }
    }
}
