package robot.model.wx;

import robot.model.wx.support.Medal;

import java.util.List;

public class WXUser {
    private long id;
    private long uid;  //uid
    private int sex;   //性别 1男 2女
    private String nickName;  //微信昵称
    private String birth;     //生日
    private String tel;       //电话号码
    private String headimg;  //头像
    private String address;  //地址
    private long createAt;  //创建时间
    private String areaCode; //86  可能是电话前缀
    private String headFrame; //徽章图片
    private int talkFrame; //0
    private Medal medal;      //里程牌
    private int officialVerify; //0
    private boolean isSetPassword; //true
    private List<String> multiAccount; //[]

    private String message;   //"SUCCESS"   消息成功与否
    private Integer status;   //状态码 2000



}
