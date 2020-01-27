package robot.model.wx.post;

import robot.model.wx.dynamic.IdolPraise;
import robot.model.wx.dynamic.Member;

import java.util.List;

public class Forum {

    private long id;
    private long fId; //帖子id
    private long userId; //用户id
    private long idolId; //偶像id
    private long pictureId; //图片id
    private String core_ids;//\
    private int type;
    private String title; //帖子标题
    private String attachment;
    private String content; //帖子内容
    private String video_url;
    private String vids;
    private int praise_counts; //点赞数
    private int comments_counts; //评论数
    private String is_pick; //"NO"
    private int tag;  //1
    private String is_original;//"NO"
    private String is_top;  //"NO"
    private int status;     //1
    private String audioUrl; //
    private int audio_duration;//0
    private String created_at;
    private String updated_at;
    private String comment_at;
    private int top_level;
    private int is_praise;
    private Member member;
    private String contribute; //null
    private String created_time; //"2020-01-17 10:41"
    private int is_favorite; //1
    private List<IdolPraise> idolPraise;
    private List<String> thumb;    //缩略图集合
    private List<String> images;   //原图集合

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getfId() {
        return fId;
    }

    public void setfId(long fId) {
        this.fId = fId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getIdolId() {
        return idolId;
    }

    public void setIdolId(long idolId) {
        this.idolId = idolId;
    }

    public long getPictureId() {
        return pictureId;
    }

    public void setPictureId(long pictureId) {
        this.pictureId = pictureId;
    }

    public String getCore_ids() {
        return core_ids;
    }

    public void setCore_ids(String core_ids) {
        this.core_ids = core_ids;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public String getVids() {
        return vids;
    }

    public void setVids(String vids) {
        this.vids = vids;
    }

    public int getPraise_counts() {
        return praise_counts;
    }

    public void setPraise_counts(int praise_counts) {
        this.praise_counts = praise_counts;
    }

    public int getComments_counts() {
        return comments_counts;
    }

    public void setComments_counts(int comments_counts) {
        this.comments_counts = comments_counts;
    }

    public String getIs_pick() {
        return is_pick;
    }

    public void setIs_pick(String is_pick) {
        this.is_pick = is_pick;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public String getIs_original() {
        return is_original;
    }

    public void setIs_original(String is_original) {
        this.is_original = is_original;
    }

    public String getIs_top() {
        return is_top;
    }

    public void setIs_top(String is_top) {
        this.is_top = is_top;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public int getAudio_duration() {
        return audio_duration;
    }

    public void setAudio_duration(int audio_duration) {
        this.audio_duration = audio_duration;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getComment_at() {
        return comment_at;
    }

    public void setComment_at(String comment_at) {
        this.comment_at = comment_at;
    }

    public int getTop_level() {
        return top_level;
    }

    public void setTop_level(int top_level) {
        this.top_level = top_level;
    }

    public int getIs_praise() {
        return is_praise;
    }

    public void setIs_praise(int is_praise) {
        this.is_praise = is_praise;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getContribute() {
        return contribute;
    }

    public void setContribute(String contribute) {
        this.contribute = contribute;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public int getIs_favorite() {
        return is_favorite;
    }

    public void setIs_favorite(int is_favorite) {
        this.is_favorite = is_favorite;
    }

    public List<IdolPraise> getIdolPraise() {
        return idolPraise;
    }

    public void setIdolPraise(List<IdolPraise> idolPraise) {
        this.idolPraise = idolPraise;
    }

    public List<String> getThumb() {
        return thumb;
    }

    public void setThumb(List<String> thumb) {
        this.thumb = thumb;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Forum{" +
                "id=" + id +
                ", fId=" + fId +
                ", userId=" + userId +
                ", idolId=" + idolId +
                ", pictureId=" + pictureId +
                ", core_ids='" + core_ids + '\'' +
                ", type=" + type +
                ", title='" + title + '\'' +
                ", attachment='" + attachment + '\'' +
                ", content='" + content + '\'' +
                ", video_url='" + video_url + '\'' +
                ", vids='" + vids + '\'' +
                ", praise_counts=" + praise_counts +
                ", comments_counts=" + comments_counts +
                ", is_pick='" + is_pick + '\'' +
                ", tag=" + tag +
                ", is_original='" + is_original + '\'' +
                ", is_top='" + is_top + '\'' +
                ", status=" + status +
                ", audioUrl='" + audioUrl + '\'' +
                ", audio_duration=" + audio_duration +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", comment_at='" + comment_at + '\'' +
                ", top_level=" + top_level +
                ", is_praise=" + is_praise +
                ", member=" + member +
                ", contribute='" + contribute + '\'' +
                ", created_time='" + created_time + '\'' +
                ", is_favorite=" + is_favorite +
                ", idolPraise=" + idolPraise +
                ", thumb=" + thumb +
                ", images=" + images +
                '}';
    }
}
