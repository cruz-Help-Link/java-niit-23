import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NotList {
    public static void main(String[] args) {
        //ARRAY LIST
        List<String> name_list = new ArrayList<>();
        name_list.clear();
        name_list.add("null"); //0
        name_list.add("gull"); //1
        name_list.add("hull");
        name_list.add("wull");
        System.out.println("This is a list of: " +name_list);

        // LINKEDLIST
        List<Integer> num_list = new LinkedList<>();
        num_list.add(23);
        num_list.add(43);
        num_list.add(73);
        num_list.add(93);

        LinkedList<Integer> num1_list = new LinkedList<>();
        num1_list.add(2, 300);
        num1_list.add(67);
        num1_list.add(37);
        num1_list.add(57);
        num1_list.add(97);
        num1_list.addFirst(100);
        num1_list.addLast(200);
        System.out.println(num1_list);
        num1_list.removeFirst();
        System.out.println(num1_list);
    }
}
