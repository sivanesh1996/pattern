class Lcm3
{
    public static void main(String[] args)
     {
      int a=6;
      int b=24;
      int c=21;
      int max3=c>=((a>=b)?a:b)?c:((a>=b)?a:b);
    
           for(;max3>=c;max3++)
             {
              if(max3%b==0&&max3%c==0&&max3%a==0)  //multiplier max3 checking common multiplier
              {
               System.out.println(max3);
               break;
              } 
            }
        }
}
