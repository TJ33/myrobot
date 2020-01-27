package robot.model.wx.dynamic;

import java.util.List;

public class DynamicItemsData {

    private long id;
    private long dId; //动态id
    private String title; //动态标题
    private String content; //动态内容
    private String isPick;  //"NO"
    private String isOriginal; //"NO"
    private String vids;        //""
    private String createdTime;  //2020-01-17 10:41 发布时间
    private int commentsCounts;  //评论数量
    private int praiseCounts;    //点赞数量
    private boolean isPraise;    //
    private boolean isFavorite;  //
    private ForumPicture forumPicture;  //原图和缩略图
    private Contribute contribute;       //不晓得是啥
    private Member member;               //发布人
    private List<IdolPraise> idolPraise;  //偶像点赞相关
    private String audioUrl;              //
    private int audioDuration;           //0
    private int topLevel;                 //0

    private String message;                //返回成功与否 "SUCCESS"
    private int status;                    //返回状态码 200

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getdId() {
        return dId;
    }

    public void setdId(long dId) {
        this.dId = dId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIsPick() {
        return isPick;
    }

    public void setIsPick(String isPick) {
        this.isPick = isPick;
    }

    public String getIsOriginal() {
        return isOriginal;
    }

    public void setIsOriginal(String isOriginal) {
        this.isOriginal = isOriginal;
    }

    public String getVids() {
        return vids;
    }

    public void setVids(String vids) {
        this.vids = vids;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public int getCommentsCounts() {
        return commentsCounts;
    }

    public void setCommentsCounts(int commentsCounts) {
        this.commentsCounts = commentsCounts;
    }

    public int getPraiseCounts() {
        return praiseCounts;
    }

    public void setPraiseCounts(int praiseCounts) {
        this.praiseCounts = praiseCounts;
    }

    public boolean isPraise() {
        return isPraise;
    }

    public void setPraise(boolean praise) {
        isPraise = praise;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public ForumPicture getForumPicture() {
        return forumPicture;
    }

    public void setForumPicture(ForumPicture forumPicture) {
        this.forumPicture = forumPicture;
    }

    public Contribute getContribute() {
        return contribute;
    }

    public void setContribute(Contribute contribute) {
        this.contribute = contribute;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public List<IdolPraise> getIdolPraise() {
        return idolPraise;
    }

    public void setIdolPraise(List<IdolPraise> idolPraise) {
        this.idolPraise = idolPraise;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public int getAudioDuration() {
        return audioDuration;
    }

    public void setAudioDuration(int audioDuration) {
        this.audioDuration = audioDuration;
    }

    public int getTopLevel() {
        return topLevel;
    }

    public void setTopLevel(int topLevel) {
        this.topLevel = topLevel;
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
        return "DynamicItemsData{" +
                "id=" + id +
                ", dId=" + dId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", isPick='" + isPick + '\'' +
                ", isOriginal='" + isOriginal + '\'' +
                ", vids='" + vids + '\'' +
                ", createdTime='" + createdTime + '\'' +
                ", commentsCounts=" + commentsCounts +
                ", praiseCounts=" + praiseCounts +
                ", isPraise=" + isPraise +
                ", isFavorite=" + isFavorite +
                ", forumPicture=" + forumPicture +
                ", contribute=" + contribute +
                ", member=" + member +
                ", idolPraise=" + idolPraise +
                ", audioUrl='" + audioUrl + '\'' +
                ", audioDuration=" + audioDuration +
                ", topLevel=" + topLevel +
                ", message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}
