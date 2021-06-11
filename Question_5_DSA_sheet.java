import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements of array");
        int n = sc.nextInt();

        int[] array = new int[10];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
           array[i] = sc.nextInt();
        }
        System.out.println("the given array is:");
        for (int i=0; i<n; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n-----------------------------Processing--------------------------------");
        int q = -1;
        int pivot = 0;
        for(int j =0;j<n;j++){
            if(array[j] < pivot){
                q++;
                int temp = array[j];
                array[j] = array[q];
                array[q] = temp;
            }
        }
        System.out.println("The resulting array is:");
        for (int i=0; i<n; i++)
        {

            System.out.print(array[i] + " ");
        }

    }
}
