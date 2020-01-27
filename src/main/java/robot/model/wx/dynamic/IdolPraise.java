package robot.model.wx.dynamic;

public class IdolPraise {
    private long id;
    private long ipId;
    private long objectId; //动态id
    private long objectType; //动态类型 1
    private long idolUid;    //偶像uid
    private String idolName;  //偶像名
    private String createdAt;  //创建时间

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIpId() {
        return ipId;
    }

    public void setIpId(long ipId) {
        this.ipId = ipId;
    }

    public long getObjectId() {
        return objectId;
    }

    public void setObjectId(long objectId) {
        this.objectId = objectId;
    }

    public long getObjectType() {
        return objectType;
    }

    public void setObjectType(long objectType) {
        this.objectType = objectType;
    }

    public long getIdolUid() {
        return idolUid;
    }

    public void setIdolUid(long idolUid) {
        this.idolUid = idolUid;
    }

    public String getIdolName() {
        return idolName;
    }

    public void setIdolName(String idolName) {
        this.idolName = idolName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "IdolPraise{" +
                "id=" + id +
                ", ipId=" + ipId +
                ", objectId=" + objectId +
                ", objectType=" + objectType +
                ", idolUid=" + idolUid +
                ", idolName='" + idolName + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
