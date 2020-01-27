package robot.model.wx.idol;

public class IdolRank {

    private long id;
    private int idolId; //偶像id
    private int point; //总贡献值
    private int totalPoint; //总贡献值
    private int closeCountdown; //倒计时 -333007

    private String message;  //"SUCCESS"
    private  int status;     //200

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getIdolId() {
        return idolId;
    }

    public void setIdolId(int idolId) {
        this.idolId = idolId;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }

    public int getCloseCountdown() {
        return closeCountdown;
    }

    public void setCloseCountdown(int closeCountdown) {
        this.closeCountdown = closeCountdown;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "IdolRank{" +
                "id=" + id +
                ", idolId=" + idolId +
                ", point=" + point +
                ", totalPoint=" + totalPoint +
                ", closeCountdown=" + closeCountdown +
                ", message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}
