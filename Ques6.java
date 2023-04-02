import java.util.TreeSet;

public class Ques6 {
    //    Write a Java program to retrieve and remove the last element of a tree set.
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
