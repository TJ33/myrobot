package robot.model.wx.classify;

public class ClassifyInfo {
    private long id;
    private long cciId;
    private String title; //"精选视频"
    private String desc;      //简介
    private String isVertical;  //"0"
    private String isCrossSub;  //"1"
    private String updateTime;        //修改时间

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCciId() {
        return cciId;
    }

    public void setCciId(long cciId) {
        this.cciId = cciId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getIsVertical() {
        return isVertical;
    }

    public void setIsVertical(String isVertical) {
        this.isVertical = isVertical;
    }

    public String getIsCrossSub() {
        return isCrossSub;
    }

    public void setIsCrossSub(String isCrossSub) {
        this.isCrossSub = isCrossSub;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ClassifyInfo{" +
                "id=" + id +
                ", cciId=" + cciId +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", isVertical='" + isVertical + '\'' +
                ", isCrossSub='" + isCrossSub + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
