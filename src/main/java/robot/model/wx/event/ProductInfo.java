package robot.model.wx.event;

public class ProductInfo {
    private long id;
    private String productInfoId;
    private String resId;
    private String number;
    private String fee;
    private String pay_type;
    private String pay_type_id;
    private String platform;
    private String expire_time;
    private String show;
    private String name;
    private String desc;
    private String icon;
    private String type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductInfoId() {
        return productInfoId;
    }

    public void setProductInfoId(String productInfoId) {
        this.productInfoId = productInfoId;
    }

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getPay_type() {
        return pay_type;
    }

    public void setPay_type(String pay_type) {
        this.pay_type = pay_type;
    }

    public String getPay_type_id() {
        return pay_type_id;
    }

    public void setPay_type_id(String pay_type_id) {
        this.pay_type_id = pay_type_id;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getExpire_time() {
        return expire_time;
    }

    public void setExpire_time(String expire_time) {
        this.expire_time = expire_time;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "id=" + id +
                ", productInfoId='" + productInfoId + '\'' +
                ", resId='" + resId + '\'' +
                ", number='" + number + '\'' +
                ", fee='" + fee + '\'' +
                ", pay_type='" + pay_type + '\'' +
                ", pay_type_id='" + pay_type_id + '\'' +
                ", platform='" + platform + '\'' +
                ", expire_time='" + expire_time + '\'' +
                ", show='" + show + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", icon='" + icon + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
