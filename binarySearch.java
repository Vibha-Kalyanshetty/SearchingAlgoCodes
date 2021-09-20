import java.util.*;

class binarySearch{
    static  int binSearch(int a[] , int no , int key){
            int l=0 , r=no-1;
            while(l<=r)
            {
                int mid=(l+r)/2;
                if(key==a[mid]){
                    return mid;
                }
                else if(key<a[mid]){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array!");
        int n=sc.nextInt();
        System.out.println("Enter the values of array in Sorted order");
        int a[]= new int[30];
        for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
        }
        System.out.println("Enter the key or value to be searched!");
        int key = sc.nextInt();

        int val = binSearch(a, n , key);
        if(val!=-1){
        System.out.println("The key found at index " + val);
        }
        else{
            System.out.println("Key is not present!");
        }
    }
}