import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
//      int[] arr = {10,20,30,40,50}; normal array create pandradhu...
        //object vechu create pandradhu [new] keyword use panni....
//        int[] arr = new int[4];
//        arr[0]=100;
//        arr[1]=200;
//        arr[2]=300;
//        arr[3]=400;
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the size of an array");
//        int size = s.nextInt();
//        int[] arr = new int[size];

//
//        System.out.println("Enter an array values");
//        for (int i=0;i<arr.length;i++){
//            arr[i] = s.nextInt();
//        }
//        System.out.println("Array values are");
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        System.out.println();
//        System.out.println("Reversed Array values are");
//        for (int i=arr.length-1;i>=0;i--){
//            System.out.println(arr[i]);
//        }

        //Getting input from user...
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = s.nextInt();
        int [] arr = new int[size];

        System.out.println("Enter the array values");
        for(int i=0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Array values are");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Reversed array values are");
        for (int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
