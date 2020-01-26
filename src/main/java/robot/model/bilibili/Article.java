package robot.model;

public class Article {
    private long id;
    private String url;           //专栏地址
    private Integer aid;         //专栏号
    private String authorName; //发专栏的作者名
    private String bannerUrl;  //专栏封面图
    private String title;      //专栏标题
    private String view;       //阅读量
    private String favorite;  //收藏量
    private String like;      //点赞数
    private String reply;     //评论数
    private String share;     //分享数
    private String coin;      //硬币数
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

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", aid=" + aid +
                ", authorName='" + authorName + '\'' +
                ", bannerUrl='" + bannerUrl + '\'' +
                ", title='" + title + '\'' +
                ", view='" + view + '\'' +
                ", favorite='" + favorite + '\'' +
                ", like='" + like + '\'' +
                ", reply='" + reply + '\'' +
                ", share='" + share + '\'' +
                ", coin='" + coin + '\'' +
                ", registerTime='" + registerTime + '\'' +
                '}';
    }
}
