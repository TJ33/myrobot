package robot.model;

public class Vedio {
    //视频相关
    private long id;     //唯一标识
    private String url;           //视频地址
    private Integer aid; //aid 视频AV号 例如(av84670433)
    private Integer stat; //视频分区id
    private String title; //视频标题
    private String desc;  //视频简介
    private String view;  //播放量
    private String danmaku; //弹幕数
    private String reply;   //评论数
    private String favorite; //收藏数
    private String coin;     //硬币数
    private String share;    //分享数
    private String like;     //点赞数
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

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
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

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getDanmaku() {
        return danmaku;
    }

    public void setDanmaku(String danmaku) {
        this.danmaku = danmaku;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    @Override
    public String toString() {
        return "Vedio{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", aid=" + aid +
                ", stat=" + stat +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", view='" + view + '\'' +
                ", danmaku='" + danmaku + '\'' +
                ", reply='" + reply + '\'' +
                ", favorite='" + favorite + '\'' +
                ", coin='" + coin + '\'' +
                ", share='" + share + '\'' +
                ", like='" + like + '\'' +
                ", registerTime='" + registerTime + '\'' +
                '}';
    }
}
