package robot.model.wx.event;
import robot.model.wx.idol.Idols;

import java.util.List;

public class Extend {

    private long id;
    private String bg;
    private String stepSecond;
    private String stepFirst;
    private String moneyIcon;
    private String yuanBao;
    private String welfareActivedPath;
    private String pageTitleImg;
    private long totalNum;
    private long personNum;
    private List<String> rule;
    private List<UserReward>userReward;
    private List<Idols>idols;
    private List<NormalPackage>normalPackage;
    private List<NormalPackage>limitPackage;

    private String shareTitle;  //
    private int advanceProductId;//45
    private Assets assets;
    private List<String> rewardRules; //活动规则
    private List<Tasks> tasks;  //任务
    private List<Rewards> rewards;  //奖励

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBg() {
        return bg;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }

    public String getStepSecond() {
        return stepSecond;
    }

    public void setStepSecond(String stepSecond) {
        this.stepSecond = stepSecond;
    }

    public String getStepFirst() {
        return stepFirst;
    }

    public void setStepFirst(String stepFirst) {
        this.stepFirst = stepFirst;
    }

    public String getMoneyIcon() {
        return moneyIcon;
    }

    public void setMoneyIcon(String moneyIcon) {
        this.moneyIcon = moneyIcon;
    }

    public String getYuanBao() {
        return yuanBao;
    }

    public void setYuanBao(String yuanBao) {
        this.yuanBao = yuanBao;
    }

    public String getWelfareActivedPath() {
        return welfareActivedPath;
    }

    public void setWelfareActivedPath(String welfareActivedPath) {
        this.welfareActivedPath = welfareActivedPath;
    }

    public String getPageTitleImg() {
        return pageTitleImg;
    }

    public void setPageTitleImg(String pageTitleImg) {
        this.pageTitleImg = pageTitleImg;
    }

    public long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(long totalNum) {
        this.totalNum = totalNum;
    }

    public long getPersonNum() {
        return personNum;
    }

    public void setPersonNum(long personNum) {
        this.personNum = personNum;
    }

    public List<String> getRule() {
        return rule;
    }

    public void setRule(List<String> rule) {
        this.rule = rule;
    }

    public List<UserReward> getUserReward() {
        return userReward;
    }

    public void setUserReward(List<UserReward> userReward) {
        this.userReward = userReward;
    }

    public List<Idols> getIdols() {
        return idols;
    }

    public void setIdols(List<Idols> idols) {
        this.idols = idols;
    }

    public List<NormalPackage> getNormalPackage() {
        return normalPackage;
    }

    public void setNormalPackage(List<NormalPackage> normalPackage) {
        this.normalPackage = normalPackage;
    }

    public List<NormalPackage> getLimitPackage() {
        return limitPackage;
    }

    public void setLimitPackage(List<NormalPackage> limitPackage) {
        this.limitPackage = limitPackage;
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }

    public int getAdvanceProductId() {
        return advanceProductId;
    }

    public void setAdvanceProductId(int advanceProductId) {
        this.advanceProductId = advanceProductId;
    }

    public Assets getAssets() {
        return assets;
    }

    public void setAssets(Assets assets) {
        this.assets = assets;
    }

    public List<String> getRewardRules() {
        return rewardRules;
    }

    public void setRewardRules(List<String> rewardRules) {
        this.rewardRules = rewardRules;
    }

    public List<Tasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<Tasks> tasks) {
        this.tasks = tasks;
    }

    public List<Rewards> getRewards() {
        return rewards;
    }

    public void setRewards(List<Rewards> rewards) {
        this.rewards = rewards;
    }

    @Override
    public String toString() {
        return "Extend{" +
                "id=" + id +
                ", bg='" + bg + '\'' +
                ", stepSecond='" + stepSecond + '\'' +
                ", stepFirst='" + stepFirst + '\'' +
                ", moneyIcon='" + moneyIcon + '\'' +
                ", yuanBao='" + yuanBao + '\'' +
                ", welfareActivedPath='" + welfareActivedPath + '\'' +
                ", pageTitleImg='" + pageTitleImg + '\'' +
                ", totalNum=" + totalNum +
                ", personNum=" + personNum +
                ", rule=" + rule +
                ", userReward=" + userReward +
                ", idols=" + idols +
                ", normalPackage=" + normalPackage +
                ", limitPackage=" + limitPackage +
                ", shareTitle='" + shareTitle + '\'' +
                ", advanceProductId=" + advanceProductId +
                ", assets=" + assets +
                ", rewardRules=" + rewardRules +
                ", tasks=" + tasks +
                ", rewards=" + rewards +
                '}';
    }
}
