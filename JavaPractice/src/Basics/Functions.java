package Basics;

public class Functions {

    // below method takes a number(n) and counts frequency(count) of a digit(d) inside that no.
    public static int  DigitFrequency(int n,int d)
    {   int r;int count =0;
        while(n!=0)
        {
             r=n%10;
             if(r==d)
                 count++;
             n=n/10;
        }
        return count;
    }



    public static void main(String[] args) {
        System.out.println(Functions.DigitFrequency(95439692,7));
    }
}
