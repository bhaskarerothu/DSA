    import java.util.Scanner;
public class SmallestElement {
    public static void main(String[] args) {
        int small = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int n:arr){
            if(n<small){
                small = n;
            }
        }
        System.out.println("Smallest element in the array:" + small);
    }
}