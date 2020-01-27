package robot.model.wx.idol;

public class Idols {

    private long id;
    private long iId;//偶像id
    private String nickname; //偶像昵称 短称
    private String logo;     //偶像头像
    private long popularNum; //总贡献值
    private long fansNum;    //粉丝数量
    private long attentionNum; //关注数量
    private String fullname; //全称
    private String nationalRepresent;
    private String headimg;  //头像
    private String shortDesc;  //简短介绍
    private String desc;       //介绍
    private String poster;     //官图
    private String mainPoster;       //
    private int height;        //0
    private int age;        //0
    private String like;    //""
    private String birth;   //生日  "6月6日"
    private String representFlower;   //晚香玉
    private int status;   //状态0
    private String darkSkin;    // "#A166FF"
    private String lightSkin;   // "#f0d3e4"
    private String pv;           //"23"
    private String voice;        //语音
    private String bg;           //背景图
    private String introduceBackground;   //介绍背景图
    private String introduceProspect;     //站位图
    private String assistTop;              //上方背景图
    private String bloodType;              //血型
    private String birthplace;             //出生地
    private String likes;                   //喜欢
    private String hates;                   //讨厌
    private String introduceMiddle;        //介绍图

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getiId() {
        return iId;
    }

    public void setiId(long iId) {
        this.iId = iId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public long getPopularNum() {
        return popularNum;
    }

    public void setPopularNum(long popularNum) {
        this.popularNum = popularNum;
    }

    public long getFansNum() {
        return fansNum;
    }

    public void setFansNum(long fansNum) {
        this.fansNum = fansNum;
    }

    public long getAttentionNum() {
        return attentionNum;
    }

    public void setAttentionNum(long attentionNum) {
        this.attentionNum = attentionNum;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getNationalRepresent() {
        return nationalRepresent;
    }

    public void setNationalRepresent(String nationalRepresent) {
        this.nationalRepresent = nationalRepresent;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getMainPoster() {
        return mainPoster;
    }

    public void setMainPoster(String mainPoster) {
        this.mainPoster = mainPoster;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getRepresentFlower() {
        return representFlower;
    }

    public void setRepresentFlower(String representFlower) {
        this.representFlower = representFlower;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDarkSkin() {
        return darkSkin;
    }

    public void setDarkSkin(String darkSkin) {
        this.darkSkin = darkSkin;
    }

    public String getLightSkin() {
        return lightSkin;
    }

    public void setLightSkin(String lightSkin) {
        this.lightSkin = lightSkin;
    }

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getBg() {
        return bg;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }

    public String getIntroduceBackground() {
        return introduceBackground;
    }

    public void setIntroduceBackground(String introduceBackground) {
        this.introduceBackground = introduceBackground;
    }

    public String getIntroduceProspect() {
        return introduceProspect;
    }

    public void setIntroduceProspect(String introduceProspect) {
        this.introduceProspect = introduceProspect;
    }

    public String getAssistTop() {
        return assistTop;
    }

    public void setAssistTop(String assistTop) {
        this.assistTop = assistTop;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getHates() {
        return hates;
    }

    public void setHates(String hates) {
        this.hates = hates;
    }

    public String getIntroduceMiddle() {
        return introduceMiddle;
    }

    public void setIntroduceMiddle(String introduceMiddle) {
        this.introduceMiddle = introduceMiddle;
    }

    @Override
    public String toString() {
        return "Idols{" +
                "id=" + id +
                ", iId=" + iId +
                ", nickname='" + nickname + '\'' +
                ", logo='" + logo + '\'' +
                ", popularNum=" + popularNum +
                ", fansNum=" + fansNum +
                ", attentionNum=" + attentionNum +
                ", fullname='" + fullname + '\'' +
                ", nationalRepresent='" + nationalRepresent + '\'' +
                ", headimg='" + headimg + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", desc='" + desc + '\'' +
                ", poster='" + poster + '\'' +
                ", mainPoster='" + mainPoster + '\'' +
                ", height=" + height +
                ", age=" + age +
                ", like='" + like + '\'' +
                ", birth='" + birth + '\'' +
                ", representFlower='" + representFlower + '\'' +
                ", status=" + status +
                ", darkSkin='" + darkSkin + '\'' +
                ", lightSkin='" + lightSkin + '\'' +
                ", pv='" + pv + '\'' +
                ", voice='" + voice + '\'' +
                ", bg='" + bg + '\'' +
                ", introduceBackground='" + introduceBackground + '\'' +
                ", introduceProspect='" + introduceProspect + '\'' +
                ", assistTop='" + assistTop + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", birthplace='" + birthplace + '\'' +
                ", likes='" + likes + '\'' +
                ", hates='" + hates + '\'' +
                ", introduceMiddle='" + introduceMiddle + '\'' +
                '}';
    }
}
