package robot.model.wx.post;

import robot.model.wx.WXUser;

public class Reply {
    private long id;
    private long rId; //回复id
    private long commentId; //回复评论的id
    private int toUid;      //回复谁的id
    private int fromUid;    //回复者的id
    private String content;    //回复内容
    private int replyType;    //1
    private long createdAt;   //创建时间
    private WXUser fromUser;  //回复者
    private WXUser toUser;   //回复谁
    private Comment comment;
    private int isPraise;  //是否点赞
    private String praiseCounts;  //null

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getrId() {
        return rId;
    }

    public void setrId(long rId) {
        this.rId = rId;
    }

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    public int getToUid() {
        return toUid;
    }

    public void setToUid(int toUid) {
        this.toUid = toUid;
    }

    public int getFromUid() {
        return fromUid;
    }

    public void setFromUid(int fromUid) {
        this.fromUid = fromUid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getReplyType() {
        return replyType;
    }

    public void setReplyType(int replyType) {
        this.replyType = replyType;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public WXUser getFromUser() {
        return fromUser;
    }

    public void setFromUser(WXUser fromUser) {
        this.fromUser = fromUser;
    }

    public WXUser getToUser() {
        return toUser;
    }

    public void setToUser(WXUser toUser) {
        this.toUser = toUser;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public int getIsPraise() {
        return isPraise;
    }

    public void setIsPraise(int isPraise) {
        this.isPraise = isPraise;
    }

    public String getPraiseCounts() {
        return praiseCounts;
    }

    public void setPraiseCounts(String praiseCounts) {
        this.praiseCounts = praiseCounts;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "id=" + id +
                ", rId=" + rId +
                ", commentId=" + commentId +
                ", toUid=" + toUid +
                ", fromUid=" + fromUid +
                ", content='" + content + '\'' +
                ", replyType=" + replyType +
                ", createdAt=" + createdAt +
                ", fromUser=" + fromUser +
                ", toUser=" + toUser +
                ", comment=" + comment +
                ", isPraise=" + isPraise +
                ", praiseCounts='" + praiseCounts + '\'' +
                '}';
    }
}
