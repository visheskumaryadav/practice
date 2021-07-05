package Basics;


import java.util.ArrayList;
import java.util.List;

public class NumberSystem {

    public static int DecToOctal(int d)
    {

        int r;int sum=0;int p=1;
        while(d>0)
        {
            r=d%8;d=d/8;sum=sum+r*p;p=p*10;

        }
        return sum;
    }
    //using recursion
    public static void DTO(int n)
    {
        if(n>0){ DTO(n/8); System.out.print(n%8);}
        else
            return;
    }

    //octal addition of two numbers
    public static int OctalAddition(int n1,int n2)
    {
        int TmpSum=0;int carry=0;int remainPart=0; int sum=0;int r1,r2;
        int p=1;
        while(n1>0 || n2>0 || carry >0)
        {
            r1=n1%10;r2=n2%10; TmpSum=carry+r1+r2;
            carry=TmpSum/8;remainPart=TmpSum%8;
            sum=sum+remainPart*p;p=p*10;
            n1=n1/10;n2=n2/10;
        }
        return sum;
    }

    public static void DecToHex(int n)
    {
        List<Integer> remainders=new ArrayList<>();
        while(n>0)
        {
         remainders.add(n%16);
         n=n/16;
        }
        for(int i=remainders.size()-1;i>=0;i--)
        {
            if(remainders.get(i)>9 && remainders.get(i)<16)
            {
                System.out.print((char)(remainders.get(i)+87));
            }
            else
                System.out.print(remainders.get(i));
        }
    }

   
    public static void main(String[] args) {
       /* System.out.println(NumberSystem.DecToOctal(728));
        System.out.println(Integer.toOctalString(728));
        NumberSystem.DTO(728);
        System.out.println("\n"+NumberSystem.OctalAddition(236,754)); */
        //System.out.println(Integer.toHexString(2*7562));

       // NumberSystem.DecToHex(7562);
        System.out.println("\n");
        NumberSystem.HexAddition("1d8a","1d8a");
    }
}
