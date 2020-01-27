package robot.model.wx.post;

public class Meta {
    private long id;
    private int totalCount; //总数量
    private int pageCount;  //页码总数
    private int currentPage; //当前页码
    private int perPage;      //每页显示

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    @Override
    public String toString() {
        return "Meta{" +
                "id=" + id +
                ", totalCount=" + totalCount +
                ", pageCount=" + pageCount +
                ", currentPage=" + currentPage +
                ", perPage=" + perPage +
                '}';
    }
}
