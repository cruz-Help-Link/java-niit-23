public class ArrayPermutation {

    // The input array for permutation
    private final int Arr[];

    // Index array to store indexes (from 0) of input array
    private int Indexes[];

    // The index of the first "increase" in the Index array which is the smallest
    // i such that Indexes[i] < Indexes[i + 1]
    private int Increase;

    // Constructor
    public ArrayPermutation(int arr[]) {
        this.Arr = arr;
        this.Increase = -1;
        this.Indexes = new int[this.Arr.length];
    }

    private void display() {
        for (int i = 0; i < this.Indexes.length; ++i) {

            // Indexes of the input array
            // are at the Indexes array
            System.out.print(this.Arr[this.Indexes[i]]);
            System.out.print(" ");
        }
        System.out.println();
    }

    // swap two values in the Indexes array
    private void swap(int p, int q) {
        int tmp = Indexes[p];
        Indexes[p] = Indexes[q];
        Indexes[q] = tmp;
    }

    // First Perm..
    public void GetFirst() {
        // Allocate memory for Indexes array
        this.Indexes = new int[this.Arr.length];

        // Initialize the values in Index array
        // from 0 to arr size - 1
        for (int i = 0; i < Indexes.length; ++i) {
            this.Indexes[i] = i;
        }

        // Set the Increase to 0
        // since Indexes[0] = 0 < Indexes[1] = 1
        this.Increase = 0;

        // display the first permutation
        display();
    }

    // Method checks if the next permutation is possible..
    public boolean HasNext() {

        // When Increase is in the end of the array,
        // it is not possible to have next one
        return this.Increase != (this.Indexes.length - 1);
    }

    // display the next permutation.
    public void GetNext() {

        // Increase is at the very beginning 0
        if (this.Increase == 0) {

            // swap Index[0] and Index[1]
            this.swap(this.Increase, this.Increase + 1);

            // Update Increase
            this.Increase += 1;
            while (this.Increase < this.Indexes.length - 1 && this.Indexes[this.Increase] > this.Indexes[this.Increase + 1]) {
                ++this.Increase;
            }
        } else {

            // Value at Indexes[Increase + 1] is greater than Indexes[0]
            // no need for binary search,
            // just swap Indexes[Increase + 1] and Indexes[0]
            if (this.Indexes[this.Increase + 1] > this.Indexes[0]) {
                this.swap(this.Increase + 1, 0);
            } else {

                // Binary search to find the greatest value
                // which is less than Indexes[Increase + 1]
                int start = 0;
                int end = this.Increase;
                int mid = (start + end) / 2;
                int tVal = this.Indexes[this.Increase + 1];
                while (!(this.Indexes[mid] < tVal && this.Indexes[mid - 1] > tVal)) {
                    if (this.Indexes[mid] < tVal) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                    mid = (start + end) / 2;
                }

                // swap
                this.swap(this.Increase + 1, mid);
            }

            // Invert 0 to Increase
            for (int i = 0; i <= this.Increase / 2; ++i) {
                this.swap(i, this.Increase - i);
            }

            // Reset Increase..
            this.Increase = 0;
        }
        this.display();
    }


}

class MainClacc {
    public static void main(String args[]) {
        int[] arr = { 54, 34, 12, 19, 21 };

        ArrayPermutation perm = new ArrayPermutation(arr);
        perm.GetFirst();
        while (perm.HasNext()) {
            perm.GetNext();
        }
    }
}
