package robot.model.wx.event;

import java.util.List;

public class UserReward {
    private long id;
    private List<String> desc;
    private String icon;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<String> getDesc() {
        return desc;
    }

    public void setDesc(List<String> desc) {
        this.desc = desc;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "UserReward{" +
                "id=" + id +
                ", desc=" + desc +
                ", icon='" + icon + '\'' +
                '}';
    }
}
