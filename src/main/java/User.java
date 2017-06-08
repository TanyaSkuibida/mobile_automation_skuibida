import java.util.ArrayList;
import java.util.List;

/**
 * Created by Таня on 06.06.2017.
 */
public class User extends BaseScreen{

    public static void main(String[] args) {

        List<String> login = new ArrayList<String>();

        login.add("maschenko43");//true
        login.add("ilchenko23");//false
        login.add("tarin23");
        login.add("Qaz123");

        login.get(1);

        System.out.println("Первый элемент массива: " + login.get(0));

        login.set(2, "novikov67");

        boolean isAdd = login.add("34bash");
        System.out.println(isAdd);

        for (int i = 0; i < login.size(); i++) {
            System.out.println(login.get(i));
        }

    }

    public String getTitle() {
        return null;
    }

}
