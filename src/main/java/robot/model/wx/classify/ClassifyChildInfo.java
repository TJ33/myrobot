package robot.model.wx.classify;

import robot.model.wx.post.Media;

import java.util.List;

public class ClassifyChildInfo {
    private long id;
    private long cciId;
    private String title; //"精选视频"
    private String coverImg;  //视频封面
    private String desc;      //简介
    private String shortDesc;  //简短介绍
    private String mediaUpdateTime; //更新时间 例如:不定期更新
    private String mediaType;          //视频类型 5
    private String createTime;        //创建时间
    private String updateTime;        //修改时间
    private String show;                //"1"
    private String isEnd;               //"0"
    private String pid;                 //"5"
    private String index;               //"1"

    private List<Media> media;

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

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getMediaUpdateTime() {
        return mediaUpdateTime;
    }

    public void setMediaUpdateTime(String mediaUpdateTime) {
        this.mediaUpdateTime = mediaUpdateTime;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public String getIsEnd() {
        return isEnd;
    }

    public void setIsEnd(String isEnd) {
        this.isEnd = isEnd;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public List<Media> getMedia() {
        return media;
    }

    public void setMedia(List<Media> media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "ClassifyChildInfo{" +
                "id=" + id +
                ", cciId=" + cciId +
                ", title='" + title + '\'' +
                ", coverImg='" + coverImg + '\'' +
                ", desc='" + desc + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", mediaUpdateTime='" + mediaUpdateTime + '\'' +
                ", mediaType='" + mediaType + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", show='" + show + '\'' +
                ", isEnd='" + isEnd + '\'' +
                ", pid='" + pid + '\'' +
                ", index='" + index + '\'' +
                ", media=" + media +
                '}';
    }
}
