package robot.model;

public class Audio {
    private long id;
    private String url;  //音频地址
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

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", registerTime='" + registerTime + '\'' +
                '}';
    }
}
