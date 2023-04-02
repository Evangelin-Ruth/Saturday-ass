import java.util.LinkedList;

//Write a Java program to check if a particular element exists in a linked list
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