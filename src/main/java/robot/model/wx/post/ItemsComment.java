package robot.model.wx.post;

import java.util.List;

public class ItemsComment {
    private long id;
    private List<Comment> comment; //评论详情
    private Links links;          //链接反选相关
    private Meta meta;            //分页相关

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @Override
    public String toString() {
        return "ItemsComment{" +
                "id=" + id +
                ", comment=" + comment +
                ", links=" + links +
                ", meta=" + meta +
                '}';
    }
}
