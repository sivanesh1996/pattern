/*
class Pattern4
{
    public static void main(String[] args)
    {
     int row=0;
     while(row<3)
     {    
      int col=1;
     while(col<=3)
        {
         System.out.print(0);
         col++;
        } 
        System.out.print(1);
        System.out.println();
        row++;
     }
    }
}
*/

class Pattern4
{
    public static void main(String[] args)
    {
     int row=1;
     while(row<=4)
     {    
      int col=1;
     while(col<=4)
        {
         if(col==4)
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
        
