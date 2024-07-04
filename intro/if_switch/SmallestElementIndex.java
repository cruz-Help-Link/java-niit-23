public class SmallestElementIndex {
    public static int smallestIndex(int[] arr) {
        if (arr.length <= 0) {
            // Return -1 for an empty array or invalid size
            return -1;
        }

        int smallest = arr[0]; // Initialize smallest as the first element
        int smallestIndex = 0; // Initialize the index of the smallest element

        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void main(String[] args) {
        int[] array = { 4, 9, 2, 5, 1, 8, 3 };

        int index = smallestIndex(array);

        if (index != -1) {
            System.out.println("The index of the smallest element is: " + index);
        } else {
            System.out.println("The array is empty.");
        }
    }
}
