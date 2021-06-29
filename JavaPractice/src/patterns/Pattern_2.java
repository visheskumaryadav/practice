package patterns;

public class Pattern_2 {
    public static void main(String[] args) {

        for(int i=0;i<5;i++) // for rows
        {
            for(int j=5-i;j>0;j--) //for cols
                System.out.print(" * ");
            System.out.println(""); //for the next row
        }
    }
}
