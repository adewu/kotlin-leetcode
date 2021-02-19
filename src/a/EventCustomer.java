package a;

import java.util.ArrayList;

public abstract class EventCustomer {
    private ArrayList<EventCustomType> customType = new ArrayList<>();

    public EventCustomer(EventCustomType type){
        addCustomType(type);
    }

    //每个消费者可以消费多个事件
    public void addCustomType(EventCustomType type) {
        customType.add(type);
    }

    //得到自己的处理能力
    public ArrayList<EventCustomType> getCustomType() {
        return customType;
    }

    //每个事件都要对事件进行声明式消费
    public abstract void exec(ProductEvent event);
}
