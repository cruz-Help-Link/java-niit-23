public class ArrayException {

    public int[] arrNum = new int[10];

    public void writeList() {
        try {
            arrNum[5] = "Johnny";
            arrNum[10] = 11;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("EXACTLY???");
        }
    }
    public static void main(String[] args) {
        ArrayException ae = new ArrayException();
        ae.writeList();
    }
        
}
