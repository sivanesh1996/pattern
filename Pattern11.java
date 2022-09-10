class Pattern11
{
    public static void main(String[] args)
    {
     int row=1;
     while(row<=4)
        {
         int col=1;
         while(col<=4)
            {
             if(col==1 || col==4 || row==1 || row==4)
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
