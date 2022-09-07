/*
class Pattern5
{
    public static void main(String[] args)
    {
     int row=1;
     while(row<4)
     {
     int n=1; 
     while(n<=2)     
     {  
      int col=1;
     while(col>=0)
        {
         System.out.print(col);
         //System.out.print(1);
         col--;
        
        } 
        n++;    
     }
        //System.out.print();
        System.out.println();
        row++;
     }
    }
}

*/

class Pattern5
{
    public static void main(String[] args)
    {
     int row=1;
     while(row<=4)
        {
         int col=1;
         while(col<=4)
            {
             if(col==1 || col==3)
                {
                 System.out.print("1");
                }
             else
                {
                 System.out.print("0");
                }
            col++;
            }
       System.out.println();
       row++;
        }
    }
}
        
