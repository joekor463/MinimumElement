import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner ( System.in );

    public static void main(String[] args){
        int numberOfElements = readInteger ();
        int arr[] = readElements ( numberOfElements );

        for(int i = 0;i < arr.length; i++){
            System.out.println (arr[i]);
        }
        findMin (arr);
    }

    private static int readInteger(){
        System.out.println ("Enter number : ");
        int number = scanner.nextInt ();
        scanner.nextLine ();
        return number;
    }

    private static int[] readElements (int number){
        System.out.println ("Enter " + number + " elements ");
        int [] array = new int[number];
        for (int i = 0; i < number;i++){
            array[i] = scanner.nextInt ();
            scanner.nextLine ();
        }
        return array;
    }

    private static void findMin(int arr []){
        int minElement = arr[0];
        for (int i = 0; i < arr.length;i++){
            if (arr[i] < minElement) {
                minElement = arr[i];

            }
        }
        System.out.println (" Min Element - " + minElement);
    }

}
