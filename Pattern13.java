class Pattern13
{
    public static void main(String[] args)
    {
     int row=1;
     while(row<=4)
        {
         int col=1;
         while(col<=4)
            {
             if(col!=row)
                 System.out.print("1");
             else
                System.out.print("0");
             col++;
            }
       System.out.println();
       row++;
         }
    }
}
