class Pattern12
{
    public static void main(String[] args)
    {
     int row=1;
     while(row<=4)
        {
         int col=1;
         while(col<=4)
            {
             if((col*row==4 || col*row==6) && row!=col)
                 System.out.print("0");
             else
                System.out.print("1");
             col++;
            }
       System.out.println();
       row++;
         }
    }
}
