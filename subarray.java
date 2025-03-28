import java.util.*;
public class subarray {
    public static void main(String[] args){
        System.out.println("ENter the size of the array");
         Scanner sc= new Scanner(System.in);
         int size= sc.nextInt();
   int [] arr= new int[size];


  System.out.println("Enter the array elements");
  for(int i=0;i<arr.length;i++){
   arr[i]=sc.nextInt();
  }
  array(arr);
}
public static void array (int sub[]){
    System.out.print("THe arrray elements are :\n");
    for(int i=0;i<sub.length;i++){
        System.out.print(sub[i] +" ");
    }
    System.out.println("Now printing the sub arrays");
    for(int k=0;k<sub.length;k++){
    for(int i=k;i<sub.length;i++){
        for(int j=0;j<=i;j++){
           System.out.print(sub[j]); 
        }
        System.out.print("\n");
    }
    System.out.print("\n");
  
}
}

}
