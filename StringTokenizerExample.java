import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String str = "Java, Python, C++, Javascript";
        StringTokenizer st = new StringTokenizer(str, ",");
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
