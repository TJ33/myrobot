package robot.model.wx.event;

import java.util.List;

public class Tasks {
    private long id;
    private long tId;
    private int type;
    private int idolId;
    private String title;       //卡缇娅的新春祝福
    private List<String> step; //步骤数组  ["节日餐桌上，可以看到几样冷盘，比如俄国色拉、肉冻、浇汁鱼、腌蘑菇、红鱼籽面包片等", "塔形的枞树象征着生命常青，枞树是新年的主要标志", "准备好各种礼物，安放在新年枞树下面赠送亲友"]
    private String finishText; //恭喜您完成了
    private Cost cost;
    private Cost redoCost;
    private String date;   //时间  "2020-01-17"

    private String url;
    private String urlType;
    private int status;   //1
    private int eventId; //事件id
    private String startTime; // 开始时间
    private List<String> needTask; //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long gettId() {
        return tId;
    }

    public void settId(long tId) {
        this.tId = tId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getIdolId() {
        return idolId;
    }

    public void setIdolId(int idolId) {
        this.idolId = idolId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getStep() {
        return step;
    }

    public void setStep(List<String> step) {
        this.step = step;
    }

    public String getFinishText() {
        return finishText;
    }

    public void setFinishText(String finishText) {
        this.finishText = finishText;
    }

    public Cost getCost() {
        return cost;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    public Cost getRedoCost() {
        return redoCost;
    }

    public void setRedoCost(Cost redoCost) {
        this.redoCost = redoCost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlType() {
        return urlType;
    }

    public void setUrlType(String urlType) {
        this.urlType = urlType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public List<String> getNeedTask() {
        return needTask;
    }

    public void setNeedTask(List<String> needTask) {
        this.needTask = needTask;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "id=" + id +
                ", tId=" + tId +
                ", type=" + type +
                ", idolId=" + idolId +
                ", title='" + title + '\'' +
                ", step=" + step +
                ", finishText='" + finishText + '\'' +
                ", cost=" + cost +
                ", redoCost=" + redoCost +
                ", date='" + date + '\'' +
                ", url='" + url + '\'' +
                ", urlType='" + urlType + '\'' +
                ", status=" + status +
                ", eventId=" + eventId +
                ", startTime='" + startTime + '\'' +
                ", needTask=" + needTask +
                '}';
    }
}
