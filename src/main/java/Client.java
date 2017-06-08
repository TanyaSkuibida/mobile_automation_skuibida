import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Таня on 06.06.2017.
 */
public class Client extends BaseScreen{

    public Client() {

    }

    public String getTitle() {
        return null;
    }

    public static void main(String[] args) {

        HashSet<String> client = new HashSet<String>();

        client.add("ФОП Кузьменко");
        client.add("АТБ");
        client.add("Фоменко");
        client.add("ФОП Мостовой");

        client.size();
        System.out.println("Количество client: " + client.size());

        boolean contains = client.contains("ФОП Мостовой");
        System.out.println(contains);

        for (String each : client) {
            System.out.println(each);
            if (each.contains("Удален")) break;
        }

        Iterator<String> iterator = client.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}

