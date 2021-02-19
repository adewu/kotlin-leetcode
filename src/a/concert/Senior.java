package a.concert;

import a.*;

public class Senior extends EventCustomer {

    public Senior() {
        super(EventCustomType.EDIT);
        super.addCustomType(EventCustomType.CLONE);
    }

    @Override
    public void exec(ProductEvent event) {
        Product p = event.getSource();
        ProductEventType type = event.getEventType();
        if (type.getValue() == EventCustomType.CLONE.getValue()){
            System.out.println("高级专家处理事件:" + p.getName() + "克隆,事件类型=" + type);
        } else {
            System.out.println("高级专家处理事件:" + p.getName() + "修改,事件类型=" + type);
        }

    }
}
