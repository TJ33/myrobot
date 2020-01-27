package robot.model.wx.classify;


import robot.model.wx.post.Media;

import java.util.List;

public class Classify {
    private long id;
    private String cId;  //分区id
    private String title; //分区标题
    private String desc;  //分区简介
    private boolean isVertical;  //
    private boolean isCrossSub; //
    private String updateTime;
    //两种数组集合 其中一种
    private List<Media> media;    //精选 音乐

    private List<ClassifyChildInfo>classifyChildInfo;  //直播相关 日常 纪录片

    private String message;                             //SUCCESS
    private int status;                                 //状态码

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
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

    public boolean isVertical() {
        return isVertical;
    }

    public void setVertical(boolean vertical) {
        isVertical = vertical;
    }

    public boolean isCrossSub() {
        return isCrossSub;
    }

    public void setCrossSub(boolean crossSub) {
        isCrossSub = crossSub;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public List<Media> getMedia() {
        return media;
    }

    public void setMedia(List<Media> media) {
        this.media = media;
    }

    public List<ClassifyChildInfo> getClassifyChildInfo() {
        return classifyChildInfo;
    }

    public void setClassifyChildInfo(List<ClassifyChildInfo> classifyChildInfo) {
        this.classifyChildInfo = classifyChildInfo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Classify{" +
                "id=" + id +
                ", cId='" + cId + '\'' +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", isVertical=" + isVertical +
                ", isCrossSub=" + isCrossSub +
                ", updateTime='" + updateTime + '\'' +
                ", media=" + media +
                ", classifyChildInfo=" + classifyChildInfo +
                ", message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}
