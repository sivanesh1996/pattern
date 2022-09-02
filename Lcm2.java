class Lcm2
{
    public static void main(String[] args)
     {
      int b=24;
      int c=21;
      int a=(b>c)?b:c; // finding larger number

           for(;a>=c;a++)  //infinite loop with increment by 1
             {
              if(a%b==0&&a%c==0)    //checking the factors of both numbers whether the factors are same or not
              {
               System.out.println(a);  //print the common multiplier
               break;                 //We need minimimal multiplier value,so break the loop when enters inside
              } 
            
            }
        }
}

/*
class Lcm2
{
    public static void main(String[] args)
     {
      int b=24;
      int c=21;
      int a=(b>c)?b:c; // finding larger number
      int i=a;
           for(int x=1;i>=c;i=a*x)  //infinite loop with increment with larger value
             {
              if(i%b==0&&i%c==0)
              {
               System.out.println(i);
               break;
              } 

                x++;
            
            }
        }
}

*/
