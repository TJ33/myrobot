package robot.model.wx.event;

public class Assets {
    private long id;
    private String bg;      //图片
    private String bg_color;   //颜色 16进制
    private String header_bubble;   //图片
    private String icon_stone;      //图片
    private String icon_stone_big;  //图片
    private String icon_lantern;   //图片
    private String icon_lock; //图片
    private String tab;//图片
    private String tab_active;//图片
    private String icon_silver;//图片
    private String icon_gold;//图片
    private String tab_task_title;     //"任务"
    private String tab_award_title;    //"奖励"
    private String page_title_img;//图片
    private String advanced_reward_modal_text;  //购买进阶之石后，奖励升级，且无论任何时候购买，所有任务奖励均会升级。获得的照片、语音等奖励，都会储存在“个人信息”——“储藏箱”中，您可以随时查看。
    private String default_header;//图片

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBg() {
        return bg;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }

    public String getBg_color() {
        return bg_color;
    }

    public void setBg_color(String bg_color) {
        this.bg_color = bg_color;
    }

    public String getHeader_bubble() {
        return header_bubble;
    }

    public void setHeader_bubble(String header_bubble) {
        this.header_bubble = header_bubble;
    }

    public String getIcon_stone() {
        return icon_stone;
    }

    public void setIcon_stone(String icon_stone) {
        this.icon_stone = icon_stone;
    }

    public String getIcon_stone_big() {
        return icon_stone_big;
    }

    public void setIcon_stone_big(String icon_stone_big) {
        this.icon_stone_big = icon_stone_big;
    }

    public String getIcon_lantern() {
        return icon_lantern;
    }

    public void setIcon_lantern(String icon_lantern) {
        this.icon_lantern = icon_lantern;
    }

    public String getIcon_lock() {
        return icon_lock;
    }

    public void setIcon_lock(String icon_lock) {
        this.icon_lock = icon_lock;
    }

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab;
    }

    public String getTab_active() {
        return tab_active;
    }

    public void setTab_active(String tab_active) {
        this.tab_active = tab_active;
    }

    public String getIcon_silver() {
        return icon_silver;
    }

    public void setIcon_silver(String icon_silver) {
        this.icon_silver = icon_silver;
    }

    public String getIcon_gold() {
        return icon_gold;
    }

    public void setIcon_gold(String icon_gold) {
        this.icon_gold = icon_gold;
    }

    public String getTab_task_title() {
        return tab_task_title;
    }

    public void setTab_task_title(String tab_task_title) {
        this.tab_task_title = tab_task_title;
    }

    public String getTab_award_title() {
        return tab_award_title;
    }

    public void setTab_award_title(String tab_award_title) {
        this.tab_award_title = tab_award_title;
    }

    public String getPage_title_img() {
        return page_title_img;
    }

    public void setPage_title_img(String page_title_img) {
        this.page_title_img = page_title_img;
    }

    public String getAdvanced_reward_modal_text() {
        return advanced_reward_modal_text;
    }

    public void setAdvanced_reward_modal_text(String advanced_reward_modal_text) {
        this.advanced_reward_modal_text = advanced_reward_modal_text;
    }

    public String getDefault_header() {
        return default_header;
    }

    public void setDefault_header(String default_header) {
        this.default_header = default_header;
    }

    @Override
    public String toString() {
        return "Assets{" +
                "id=" + id +
                ", bg='" + bg + '\'' +
                ", bg_color='" + bg_color + '\'' +
                ", header_bubble='" + header_bubble + '\'' +
                ", icon_stone='" + icon_stone + '\'' +
                ", icon_stone_big='" + icon_stone_big + '\'' +
                ", icon_lantern='" + icon_lantern + '\'' +
                ", icon_lock='" + icon_lock + '\'' +
                ", tab='" + tab + '\'' +
                ", tab_active='" + tab_active + '\'' +
                ", icon_silver='" + icon_silver + '\'' +
                ", icon_gold='" + icon_gold + '\'' +
                ", tab_task_title='" + tab_task_title + '\'' +
                ", tab_award_title='" + tab_award_title + '\'' +
                ", page_title_img='" + page_title_img + '\'' +
                ", advanced_reward_modal_text='" + advanced_reward_modal_text + '\'' +
                ", default_header='" + default_header + '\'' +
                '}';
    }
}
