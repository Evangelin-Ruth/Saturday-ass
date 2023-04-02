import java.util.HashSet;

//Write a Java program to compare two hash set
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