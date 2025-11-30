import java.util.Scanner;
class LargestElement {
    public static void main(String[] args) {
        int large = Integer.MIN_VALUE;
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
            if(n>large){
                large = n;
            }
        }
        System.out.println("Largest element in the array:" + large);
    }
}