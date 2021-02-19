package a;

public enum EventCustomType {

    //新建立事件
    NEW(1),
    //删除事件
    DEL(2),
    //修改事件
    EDIT(3),
    //克隆事件
    CLONE(4);
    private int value = 0;
    EventCustomType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
