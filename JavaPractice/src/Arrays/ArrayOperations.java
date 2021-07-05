package Arrays;

import java.util.Scanner;

public class ArrayOperations {
    //method to reverse an array
    public static void RevTheArr(int [] arr, int i,int j)
    {
        //int i=0;int j=arr.length-1;
        while(i<=j)
        {
            if(i<j)
            {
                int tmp=arr[i]; arr[i]=arr[j];arr[j]=tmp;
            }
            i++;j--;
        }
       // PrintArray(arr);
    }
    public static void PrintArray(int [] arr) // printing method for arrays
    {
        System.out.println("");
        for (int x:arr)
            System.out.print(x+" ");
    }

    //method to rotate an array acc. to value of K
    // METHOD 1
    public static void RotateArrayMethod1(int [] arr,int k)
    {
        if(k%arr.length>0)
            arr= RotateRight(arr,k%arr.length);
        else if(k%arr.length<0)
                arr= RotateLeft(arr,k%arr.length);
        else
        { PrintArray(arr);System.exit(1);}

        PrintArray(arr);
    }
    public static int[] RotateRight(int [] a, int k)// rotating right
    {
        for(int i=0;i<k;i++)
        {     int tmp=a[a.length-1];
            for(int j=a.length-1;j>0;j--)
            {
                a[j]=a[j-1];
            }
            a[0]=tmp;
        }
        return a;
    }
    public static int[] RotateLeft(int []a, int k)// rotating left
    {

        for(int i=0;i>k;i--)
        {     int tmp=a[0];
            for(int j=1;j<a.length;j++)
            {
                a[j-1]=a[j];
            }
            a[a.length-1]=tmp;
        }

        return a;
    }

    // METHOD 2
    public static void RotateArrayMethod2(int [] a,int k)
    {
        k=k%a.length;
        if(k<0)
            k=k+a.length;
        //part1
        ArrayOperations.RevTheArr(a,0,a.length-k-1);
        //part2
        ArrayOperations.RevTheArr(a,a.length-k,a.length-1);
        //part3
        ArrayOperations.RevTheArr(a,0,a.length-1);
     PrintArray(a);
    }
    public static void main(String[] args) {

     Scanner input=new Scanner(System.in);
        System.out.println(" size :");
        int size=input.nextInt();
        int[] a=new int[size];

        System.out.println("enter the element");
        for(int i=0;i<size;i++)
            a[i]=input.nextInt();
     // ArrayOperations.RevTheArr(a);
      ArrayOperations.RotateArrayMethod2(a,3); // for rotation disable the RevTheArr() method before


    }

}

/*
Another way:-
there is an another method for rotation: we know that if rotation is done array.length times then it will come back to original form
so if value of K=102 and array.length=5 then k=k%array.length=2 means we have to rotate only 2 times
lets say we have array of size=5 then  for k=1 and k=-4 the rotation will be same
so we can do for k=-4 as k=k+array.length=-4+5=1 then just rotate for k=1 so there is no need
to write another method for left rotation.
In method2 we divide the array on the basis of K in 2 parts and reverse each part
now after reversing each part do reversing the whole array.
 */
