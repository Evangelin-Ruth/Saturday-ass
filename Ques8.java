import java.util.HashMap;

public class Ques8 {
    //Write a Java program to get a collection view of the values contained in this map.
    public static void main(String[] args) {
        HashMap<Integer,String> hp= new HashMap<Integer,String>();
        hp.put(1,"Shavs");
        hp.put(2,"Rithi");
        hp.put(3,"Keerthi");
        hp.put(4,"Eva");
        hp.put(5,"Archana");
        System.out.println("View: "+hp.values());

    }
}