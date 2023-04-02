import java.util.TreeMap;

public class Ques10 {
    //    Write a Java program to get a key-value mapping associated with the least key greater than or
//    equal to the given key. Return null if there is no such key.
    public static void main(String[] args) {
        TreeMap< Integer, String > np = new TreeMap < Integer, String > ();
        // Put elements to the map
        np.put(1,"Jack");
        np.put(2,"King");
        np.put(4,"Sanci");
        np.put(5,"Angelin");
        np.put(6,"Malavika");
        np.put(7,"Princy");

        System.out.println("Orginal TreeMap content: " + np);
        System.out.println("For Value = 1");
        System.out.println("Value is: " + np.floorEntry(1));
        System.out.println("For Value = 4");
        System.out.println("Value is: " + np.floorEntry(4));
        System.out.println("For Value = 7");
        System.out.println("Value is: " + np.floorEntry(7));
    }
}