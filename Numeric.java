class Numeric
{
    public static void main(String[] args)
    {
     Numeric obj=new Numeric();
     obj.number0();
     obj.number1();
     obj.number2();
     obj.number3();
     obj.number4();
     obj.number5(); 
     obj.number6();
     obj.number7();
     obj.number8();
     obj.number9();
     }
    
    void number0()
     {
    for(int row=1;row<=5;row++)
     {
      for(int col=1;col<=5;col++)
        {
          if(col==1 || col==5 || row==1 & col!=5  || row==5 & col!=5)
          {
           System.out.print("*");
          }
          else
          {
           System.out.print(" ");
          }
        }
      System.out.println();
        
    } 
    System.out.println();   
    }
    
    void number1()
     {
     for(int row=1;row<=5;row++)
     {
      for(int col=1;col<=5;col++)
        {
         if(col==3)
          {
            System.out.print("*");
           }
          else
          {
           System.out.print(" ");
          }
        }
      System.out.println();
        
    } 
    System.out.println(); 
    } 
    void number2()
    {
    for(int row=1;row<=5;row++)
     {
      for(int col=1;col<=5;col++)
        {
          if(row==1 || row==3 || row==5 || row==2&col==5 || row==4&col==1)
          {
           System.out.print("*");
          }
          else
          {
           System.out.print(" ");
          }
         }
      System.out.println();
        
     } 
    System.out.println();    
   } 
    void number3()
      {
    for(int row=1;row<=5;row++)
     {
      for(int col=1;col<=5;col++)
        {
          if(row==1 || row==3 || row==5 || row==2&col==5 || row==4&col==5)
          {
           System.out.print("*");
          }
          else
          {
           System.out.print(" ");
          }
         }
      System.out.println();
        
     }  
    System.out.println();   
   }
    void number4()
    {
    for(int row=1;row<=5;row++)
     {
      for(int col=1;col<=5;col++)
        {
          if(col==1&row<=3 || row==3&col<=4 || col==4)
          {
           System.out.print("*");
          }
          else
          {
           System.out.print(" ");
          }
         }
      System.out.println();
        
     } 
    System.out.println();    
   }
    void number5()
     {
    for(int row=1;row<=5;row++)
     {
      for(int col=1;col<=5;col++)
        {
          if(row==1 || row==3 || row==5 || row==2&col==1 || row==4&col==5)
          {
           System.out.print("*");
          }
          else
          {
           System.out.print(" ");
          }
         }
      System.out.println(); 
     } 
      System.out.println();   
   }
    void number6()
    {
    for(int row=1;row<=7;row++)
     {
      for(int col=1;col<=7;col++)
        {
          if(col==1 || row==7 || row==4 || col==7&row>=4)
          {
           System.out.print("*");
          }
          else
          {
           System.out.print(" ");
          }
         }
      System.out.println();
        
     } 
     System.out.println();   
   }
    void number7()
     {
    for(int row=1;row<=7;row++)
     {
      for(int col=1;col<=7;col++)
        {
          if(row==1 || col==7)
          {
           System.out.print("*");
          }
          else
          {
           System.out.print(" ");
          }
         }
      System.out.println();
        
     }  
     System.out.println();  
   }
    void number8()
    {
    for(int row=1;row<=7;row++)
     {
      for(int col=1;col<=7;col++)
        {
          if(row==1 || row==7 || row==4 || col==1 || col==7)
          {
           System.out.print("*");
          }
          else
          {
           System.out.print(" ");
          }
         }
      System.out.println();
        
     }  
     System.out.println();  
   }
    void number9()
    {
    for(int row=1;row<=7;row++)
     {
      for(int col=1;col<=7;col++)
        {
          if(row==1 || row==4 || col==1&row<=4 || col==7)
          {
           System.out.print("*");
          }
          else
          {
           System.out.print(" ");
          }
         }
      System.out.println();
        
     }    
   }
} 


