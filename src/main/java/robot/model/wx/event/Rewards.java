package robot.model.wx.event;

import java.util.List;

public class Rewards {
    private long id;

    private long taskId;  //任务id
    private int taskStatus; //任务状态
    private Tasks tasks;    //任务集合


    private List<Cost> cost;
    private int normalRewardStatus; //2
    private int advanceRewardStatus; //2
    private List<RewardsInfo>normalRewards;
    private List<RewardsInfo>advanceRewards;
    private List<Cost> items;
    private List<Cost> advancedItems;

    private String message;       //SUCCESS
    private int messageStatus;  //200

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public int getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(int taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Tasks getTasks() {
        return tasks;
    }

    public void setTasks(Tasks tasks) {
        this.tasks = tasks;
    }

    public List<Cost> getCost() {
        return cost;
    }

    public void setCost(List<Cost> cost) {
        this.cost = cost;
    }

    public int getNormalRewardStatus() {
        return normalRewardStatus;
    }

    public void setNormalRewardStatus(int normalRewardStatus) {
        this.normalRewardStatus = normalRewardStatus;
    }

    public int getAdvanceRewardStatus() {
        return advanceRewardStatus;
    }

    public void setAdvanceRewardStatus(int advanceRewardStatus) {
        this.advanceRewardStatus = advanceRewardStatus;
    }

    public List<RewardsInfo> getNormalRewards() {
        return normalRewards;
    }

    public void setNormalRewards(List<RewardsInfo> normalRewards) {
        this.normalRewards = normalRewards;
    }

    public List<RewardsInfo> getAdvanceRewards() {
        return advanceRewards;
    }

    public void setAdvanceRewards(List<RewardsInfo> advanceRewards) {
        this.advanceRewards = advanceRewards;
    }

    public List<Cost> getItems() {
        return items;
    }

    public void setItems(List<Cost> items) {
        this.items = items;
    }

    public List<Cost> getAdvancedItems() {
        return advancedItems;
    }

    public void setAdvancedItems(List<Cost> advancedItems) {
        this.advancedItems = advancedItems;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(int messageStatus) {
        this.messageStatus = messageStatus;
    }

    @Override
    public String toString() {
        return "Rewards{" +
                "id=" + id +
                ", taskId=" + taskId +
                ", taskStatus=" + taskStatus +
                ", tasks=" + tasks +
                ", cost=" + cost +
                ", normalRewardStatus=" + normalRewardStatus +
                ", advanceRewardStatus=" + advanceRewardStatus +
                ", normalRewards=" + normalRewards +
                ", advanceRewards=" + advanceRewards +
                ", items=" + items +
                ", advancedItems=" + advancedItems +
                ", message='" + message + '\'' +
                ", messageStatus=" + messageStatus +
                '}';
    }
}
