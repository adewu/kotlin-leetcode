package a;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class EventDispatch implements Observer {

    private final static EventDispatch dispatch = new EventDispatch();

    private ArrayList<EventCustomer> customerList = new ArrayList<>();

    private EventDispatch(){

    }

    public static EventDispatch getDispatch() {
        return dispatch;
    }

    @Override
    public void update(Observable o, Object arg) {
        Product product = (Product)arg;
        ProductEvent event = (ProductEvent) o;
        //处理者处理，这里是中介者模式的核心，可以是很复杂的业务逻辑
        for (EventCustomer e : customerList) {
            for (EventCustomType t : e.getCustomType()) {
                if (t.getValue() == event.getEventType().getValue()){
                    e.exec(event);
                }
            }
        }
    }

    public void registerCustomer(EventCustomer customer){
        customerList.add(customer);
    }
}
