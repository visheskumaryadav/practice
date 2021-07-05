package Arrays;

import java.util.Scanner;

public class SpanOfArray {

    public static int Span(int[] arr)
    {
        int big=arr[0];
        int small=arr[0];

       for(int i=1;i<arr.length;i++)
       {
           if(big<arr[i]){big=arr[i];}
           if(small>arr[i]){small=arr[i];}
       }

        return (big-small);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" size :");
        int size=input.nextInt();
        int[] a=new int[size];

        System.out.println("enter the element");
        for(int i=0;i<size;i++)
            a[i]=input.nextInt();
        System.out.println(SpanOfArray.Span(a));

    }

}
