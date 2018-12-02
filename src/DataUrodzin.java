import java.util.StringTokenizer;

public class DataUrodzin {
    public static void main(String[] args) {
        String dataur = "22/09/1986";
        StringTokenizer st;
        st = new StringTokenizer(dataur, "/");

        System.out.println("Dzień : " + st.nextToken() );
        System.out.println("Miesiąc : " + st.nextToken() );
        System.out.println("Rok : " + st.nextToken() );
    }
}
