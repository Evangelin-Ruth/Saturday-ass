## Q1. Write a Java program to join two array lists
```
import java.util.ArrayList;
public class Ques1 {

    public static void main(String[] args) {
        ArrayList<String> st=new ArrayList<>();
        st.add("James");
        st.add("Tevin");
        st.add("Merwyn");
        System.out.println("List 1: "+st);
        ArrayList<String> st1=new ArrayList<>();
        st1.add("Tharun");
        //st1.add("Jameson");
        //st1.add("Nash");
        System.out.println("List 2: "+st1);
        st.addAll(st1);
        System.out.println("Joined List: "+st);
    }
}
```


## Write a Java program to retrieve but does not remove, the first element of a linked list.
```
import java.util.*;
public class Ques2 {
    public static void main(String[] args) {
        LinkedList<String> st=new LinkedList<>();
        st.add("Dani");
        st.add("David");
        st.add("Tharun");
        st.add("Tevin");
        st.add("Merwyn");
        System.out.println("List 1: "+st);
        String s=st.peek();
        System.out.println(s);

    }

}
```


## Write a Java program to check if a particular element exists in a linked list
```
import java.util.LinkedList;
public class Ques3 {
    public static void main(String[] args) {
        LinkedList<String> st=new LinkedList<>();
        st.add("Suren");
        st.add("Aldrin");
        st.add("Victor");
        st.add("Harry");
        st.add("David");
        st.add("Alwin");
        st.add("Alex");
        System.out.println("List: "+st);
        if(st.contains("David")){
            System.out.println("David is in the list");
        }
        else {
            System.out.println("Jameson is not in the list");
        }

    }
}
```

## Write a Java program to remove all of the elements from a hash set
```
import java.util.HashSet;
public class Ques4 {
    public static void main(String[] args) {
        HashSet<String> st=new HashSet<>();
        st.add("Annie");
        st.add("Emilia");
        st.add("Teena");
        st.add("Danisha");
        st.add("Adline");
        st.add("Eva");
        st.add("Sarah");
        System.out.println("Set: "+st);
        st.clear();
        System.out.println("Set: "+st);
    }
}
```

## Write a Java program to compare two hash set
```
import java.util.HashSet;
public class Ques5 {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("Sheela");
        st.add("Kevin");
        st.add("Michael");
        st.add("Nash");
        st.add("Sherly");
        HashSet<String> lt = new HashSet<>();
        lt.add("Sheela");
        lt.add("Kevin");
        lt.add("Michael");
        lt.add("Sherly");
        for (String element : st) {
            System.out.println(lt.contains(element) ? "Yes" : "No");
        }
    }
}
```
## Write a Java program to retrieve and remove the last element of a tree set.
```
import java.util.TreeSet;
public class Ques6 {
    public static void main(String[] args) {
        TreeSet<Integer> tr=new TreeSet<Integer>();
        tr.add(65);
        tr.add(80);
        tr.add(21);
        tr.add(35);
        tr.add(92);
        tr.add(87);
        System.out.println("The Tree Set: "+tr);
        System.out.println("The last element: "+tr.pollLast());
        System.out.println("Tree set after removing the last element: "+tr);
    }
}
```
## Write a Java program to convert a Priority Queue elements to a string representation
```
import java.util.PriorityQueue;
public class Ques7 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("Joel");
        pq.add("Oliviya");
        pq.add("Pinky");
        pq.add("Andy");
        pq.add("Zayn");
        System.out.println("Priority Queue: "+pq);
        String st1 = pq.toString();
        System.out.println("String Representation: "+st1);

    }
}
```
## Write a Java program to get a collection view of the values contained in this map.
```
import java.util.HashMap;
public class Ques8 {
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
```
## Write a Java program to get a set view of the keys contained in this map.
```
import java.util.HashMap;
import java.util.Set;

public class Ques9 {
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
```
## Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.
```
import java.util.TreeMap;
public class Ques10 {
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
```
## Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
import java.util.TreeMap;

public class Ques11 {
   
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
```
