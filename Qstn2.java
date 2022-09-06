class Qstn2
{
    public static void main(String[] args)
     {

       int n=3143;
       int count=0;
       int s1=0;
       int s2=0;
       int sum=0;


        while(n>0)
         {
          sum=n%10;
          count++;
          n=n/10;

           if(count%2==0)
            {
             s1=s1+sum;
            }

           else
            {
             s2=s2+sum;
            }
          
         }

          if(count%2!=0)
           {
            System.out.println(s2-s1);
            }
          else
            {
             System.out.println(s1-s2);
            }
            
       }
}
