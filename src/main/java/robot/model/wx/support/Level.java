package robot.model.wx.support;

import robot.model.wx.idol.Idols;

public class Level {

    private long id;
    private long lId; //等级序列
    private long userId; //uId
    private long point;  //贡献值
    private int idol_id; //偶像id
    private String created_at;
    private String updated_at;
    private int status;
    private long user_point; //贡献值
    private int level;       //贡献等级
    private Idols idols;     //应援偶像

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getlId() {
        return lId;
    }

    public void setlId(long lId) {
        this.lId = lId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getPoint() {
        return point;
    }

    public void setPoint(long point) {
        this.point = point;
    }

    public int getIdol_id() {
        return idol_id;
    }

    public void setIdol_id(int idol_id) {
        this.idol_id = idol_id;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getUser_point() {
        return user_point;
    }

    public void setUser_point(long user_point) {
        this.user_point = user_point;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Idols getIdols() {
        return idols;
    }

    public void setIdols(Idols idols) {
        this.idols = idols;
    }

    @Override
    public String toString() {
        return "Level{" +
                "id=" + id +
                ", lId=" + lId +
                ", userId=" + userId +
                ", point=" + point +
                ", idol_id=" + idol_id +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", status=" + status +
                ", user_point=" + user_point +
                ", level=" + level +
                ", idols=" + idols +
                '}';
    }
}
