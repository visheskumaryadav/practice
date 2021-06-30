/*
program for the below pattern:

 *  *  *  *  *  *  *  *  *  *
 *  *  *  *        *  *  *  *
 *  *  *              *  *  *
 *  *                    *  *
 *                          *

 */


package patterns;

public class Pattern_2 {
    public static void main(String[] args) {

        for(int i=0;i<5;i++) // for rows
        {
            for(int j=0;j<5-i;j++) //for left side
                System.out.print(" * ");


            for(int s=0;s<2*i;s++) //for space
                System.out.print("   ");

            for(int k=0;k<5-i;k++) // for right side
                System.out.print(" * ");
            System.out.println("");

        }




    }
}
