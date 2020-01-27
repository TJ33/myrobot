package robot.model.wx.event;

import java.util.List;

public class Event {

    private long id;
    private long eId; //事件id
    private int type; //
    private String coverPicture; //
    private String sharePicture; //
    private String mediaUrl; //
    private String fileId; //
    private String briefDesc; //
    private String content; //
    private String title; //
    private String keywords; //
    private int weight; //
    private int flag; //
    private int isBanner; //
    private int isIdol; //
    private int bannerFlag; //
    private int bannerChannel; //
    private String bannerUrl; //
    private int praiseCounts; //
    private int commentsCounts; //
    private List<String> idols; //["3", "5", "1", "4", "2", "6"]
    private String status;      //PUBLISHED
    private String createdAt; //
    private String updatedAt; //
    private String deletedAt; //
    private String startTime; //
    private String endTime; //
    private List<Extend>extend;

    private int score;
    private String fullMsg;
    private int isFavorite;
    private int isPraise;
    private String listTime;
    private String detailTime;

    private String message;       //SUCCESS
    private int messageStatus;  //200

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long geteId() {
        return eId;
    }

    public void seteId(long eId) {
        this.eId = eId;
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

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
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

    public List<Extend> getExtend() {
        return extend;
    }

    public void setExtend(List<Extend> extend) {
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(int messageStatus) {
        this.messageStatus = messageStatus;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", eId=" + eId +
                ", type=" + type +
                ", coverPicture='" + coverPicture + '\'' +
                ", sharePicture='" + sharePicture + '\'' +
                ", mediaUrl='" + mediaUrl + '\'' +
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
                ", extend=" + extend +
                ", score=" + score +
                ", fullMsg='" + fullMsg + '\'' +
                ", isFavorite=" + isFavorite +
                ", isPraise=" + isPraise +
                ", listTime='" + listTime + '\'' +
                ", detailTime='" + detailTime + '\'' +
                ", message='" + message + '\'' +
                ", messageStatus=" + messageStatus +
                '}';
    }
}
