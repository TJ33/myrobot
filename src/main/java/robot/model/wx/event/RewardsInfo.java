package robot.model.wx.event;

public class RewardsInfo {
    private long id;
    private String rewardId;
    private String name;  //卡缇娅春节活动sr照片
    private String desc;  //卡缇娅：假期游戏计划定好，我要一天玩25小时游戏！
    private String expire;
    private String icon;
    private String type;
    private String show;
    private String img;
    private String msg;
    private String img2;
    private String ext;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRewardId() {
        return rewardId;
    }

    public void setRewardId(String rewardId) {
        this.rewardId = rewardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getExpire() {
        return expire;
    }

    public void setExpire(String expire) {
        this.expire = expire;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    @Override
    public String toString() {
        return "RewardsInfo{" +
                "id=" + id +
                ", rewardId='" + rewardId + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", expire='" + expire + '\'' +
                ", icon='" + icon + '\'' +
                ", type='" + type + '\'' +
                ", show='" + show + '\'' +
                ", img='" + img + '\'' +
                ", msg='" + msg + '\'' +
                ", img2='" + img2 + '\'' +
                ", ext='" + ext + '\'' +
                '}';
    }
}
