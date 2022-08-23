class PatternAlph
{
    public static void main(String[] args)
    {
     PatternAlph obj=new PatternAlph();
     obj.letterA();
     obj.letterB();
     obj.letterC();
     obj.letterD();
     obj.letterE();
     obj.letterF();
     obj.letterG();
     obj.letterH();
     obj.letterI();
     obj.letterJ();
     obj.letterK();
     obj.letterL();
     obj.letterM();
     obj.letterN();
     obj.letterO();
     obj.letterP();
     obj.letterQ();
     obj.letterR();
     obj.letterS();
     obj.letterT();
     obj.letterU();
     obj.letterV();
     obj.letterW();
     obj.letterX();
     obj.letterY();
     obj.letterZ();
     }
    void letterA()
      {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(row==4 || col==1&row>2 || col==5&row>2 || row==2&col==2 || row==1&col==3 || row==2&col==4)
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
    
    void letterB()
      {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(row==4 || col==1 || row==1&col<4 || row==2&col==5 || row==3&col==5 || row==5&col==5 || row==6&col==4 || row==7&col<4  )
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

    void letterC()
     {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(row==1 || col==1 || row==7)
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

    void letterD()
     {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(row==1&col<5 || col==1 || row==7&col<5 || col==5&(row>1&row<7))
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

    void letterE()
     {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(row==1 || row==4 || row==7 || col==1)
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

    void letterF()
      {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(row==1 || row==4 || col==1)
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

    void letterG()
      {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(row==1 || row==7 || col==1 || col==5&row>4 || row==5&col>2 || row==3&col>2  || row==4&col==3)
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

    void letterH()
     {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(col==1 || col==5 || row==4)
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

     void letterI()
      {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(col==3 || row==1 || row==7)
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
    
     void letterJ()
       {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(col==3 || row==1 || row==7&col<4 || col==1&row>4)
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
     
    void letterK()
      {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=4;col++)
        {
         if(col==1 || col+row==5 || col+row==7&(col<3) || col+row==9&(col>2&col!=4) || col+row==11&(row>4) )
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
    
     void letterL()
       {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=4;col++)
        {
         if(col==1 || row==7 )
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

     void letterM()
       {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(col==1 || col==5 || row+col==6&(row<4) || row==2&(col==2))
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

     void letterN()
      {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=7;col++)
        {
         if(col==1 || col==7 || row==col )
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

     void letterO()
       {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(col==1&row!=1&row!=7 || col==5&row!=1&row!=7 || row==1&col!=1&col!=5 || row==7&col!=1&col!=5 )
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
      
      void letterP()
        {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(col==1 || row==1&col!=5 || row==3&col!=5 || row==2&col==5)
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

     void letterQ()
       {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=7;col++)
        {
         if(col==1&row!=1&row!=7 || col==5&row!=1&row!=7 || row==1&col!=1&col<5 || row==7&col!=1&col!=5 || row==5&col==2 || row==6&col==4 )
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

     void letterR()
       {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(col==1 || row==1&col!=5 || row==3&col!=5 || row==2&col==5 || row==4&col==2 || row==5&col==3 || row==6&col==4 || row==7&col==5 )
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

     void letterS()
      {
     for(int row=1;row<=5;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(row==1&col!=1 || row==2&col==1 || row==3&col!=1&col!=5 || row==4&col==5 || row==5&col!=5)
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

     void letterT()
      {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(row==1 || col==3)
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

     void letterU()
       {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(col==1&row<7 || col==5&row<7 || row==7&col!=1&col!=5)
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
    
     void letterV()
       {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(col==1&row<4 || row==4&col==2 || row==5&col==3 || row+col==8&row<5 || col==5&row<3)
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
    
     void letterW()
       {
     for(int row=1;row<=7;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(col==1 || col==5 || row+col==8&(row>4) || row==6&col==4)
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

     void letterX()
       {
     for(int row=1;row<=5;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(row==col || row+col==6)
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

     void letterY()
        {
     for(int row=1;row<=5;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(row==col&row<4 || row+col==6&row<3 || col==3&row>2)
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

     void letterZ()
       {
     for(int row=1;row<=5;row++)
      {
       for(int col=1;col<=5;col++)
        {
         if(row==1 || row==5 || row+col==6)
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
}
