class Gcd3
{
   public static void main(String[] args)
      {
        int a=8;
        int b=64;
        int c=48;
        int gcd=0;
        int d=(((a<=b)?a:b)<c)?((a<=b)?a:b):c;
          for(int i=1;i<=d;i++)
            {
             if(a%i==0 && b%i==0 && c%i==0)
               {
                gcd=i;
                }
             
            }
           System.out.println("GCD of "+a+" , "+b+" and "+c+ " is: "+gcd);  
       }
}
