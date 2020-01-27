package robot.model.wx.dynamic;
import java.util.List;

public class DynamicIndex {
    private long id;
    private String title;  //分类标题
    private List<DynamicItems> dynamicItems; //首页动态标题内容组成

    private String message;   //返回成功与否
    private int status;       //200 返回状态码

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<DynamicItems> getDynamicItems() {
        return dynamicItems;
    }

    public void setDynamicItems(List<DynamicItems> dynamicItems) {
        this.dynamicItems = dynamicItems;
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
        return "DynamicIndex{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dynamicItems=" + dynamicItems +
                ", message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}
