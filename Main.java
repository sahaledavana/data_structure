
import java.io.*;
import java.util.*;

class Main
{

    public static void main(String args[])
    {

        Bubblesort ob;
        ob = new Bubblesort();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size");
        int n,b;
        int a[];
        n = scan.nextInt();
        a = new int[n];
        a = ob.insert(a,n);
        a = ob.sort(a, n);

        //sahal
        ob.display(a,n);


    }

}
