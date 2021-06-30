/*
program for the below pattern:

 *                          *
 *  *                    *  *
 *  *  *              *  *  *
 *  *  *  *        *  *  *  *
 *  *  *  *  *  *  *  *  *  *

 */
package patterns;

public class Pattern_1 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            //for left side
            for(int j=0;j<i+1;j++)
                System.out.print(" * ");

            // for spaces

            for(int s=0;s<8-2*i;s++)
                System.out.print("   ");//three spaces

            // for right side

            for(int k=0;k<i+1;k++)
                System.out.print(" * ");
            System.out.println("");
        }
    }
}
