package lab07_Testing;
import java.util.ArrayList;
import java.util.List;

public class TestList1 {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        System.out.println(list);
        list.add(4);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(list.contains(4));
        System.out.println(list.indexOf(4));
        System.out.println(list.lastIndexOf(4));
        System.out.println(list.size());
        System.out.println(list.get(2));
        // System.out.println(list.get(4));
        list.set(2, 7);
        System.out.println(list);

        for(int i=0; i<list.size(); i++){
            System.out.println(i);
        }

        for(int number: list){
            System.out.println(number);
        }
    }
}