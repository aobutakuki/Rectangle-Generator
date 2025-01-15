import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Rectangle Generator:");
        System.out.println("[Input Rectangle X]:");
        int x = myObj.nextInt();

        System.out.println("[Input Rectangle Y]:");
        int y = myObj.nextInt();

        System.out.println("[Input Rectangle Material (@,&,p)]:");
        char c = myObj.next(".").charAt(0);

rectangle(c,x,y);
    }

    public static void rectangle(char material, int x, int y)
    {
        for(int i = 0; i < y ; i++) {
            if(1 > i || i < y) {

                    System.out.println();
            }
                for(int j = 0; j <= x; j++)
                    {
                        if(i == 0 || i == y - 1)
                        {
                            System.out.print(material);
                        }
                        else if(j == 0 || j == x)
                        {
                            System.out.print(material);
                        }
                        else
                        {
                            System.out.print(' ');
                        }

                    }

        }
//Formatting
        System.out.println();

    }



}