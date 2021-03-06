package robot.model.wx.post;

import robot.model.wx.classify.ClassifyChildInfo;
import robot.model.wx.classify.ClassifyInfo;

import java.util.List;

public class Media {
    private long id;
    private long mid; //
    private int type; // 媒体类型 5心动的日常
    private String coverPicture; // 放大图
    private String sharePicture; // 分享图
    private String fileId;       //"5285890797961643013"  文件id
    private String briefDesc;    // ""
    private String content;      //null
    private String title;        //媒体标题
    private String keywords;     //
    private int weight;          //0
    private int flag;            //1
    private int isBanner;       //1
    private int isIdol;         //2
    private int bannerFlag;    //1
    private int bannerChannel; //1
    private String bannerUrl;   //小程序外部展示banner图
    private int praiseCounts;  //点赞数
    private int commentsCounts; //评论数
    private List<String> idols;   //["3", "5", "1", "4", "2", "6"]
    private String status;        //媒体状态 "PUBLISHED"
    private String createdAt;     //创建时间
    private String updatedAt;     //修改时间
    private String deletedAt;     //删除时间
    private String startTime;     //开始时间
    private String endTime;       //结束时间
    private String extend;        //null
    private int score;            //0
    private String fullMsg;       //null
    private int isFavorite;      //2
    private int isPraise;        //2
    private String listTime;     //"01.22"
    private String detailTime;   //"01-22"
    private boolean relation;   //false

    private String name;    //精选外标题
    private String relationDesc;  //精选外标题关系介绍
    private int index;   //14

    private ClassifyInfo classifyInfo; //
    private ClassifyChildInfo classifyChildInfo; //
    private String classifyInfoId;
    private String classifyChildInfoId;
    private List<Media> media;    //

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMid() {
        return mid;
    }

    public void setMid(long mid) {
        this.mid = mid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCoverPicture() {
        return coverPicture;
    }

    public void setCoverPicture(String coverPicture) {
        this.coverPicture = coverPicture;
    }

    public String getSharePicture() {
        return sharePicture;
    }

    public void setSharePicture(String sharePicture) {
        this.sharePicture = sharePicture;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getBriefDesc() {
        return briefDesc;
    }

    public void setBriefDesc(String briefDesc) {
        this.briefDesc = briefDesc;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getIsBanner() {
        return isBanner;
    }

    public void setIsBanner(int isBanner) {
        this.isBanner = isBanner;
    }

    public int getIsIdol() {
        return isIdol;
    }

    public void setIsIdol(int isIdol) {
        this.isIdol = isIdol;
    }

    public int getBannerFlag() {
        return bannerFlag;
    }

    public void setBannerFlag(int bannerFlag) {
        this.bannerFlag = bannerFlag;
    }

    public int getBannerChannel() {
        return bannerChannel;
    }

    public void setBannerChannel(int bannerChannel) {
        this.bannerChannel = bannerChannel;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public int getPraiseCounts() {
        return praiseCounts;
    }

    public void setPraiseCounts(int praiseCounts) {
        this.praiseCounts = praiseCounts;
    }

    public int getCommentsCounts() {
        return commentsCounts;
    }

    public void setCommentsCounts(int commentsCounts) {
        this.commentsCounts = commentsCounts;
    }

    public List<String> getIdols() {
        return idols;
    }

    public void setIdols(List<String> idols) {
        this.idols = idols;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getFullMsg() {
        return fullMsg;
    }

    public void setFullMsg(String fullMsg) {
        this.fullMsg = fullMsg;
    }

    public int getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(int isFavorite) {
        this.isFavorite = isFavorite;
    }

    public int getIsPraise() {
        return isPraise;
    }

    public void setIsPraise(int isPraise) {
        this.isPraise = isPraise;
    }

    public String getListTime() {
        return listTime;
    }

    public void setListTime(String listTime) {
        this.listTime = listTime;
    }

    public String getDetailTime() {
        return detailTime;
    }

    public void setDetailTime(String detailTime) {
        this.detailTime = detailTime;
    }

    public boolean isRelation() {
        return relation;
    }

    public void setRelation(boolean relation) {
        this.relation = relation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelationDesc() {
        return relationDesc;
    }

    public void setRelationDesc(String relationDesc) {
        this.relationDesc = relationDesc;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ClassifyInfo getClassifyInfo() {
        return classifyInfo;
    }

    public void setClassifyInfo(ClassifyInfo classifyInfo) {
        this.classifyInfo = classifyInfo;
    }

    public ClassifyChildInfo getClassifyChildInfo() {
        return classifyChildInfo;
    }

    public void setClassifyChildInfo(ClassifyChildInfo classifyChildInfo) {
        this.classifyChildInfo = classifyChildInfo;
    }

    public String getClassifyInfoId() {
        return classifyInfoId;
    }

    public void setClassifyInfoId(String classifyInfoId) {
        this.classifyInfoId = classifyInfoId;
    }

    public String getClassifyChildInfoId() {
        return classifyChildInfoId;
    }

    public void setClassifyChildInfoId(String classifyChildInfoId) {
        this.classifyChildInfoId = classifyChildInfoId;
    }

    public List<Media> getMedia() {
        return media;
    }

    public void setMedia(List<Media> media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", mid=" + mid +
                ", type=" + type +
                ", coverPicture='" + coverPicture + '\'' +
                ", sharePicture='" + sharePicture + '\'' +
                ", fileId='" + fileId + '\'' +
                ", briefDesc='" + briefDesc + '\'' +
                ", content='" + content + '\'' +
                ", title='" + title + '\'' +
                ", keywords='" + keywords + '\'' +
                ", weight=" + weight +
                ", flag=" + flag +
                ", isBanner=" + isBanner +
                ", isIdol=" + isIdol +
                ", bannerFlag=" + bannerFlag +
                ", bannerChannel=" + bannerChannel +
                ", bannerUrl='" + bannerUrl + '\'' +
                ", praiseCounts=" + praiseCounts +
                ", commentsCounts=" + commentsCounts +
                ", idols=" + idols +
                ", status='" + status + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", deletedAt='" + deletedAt + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", extend='" + extend + '\'' +
                ", score=" + score +
                ", fullMsg='" + fullMsg + '\'' +
                ", isFavorite=" + isFavorite +
                ", isPraise=" + isPraise +
                ", listTime='" + listTime + '\'' +
                ", detailTime='" + detailTime + '\'' +
                ", relation=" + relation +
                ", name='" + name + '\'' +
                ", relationDesc='" + relationDesc + '\'' +
                ", index=" + index +
                ", classifyInfo=" + classifyInfo +
                ", classifyChildInfo=" + classifyChildInfo +
                ", classifyInfoId='" + classifyInfoId + '\'' +
                ", classifyChildInfoId='" + classifyChildInfoId + '\'' +
                ", media=" + media +
                '}';
    }
}

