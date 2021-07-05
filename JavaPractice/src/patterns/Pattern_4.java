package patterns;

public class Pattern_4 {

    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {

            if(i==1 || i==5)
            {
                System.out.println("*****");

            }
            else
            {
                for(int s=1;s<=5-i;s++)
                    System.out.print(" ");
                System.out.println("*");
            }

        }

    }
}
