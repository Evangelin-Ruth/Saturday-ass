import java.util.TreeMap;

public class Ques11 {
    //Write a Java program to get the least key greater than or equal
    // to the given key. Returns null if there is no such key.
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
        tm.put(1,"AI and DS");
        tm.put(2,"AI and ML");
        tm.put(3,"CSE");
        tm.put(4,"ECE");
        tm.put(5,"EEE");
        tm.put(6,"Biomedical");
        tm.put(7,"Medical Electronics");
        System.out.println("Orginal TreeMap content: " + tm);
        System.out.println("Keys greater than or equal to 2: " + tm.ceilingKey(2));
        System.out.println("Keys greater than or equal to 3: " + tm.ceilingKey(3));
        System.out.println("Keys greater than or equal to 5: " + tm.ceilingKey(5));
    }
}
