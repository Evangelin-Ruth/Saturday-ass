import java.util.HashMap;
import java.util.Set;

public class Ques9 {
    //Write a Java program to get a set view of the keys contained in this map.
    public static void main(String[] args) {
        HashMap<Integer,String> hp= new HashMap<Integer,String>();
        hp.put(1,"Deepika");
        hp.put(2,"Mithra");
        hp.put(3,"Shri");
        hp.put(4,"Aditi");
        hp.put(5,"Shamini");
        Set key=hp.keySet();
        System.out.println("Keyset values are: "+key);


    }
}