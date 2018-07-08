import java.io.*;
import java.util.*;

class Sort
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

    public int[] bubblesort(int a[],int n)
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
    public int[] mergesort(int a[],int low , int high)
    {

      if (low < high)
   		{
   		   int mid = (low + high) /2 ;
   		   mergesort(a , low , mid);
   		   mergesort(a , mid   + 1 , high);
          merge(a, low , mid , high);
   		}
      return a;
  }

  public void merge(int a[],int low , int mid, int high)
  {
    int arr1_begin = low;
    int arr1_end = mid;
    int arr2_begin = mid + 1;
    int arr2_end = high;
    int arr3_size = high -low + 1 ;

    int arr3_indx = 0;
    int temp[] = new int[arr3_size];
    int i=0;

    while (arr2_begin <= arr2_end && arr1_begin <= arr1_end)
    {
      if(a[arr1_begin] > a[arr2_begin])
      {
        temp[arr3_indx] = a[arr2_begin];
        arr2_begin = arr2_begin+1;
      }
      else
      {
        temp[arr3_indx] = a[arr1_begin];
        arr1_begin = arr1_begin + 1;
      }

      arr3_indx = arr3_indx + 1;
    }

    System.out.println(arr3_indx+ " " + " "  + arr1_begin + " "+ arr1_end + " " + arr2_begin  + " " + arr2_end);
    if(arr2_begin < arr2_end)
    {
      arr1_begin = arr2_begin;
    }

    while(arr3_indx < arr3_size)
    {
      System.out.println(arr3_indx );
      System.out.println(arr1_begin );
      temp[arr3_indx] = a[arr1_begin];
      arr1_begin = arr1_begin + 1;
      arr3_indx = arr3_indx + 1;
    }

    arr3_indx = low;
    while(arr3_indx <= high)
    {
      a[arr3_indx] = temp[i];
      arr3_indx++;
      i++;
    }
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
