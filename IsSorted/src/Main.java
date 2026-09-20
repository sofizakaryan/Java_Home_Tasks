import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
//    int size = 15;
//    int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3 ,4 , 5, 6, 7};
    System.out.println("Input: ");
    System.out.print("Size of Array: ");

    int size = scanner.nextInt();

    int[] arr = new int[size];

    System.out.print("Elements of Array: ");
    for (int i = 0; i < size; i++) {
        arr[i] = scanner.nextInt();
    }

    boolean res = isSorted(size, arr);

    System.out.println("Output: ");
    String output = res ? "Arr is sorted" : "Arr is not Sorted";
    System.out.println(output);
}

boolean isSorted(int size, int[] arr)
{
    if (arr.length >= 2) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
    }
    return true;
}
