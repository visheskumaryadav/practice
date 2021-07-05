package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BarChart {
    public static void BChart(int[] arr)
    {
        int[]b=new int[arr.length];//another array needed to store difference b/w max no. and individual nos.
        int big=arr[0]; // maximum no. is needed  for maximum height
        for(int i=1;i<arr.length;i++)
        {
            if(big<arr[i]){big=arr[i];}
        }
        for(int i=0;i<arr.length;i++)
        {
            b[i]=big-arr[i]; //to get no. of spaces
        }
        for(int r=0;r<big;r++) //rows =height of matrix
        {
            for(int c=0;c<arr.length;c++)// col= length of arr[]
            {
                if(b[c]!=0)
                {   b[c]=b[c]-1;// decrement the spaces by 1
                    System.out.print(" ");
                }
               else{
                    System.out.print("*"); // if value of b[]==0 print '*'
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" size :");
        int size=input.nextInt();
        int[] a=new int[size];

        System.out.println("enter the element");
        for(int i=0;i<size;i++)
            a[i]=input.nextInt();
        BarChart.BChart(a);
    }
}
