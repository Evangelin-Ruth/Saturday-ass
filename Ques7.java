import java.util.PriorityQueue;

public class Ques7 {
    //Write a Java program to convert a Priority Queue elements to a string representation
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