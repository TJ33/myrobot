package robot.model.wx.post;

import robot.model.wx.dynamic.IdolPraise;
import robot.model.wx.dynamic.Member;

import java.util.List;

public class Comment {
    private long id;
    private long cId;        //评论id
    private long forumId;   //评论的视频的id
    private String content; //评论内容
    private int type;       //评论类型
    private int commentsCounts;  //评论数量
    private int praiseCounts;    //点赞数量
    private int uid;              //uid
    private int readStatus;      //2
    private int isDeleted;       //0
    private Member member;
    private String commentPerson;  //""
    private String releaseTime;  //"01-26 02:51"
    private String forumTime;    //"01-26"
    private int isPraise;        //2
    private String forum;         //"罗兹加油"
    private String idolId;        //偶像id
    private String media;         //"心动的日常：第8期" 评论媒体标题
    private List<IdolPraise> idolPraise;  //偶像点赞
    private List<Reply> reply;            //回复集合

    //分页相关
    private int page;                     //页码数
    private int pageSize;                 //每页显示多少条

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getcId() {
        return cId;
    }

    public void setcId(long cId) {
        this.cId = cId;
    }

    public long getForumId() {
        return forumId;
    }

    public void setForumId(long forumId) {
        this.forumId = forumId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(int readStatus) {
        this.readStatus = readStatus;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getCommentPerson() {
        return commentPerson;
    }

    public void setCommentPerson(String commentPerson) {
        this.commentPerson = commentPerson;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getForumTime() {
        return forumTime;
    }

    public void setForumTime(String forumTime) {
        this.forumTime = forumTime;
    }

    public int getIsPraise() {
        return isPraise;
    }

    public void setIsPraise(int isPraise) {
        this.isPraise = isPraise;
    }

    public String getForum() {
        return forum;
    }

    public void setForum(String forum) {
        this.forum = forum;
    }

    public String getIdolId() {
        return idolId;
    }

    public void setIdolId(String idolId) {
        this.idolId = idolId;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public List<IdolPraise> getIdolPraise() {
        return idolPraise;
    }

    public void setIdolPraise(List<IdolPraise> idolPraise) {
        this.idolPraise = idolPraise;
    }

    public List<Reply> getReply() {
        return reply;
    }

    public void setReply(List<Reply> reply) {
        this.reply = reply;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", cId=" + cId +
                ", forumId=" + forumId +
                ", content='" + content + '\'' +
                ", type=" + type +
                ", commentsCounts=" + commentsCounts +
                ", praiseCounts=" + praiseCounts +
                ", uid=" + uid +
                ", readStatus=" + readStatus +
                ", isDeleted=" + isDeleted +
                ", member=" + member +
                ", commentPerson='" + commentPerson + '\'' +
                ", releaseTime='" + releaseTime + '\'' +
                ", forumTime='" + forumTime + '\'' +
                ", isPraise=" + isPraise +
                ", forum='" + forum + '\'' +
                ", idolId='" + idolId + '\'' +
                ", media='" + media + '\'' +
                ", idolPraise=" + idolPraise +
                ", reply=" + reply +
                ", page=" + page +
                ", pageSize=" + pageSize +
                '}';
    }
}
