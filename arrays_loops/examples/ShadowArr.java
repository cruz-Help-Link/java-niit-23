public class ShadowArr {
    int sum = 0;
    int arr[] = {12, 34, 45, 56, 71, 29};
    public void sumArray() {
        for (int i=0; i< arr.length; i++) {
            // sum+=arr[i];
            // sum = sum + arr[i];
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        ShadowArr sa = new ShadowArr();
        sa.sumArray();
    }
}
