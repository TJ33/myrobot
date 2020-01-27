package robot.model.wx.support;

import robot.model.wx.dynamic.Member;

public class SupporterRank {
    private long id;
    private long uId;     //uid
    private long point;  //贡献值
    private int rank;    //排名
    private Level level; //等级相关
    private Member memberInfo;  //排名者信息

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getuId() {
        return uId;
    }

    public void setuId(long uId) {
        this.uId = uId;
    }

    public long getPoint() {
        return point;
    }

    public void setPoint(long point) {
        this.point = point;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Member getMemberInfo() {
        return memberInfo;
    }

    public void setMemberInfo(Member memberInfo) {
        this.memberInfo = memberInfo;
    }

    @Override
    public String toString() {
        return "SupporterRank{" +
                "id=" + id +
                ", uId=" + uId +
                ", point=" + point +
                ", rank=" + rank +
                ", level=" + level +
                ", memberInfo=" + memberInfo +
                '}';
    }
}
