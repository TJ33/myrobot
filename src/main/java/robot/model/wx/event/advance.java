package robot.model.wx.event;

public class advance {

    private long id;
    private ProductInfo productInfo;

    private String message;  //"SUCCESS"
    private int status;      //200

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
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
        return "advance{" +
                "id=" + id +
                ", productInfo=" + productInfo +
                ", message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}
