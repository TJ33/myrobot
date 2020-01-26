package robot.model;

public class UpUser {
    private Integer mid;          //B站mid
    private Integer following;   //关注人数
    private Integer follower;    //粉丝数

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getFollowing() {
        return following;
    }

    public void setFollowing(Integer following) {
        this.following = following;
    }

    public Integer getFollower() {
        return follower;
    }

    public void setFollower(Integer follower) {
        this.follower = follower;
    }

    @Override
    public String toString() {
        return "UpUser{" +
                "mid=" + mid +
                ", following=" + following +
                ", follower=" + follower +
                '}';
    }
}
