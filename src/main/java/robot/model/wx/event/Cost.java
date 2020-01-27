package robot.model.wx.event;

public class Cost {

    private long id;
    private int resId; //10
    private int resNum; //50

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public int getResNum() {
        return resNum;
    }

    public void setResNum(int resNum) {
        this.resNum = resNum;
    }

    @Override
    public String toString() {
        return "Cost{" +
                "id=" + id +
                ", resId=" + resId +
                ", resNum=" + resNum +
                '}';
    }
}
