import java.util.ArrayList;

/**
 * Created by Таня on 06.06.2017.
 */
public class User extends BaseScreen{

    public static void main(String[] args) {

        int sizeLogin = 500;
        Object[] logins = new Object[sizeLogin];

        ArrayList<String> login = new ArrayList<String>();

        login.add("maschenko43");
        login.add("ilchenko23");
        login.add("34bash");

        for (int i = 0; i < login.size(); i++) {
            System.out.println(login.get(i));
        }
    }

  //  private String get(int index) {
  //      return (String) logins [index];
  //  }

    public String getTitle() {
        return null;
    }
}
