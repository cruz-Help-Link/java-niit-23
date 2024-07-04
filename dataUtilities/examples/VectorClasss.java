import java.util.Vector;

public class VectorClasss {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(0);
        v.add(1);
        v.add(0, 22);

        v.remove(0);
        v.add(1);
        v.add(211);
        v.add(451);
        v.size();
        v.clear();


    }
}
