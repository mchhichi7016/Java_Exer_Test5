import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("suzuki");
        list.add("satou");
        list.add("suzuki");

        //System.out.println(list.size());

        list.set(2,"tanakasann");

        System.out.println(list.get(2));

        list.remove(0);

        System.out.println(list.get(0));

        list.remove("suzuki");
        System.out.println(list.get(0));
    }
}
