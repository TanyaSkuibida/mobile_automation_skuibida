/**
 * Created by Таня on 05.06.2017.
 */
public abstract class BaseScreen {

    public String title = "New Progect";
    public int page;
    public static final String application = "effie";
    public String username;

    public BaseScreen(){

    }

    public abstract String getTitle();

    public Integer goBack(){
        return 1;
    }

    public void setUsername(String username) {
        this.username = "Skuibida";
    }
}


/*


4. Создать 3 класса наследника, каждый из которых наследуется от BaseScreen.

В каждом из классов создать по одному приватному и публичному методу,
которые работают с коллекциями.

5. ArrayList, HashSet и HashMap должны быть использованы в
классах-наследниках на ваше усмотрение.

6. Итераторы и forEach также должны быть использованы.

7. Также в вашем проекте должны быть использованы и Overload. Перегрузка (overload)


*/
