package robot.api;

public class Result {
    private String type;
    private String content;
    private String relquestion;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRelquestion() {
        return relquestion;
    }

    public void setRelquestion(String relquestion) {
        this.relquestion = relquestion;
    }

    @Override
    public String toString() {
        return "Result{" +
                "type='" + type + '\'' +
                ", content='" + content + '\'' +
                ", relquestion='" + relquestion + '\'' +
                '}';
    }
}
