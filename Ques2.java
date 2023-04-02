import java.util.*;

//Write a Java program to retrieve but does not remove, the first element of a linked list.
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