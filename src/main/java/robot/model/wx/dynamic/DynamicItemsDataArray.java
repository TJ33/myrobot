package robot.model.wx.dynamic;

import java.util.List;

public class DynamicItemsDataArray {
    private long id;
    private String type;  //forum 动态类型
    private List<DynamicItemsData> dynamicItemsData;  //动态Data内容

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<DynamicItemsData> getDynamicItemsData() {
        return dynamicItemsData;
    }

    public void setDynamicItemsData(List<DynamicItemsData> dynamicItemsData) {
        this.dynamicItemsData = dynamicItemsData;
    }

    @Override
    public String toString() {
        return "DynamicItemsDataArray{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", dynamicItemsData=" + dynamicItemsData +
                '}';
    }
}
