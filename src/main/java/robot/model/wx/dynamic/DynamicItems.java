package robot.model.wx.dynamic;
import java.util.List;

public class DynamicItems {
    private long id;
    private String block_type; //activity_block  dynamic_block  板块
    private String block_name; //应援活动  板块名称
    private String img;         //板块封面图
    private String jumpPath;   ///events/event-clothes/event-clothes?id=903  小程序跳转地址

    private List<DynamicItemsDataArray> dynamicItemsDataArray;  //DynamicItems里面的Data内容

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBlock_type() {
        return block_type;
    }

    public void setBlock_type(String block_type) {
        this.block_type = block_type;
    }

    public String getBlock_name() {
        return block_name;
    }

    public void setBlock_name(String block_name) {
        this.block_name = block_name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getJumpPath() {
        return jumpPath;
    }

    public void setJumpPath(String jumpPath) {
        this.jumpPath = jumpPath;
    }

    public List<DynamicItemsDataArray> getDynamicItemsDataArray() {
        return dynamicItemsDataArray;
    }

    public void setDynamicItemsDataArray(List<DynamicItemsDataArray> dynamicItemsDataArray) {
        this.dynamicItemsDataArray = dynamicItemsDataArray;
    }

    @Override
    public String toString() {
        return "DynamicItems{" +
                "id=" + id +
                ", block_type='" + block_type + '\'' +
                ", block_name='" + block_name + '\'' +
                ", img='" + img + '\'' +
                ", jumpPath='" + jumpPath + '\'' +
                ", dynamicItemsDataArray=" + dynamicItemsDataArray +
                '}';
    }
}
