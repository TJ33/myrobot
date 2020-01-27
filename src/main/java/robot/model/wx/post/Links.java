package robot.model.wx.post;

public class Links {
    private long id;
    private Self self;  //当前
    private Self next;  //下一页
    private Self last;  //尾页

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Self getSelf() {
        return self;
    }

    public void setSelf(Self self) {
        this.self = self;
    }

    public Self getNext() {
        return next;
    }

    public void setNext(Self next) {
        this.next = next;
    }

    public Self getLast() {
        return last;
    }

    public void setLast(Self last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "Links{" +
                "id=" + id +
                ", self=" + self +
                ", next=" + next +
                ", last=" + last +
                '}';
    }
}
