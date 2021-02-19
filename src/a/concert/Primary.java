package a.concert;

import a.*;

public class Primary extends EventCustomer {
    public Primary() {
        super(EventCustomType.NEW);
    }
    @Override
    public void exec(ProductEvent event) {
        //事件的源头
        Product p = event.getSource();
        //事件类型
        ProductEventType type = event.getEventType();
        System.out.println("初级专家处理事件:" + p.getName() + "诞生记,事件类型=" + type);
    }
}
