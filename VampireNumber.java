class VampireNumber
{
    static void main(int n)
    {int l=Integer.toString(n).length();
     int temp,flag=0;
     for(int i=(int)(Math.pow(10,l/2-1));i<(int)(Math.pow(10,l/2)-1);i++)
     { if(n%i==0 && Integer.toString(n/i).length()==l/2 && (n/i)%10!=0)
         { temp=(int)((n/i)*Math.pow(10,l/2)+i);
             System.out.println(temp);
             if(isSameFreq(temp,n,l))
             {flag=1;break;}
         }
     }
     if(flag==1)
     System.out.print("vampire number");
     else
     System.out.print("not vampire");
    }
    
    static boolean isSameFreq(int a,int b,int l)
    {//int n=(int)(a*Math.pow(10,l/2)+b);
        int ar[]=new int[10];
        for(int i=0;i<l;i++)
        {   ar[b%10]++;b/=10;
            ar[a%10]++;a/=10;
        }
        for(int i=0;i<10;i++)
        {if(ar[i]%2!=0)
            return false;
        }
        return true;
    }
}
    
        
         