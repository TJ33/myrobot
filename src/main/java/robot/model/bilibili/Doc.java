package robot.model;

import java.util.List;

public class Doc {
    private long id;
    private String url; //相簿地址
    private List<Photo> photo;  //图片集合
    private String title;       //标题
    private String description;//描述
    private String viewCount;  //阅读量
    private String collectCount;//收藏量
    private String voteCount;   //点赞数
    private String commentCount; //评论数
    private String uploadTime;   //评论发布时间
    private String registerTime; //登记时间

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Photo> getPhoto() {
        return photo;
    }

    public void setPhoto(List<Photo> photo) {
        this.photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getViewCount() {
        return viewCount;
    }

    public void setViewCount(String viewCount) {
        this.viewCount = viewCount;
    }

    public String getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(String collectCount) {
        this.collectCount = collectCount;
    }

    public String getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(String voteCount) {
        this.voteCount = voteCount;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    @Override
    public String toString() {
        return "Doc{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", photo=" + photo +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", viewCount='" + viewCount + '\'' +
                ", collectCount='" + collectCount + '\'' +
                ", voteCount='" + voteCount + '\'' +
                ", commentCount='" + commentCount + '\'' +
                ", uploadTime='" + uploadTime + '\'' +
                ", registerTime='" + registerTime + '\'' +
                '}';
    }
}
