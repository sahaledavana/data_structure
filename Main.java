
import java.io.*;
import java.util.*;

class Main
{

    public static void main(String args[])
    {

        Sort ob;
        ob = new Sort();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size");
        int n,b;
        int a[];
        n = scan.nextInt();
        a = new int[n];
        a = ob.insert(a,n);
        a = ob.mergesort(a, 0 , n-1);

        //sahal
        ob.display(a,n);


    }

}
