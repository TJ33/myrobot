package robot.model.wx.event;

public class NormalPackage {
    private long id;
    private String pkgType;
    private int buff;
    private int point;
    private int trackType;

    //limitPackage专有
    private int limitDay;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPkgType() {
        return pkgType;
    }

    public void setPkgType(String pkgType) {
        this.pkgType = pkgType;
    }

    public int getBuff() {
        return buff;
    }

    public void setBuff(int buff) {
        this.buff = buff;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getTrackType() {
        return trackType;
    }

    public void setTrackType(int trackType) {
        this.trackType = trackType;
    }

    public int getLimitDay() {
        return limitDay;
    }

    public void setLimitDay(int limitDay) {
        this.limitDay = limitDay;
    }

    @Override
    public String toString() {
        return "NormalPackage{" +
                "id=" + id +
                ", pkgType='" + pkgType + '\'' +
                ", buff=" + buff +
                ", point=" + point +
                ", trackType=" + trackType +
                ", limitDay=" + limitDay +
                '}';
    }
}
