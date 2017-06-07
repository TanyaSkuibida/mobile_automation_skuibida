/**
 * Created by Таня on 05.06.2017.
 */
public abstract class BaseScreen{

    private String title = "New Progect";
    private String name;
    private double sumOrder;
    private double credit;
    public static final String application = "SALES";

    public BaseScreen(){

    }

    public void attention(String title){

    }
    public void attention(double credit) {
        System.out.println(100000);
    }

    abstract public String getTitle();

    public String getName() {
        return name;
    }

    public double getSumOrder() {
        return sumOrder;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setName(String Name) {
        this.name = "Marchenko";
    }

    public void setSumOrder(double sumOrder) {
        this.sumOrder = sumOrder;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void goBack(){
        if (credit > sumOrder){
            System.out.println("Error");
        }
        else{
            System.out.println("Make the order");
        }
    }

}

/*

В каждом из классов создать по одному приватному и публичному методу,
которые работают с коллекциями.

Итераторы и forEach также должны быть использованы.
В  проекте должны быть использованы и Overload.



*/
