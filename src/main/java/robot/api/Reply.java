package robot.api;

public class Reply {
    private Result result;
    private Integer status;
    private String msg;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "result=" + result +
                ", status=" + status +
                ", msg='" + msg + '\'' +
                '}';
    }
}
