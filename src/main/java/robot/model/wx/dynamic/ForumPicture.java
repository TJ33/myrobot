package robot.model.wx.dynamic;

import java.util.List;

public class ForumPicture {

    private List<String> images;  //原图
    private List<String> thumbs;  //缩略图

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<String> getThumbs() {
        return thumbs;
    }

    public void setThumbs(List<String> thumbs) {
        this.thumbs = thumbs;
    }

    @Override
    public String toString() {
        return "ForumPicture{" +
                "images=" + images +
                ", thumbs=" + thumbs +
                '}';
    }
}
