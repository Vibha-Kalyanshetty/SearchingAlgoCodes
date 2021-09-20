import java.util.*;

class linearSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int flag=0;
        System.out.println("Linear Search Code");
        System.out.println("Enter the size of array!");
        int n=sc.nextInt();
        System.out.println("Enter the values for the array!");
        int arr[] = new int[10];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value or key you want to find in the array!");
        int key=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("Key found at index " + i);
                flag=1;
                break;
            }
        }
        if(flag==0){
                System.out.println("Key not found at any index!");
        }
}
}