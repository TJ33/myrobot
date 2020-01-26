package robot.model;

public class Photo {

    private long id;
    /**
     * 类型：
     * 1.
     * 2:
     * 3:
     * 4:
     */
    private int type;
    // 关联ID
    private long srcId;
    // 图片的URL
    private String url;
    // 排序(升序)
    private int seq;
    // 图片简介(图库图片时使用)
    private String intro;
    // 创建时间
    private long createAt;

    //状态
    private int status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getSrcId() {
        return srcId;
    }

    public void setSrcId(long srcId) {
        this.srcId = srcId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(long createAt) {
        this.createAt = createAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", type=" + type +
                ", srcId=" + srcId +
                ", url='" + url + '\'' +
                ", seq=" + seq +
                ", intro='" + intro + '\'' +
                ", createAt=" + createAt +
                ", status=" + status +
                '}';
    }
}
