/*
program for the below pattern:

 *  *  *  *  *  *  *  *  *  *
 *  *  *  *        *  *  *  *
 *  *  *              *  *  *
 *  *                    *  *
 *                          *
 *  *                    *  *
 *  *  *              *  *  *
 *  *  *  *        *  *  *  *
 *  *  *  *  *  *  *  *  *  *

 */

package patterns;

public class Pattern_3 {

    public static void main(String[] args) {

        for(int i=0;i<5;i++) // for rows :upper section
        {
            for(int j=0;j<5-i;j++) //for left side
                System.out.print(" * ");


            for(int s=0;s<2*i;s++) //for spaces as spaces are multiple of 2
                System.out.print("   ");

            for(int k=0;k<5-i;k++) // for right side
                System.out.print(" * ");
            System.out.println(""); // for next line

        }


        for(int i=0;i<4;i++) // for rows: lower section
        {
            for(int j=0;j<i+2;j++)
                System.out.print(" * ");

            for(int s=0;s<6-2*i;s++)
                System.out.print("   ");
            for(int h=0;h<i+2;h++)
                System.out.print(" * ");
            System.out.println("");
        }
    }
}
