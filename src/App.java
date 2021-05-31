import a.LargeCoffee;
import a.Milk;
import a.RefinedCoffee;
import easy.*;

public class App {

    public static void main(String[] args) {
        RefinedCoffee largeWithMilk = new LargeCoffee(new Milk());
        largeWithMilk.orderCoffee(2);
        largeWithMilk.checkQuality();
    }
}
