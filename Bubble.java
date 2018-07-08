import java.io.*;
import java.util.*;


class Bubblesort
{



    public int[] insert(int a[],int n)
    {
        Scanner scan = new Scanner(System.in);

        for(int i= 0 ; i < n ; i++)
        {
            System.out.println("enter the number " +(i) );
            a[i]= scan.nextInt();
        }
        return a;
    }

    public int[] sort(int a[],int n)
    {
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j< (n-1) ; j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        return a;
    }


    public void display(int a[],int n)
    {

        System.out.println("The sorted order is"  );
        for(int i = 0 ; i < n; i++)
        {
            System.out.println(a[i]+ " " );
        }
    }



}


class Bubble
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
        ob.display(a,n);


    }
}

