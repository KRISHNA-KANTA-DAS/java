import java.util.*;
public class bubble{
    public static void main(String[] args){
        System.out.println("Enter the array size");
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr =new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the array "+i+" th elemnts");
            arr[i]=sc.nextInt();
        }
        bubble_sort(arr);

    }
    public static void bubble_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }

for(int i=0;i<arr.length;i++){
    System.out.print(" "+arr[i]);
}

    }
}