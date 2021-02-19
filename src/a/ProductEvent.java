package a;

import java.util.Observable;

public class ProductEvent extends Observable {

    private Product source;

    private ProductEventType type;

    public ProductEvent(Product p){
        this(p,ProductEventType.NEW_PRODUCT);
    }

    public ProductEvent(Product p,ProductEventType type){
        this.source = p;
        this.type = type;
        notifyEventDispatch();
    }

    //获得事件的始作俑者
    public Product getSource() {
        return source;
    }

    //获得事件的类型
    public ProductEventType getEventType() {
        return this.type;
    }

    private void notifyEventDispatch() {
        super.addObserver(EventDispatch.getDispatch());
        super.setChanged();
        super.notifyObservers(source);
    }
}
