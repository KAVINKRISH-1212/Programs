import java.util.*;

class Quciksort 
{
    int pivot_index(int arr[], int start, int end)
    {
        int li= start-1;
        int pivot;
        pivot = arr[end];
        for(int i=start; i<end ; i++)
        {
            if(arr[i]<=pivot)
            {
                ++li;
                int temp=arr[i];
                arr[i]=arr[li];
                arr[li]=temp;
            }
        }
        ++li;
        int temp=arr[li];
        arr[li]=arr[end];
        arr[end]=temp;
        return li;
    }
    
    void quick_Sort(int arr[], int start, int end)
    {
        if(start<end)
        {
            int pi=0;
            pi=pivot_index(arr,start,end);
            quick_Sort(arr,start,pi-1);
            quick_Sort(arr,pi+1,end);
        }
     
    }
    void print_array(int arr[],int len)
    {
        for(int i=0;i<len;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the total number of integer.. ");
	    int n = sc.nextInt();
	    int [] arr = new int[n];
	    for(int i=0 ; i<n ; i++)
	    {
	        arr[i] = sc.nextInt();
	    }
	    Quciksort q = new Quciksort();
	    q.quick_Sort(arr,0,n-1);
        q.print_array(arr,n);
	}
}