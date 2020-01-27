package robot.model.wx.dynamic;

public class Member {
    private long id;
    private long uid;   //uid
    private int sex;    //1男 2女
    private String nickName; //昵称
    private String birth;    //"0000-00-00"
    private String headimg;  //头像
    private int headFrame;   //0
    private String signature; //
    private int officialVerify;  //1

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    public int getHeadFrame() {
        return headFrame;
    }

    public void setHeadFrame(int headFrame) {
        this.headFrame = headFrame;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public int getOfficialVerify() {
        return officialVerify;
    }

    public void setOfficialVerify(int officialVerify) {
        this.officialVerify = officialVerify;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", uid=" + uid +
                ", sex=" + sex +
                ", nickName='" + nickName + '\'' +
                ", birth='" + birth + '\'' +
                ", headimg='" + headimg + '\'' +
                ", headFrame=" + headFrame +
                ", signature='" + signature + '\'' +
                ", officialVerify=" + officialVerify +
                '}';
    }
}
