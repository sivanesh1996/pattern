class Lcm4
{
    public static void main(String[] args)
     {
      int a=6;
      int b=20;
      int c=20;
      int d=20;
     int max4=((d>((b>c)?b:c)?d:((b>c)?b:c))<a)?a:(d>((b>c)?b:c)?d:((b>c)?b:c));
    
           for(;max4>=c;max4++)
             {
              if(max4%b==0&&max4%c==0&&max4%a==0&&max4%d==0)  //max4 multiplier checking common multiplier
              {
               System.out.println(max4);
               break;
              } 
            }
        }
}
