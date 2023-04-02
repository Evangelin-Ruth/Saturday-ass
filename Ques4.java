import java.util.HashSet;

//Write a Java program to remove all of the elements from a hash set
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