package robot.model.wx.post;

public class Self {
    private long id;
    private String href; //反选连接

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "Self{" +
                "id=" + id +
                ", href='" + href + '\'' +
                '}';
    }
}
