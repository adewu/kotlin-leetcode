package a.concert;

import a.*;

public class Middle extends EventCustomer {
    public Middle() {
        super(EventCustomType.DEL);
    }
    @Override
    public void exec(ProductEvent event) {
        //事件的源头
        Product p = event.getSource();
        //事件类型
        ProductEventType type = event.getEventType();
        System.out.println("中级专家处理事件:" + p.getName() + "销毁,事件类型=" + type);
    }
}