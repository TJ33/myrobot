package robot.linstenner;

import com.forte.qqrobot.anno.Filter;
import com.forte.qqrobot.anno.Listen;
import com.forte.qqrobot.beans.cqcode.CQCode;
import com.forte.qqrobot.beans.messages.msgget.*;
import com.forte.qqrobot.beans.messages.types.GroupAddRequestType;
import com.forte.qqrobot.beans.messages.types.GroupAdminChangeType;
import com.forte.qqrobot.beans.messages.types.GroupBanType;
import com.forte.qqrobot.beans.messages.types.MsgGetTypes;
import com.forte.qqrobot.beans.types.KeywordMatchType;
import com.forte.qqrobot.beans.types.MostType;
import com.forte.qqrobot.sender.MsgSender;
import com.forte.qqrobot.utils.CQCodeUtil;
import robot.api.XiaoIApi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;


public class MyGroupMsg {

    //准备输入动态
    //https://api.vc.bilibili.com/dynamic_svr/v1/dynamic_svr/dynamic_num?uid=3805255&type=268435455&rsp_type=1&current_dynamic_id=342345864571194547&update_num_dy_id=342345864571194547
    //response {"code":0,"msg":"","message":"","data":{"new_num":0,"update_num":0,"_gt_":0}}

    //发送动态
    //create:  https://api.vc.bilibili.com/dynamic_svr/v1/dynamic_svr/create
    //body:
    // dynamic_id: 0
    //type: 4
    //rid: 0
    //content: 啊啊
    //extension: {"emoji_type":1}
    //at_uids:
    //ctrl: []
    //csrf_token: 34e69083e4e5acc5d4caa9a91abdafec

    //response
    //{"code":0,"
    // msg":"",
    // "message":"",
    // "data":{
    // "result":0,
    // "errmsg":";Create dynamic 342349528180418849 OK,result:1; Push create kafka:0; Register comment result:0; Add outbox result:1; Send at_msg result:0",
    // "dynamic_id":342349528180418849,
    // "create_result":1,
    // "dynamic_id_str":"342349528180418849",
    // "_gt_":0
    // }
    // }

    //关键字监听
    @Listen(MsgGetTypes.groupMsg)
    @Filter(value="老婆",keywordMatchType = KeywordMatchType.RE_CQCODE_REGEX,mostType = MostType.ANY_MATCH)
    public void onGroupMsg(GroupMsg groupMsg, MsgSender msgSender, CQCodeUtil cqCodeUtil){
        if(groupMsg.getGroup().equals("709284916")) {
            CQCode em = cqCodeUtil.getCQCode_Emoji("128513");
            msgSender.SENDER.sendGroupMsg(groupMsg.getGroup(),em+" 你在想桃子");
            CQCode cqCode = cqCodeUtil.getCQCode_Image("1.jpg");
            msgSender.SENDER.sendGroupMsg(groupMsg.getGroup(),cqCode+"");
            System.out.println("结果111---------------"+cqCode);
        }
    }

    //关键字监听
    @Listen(MsgGetTypes.groupMsg)
    public void onGroupRobotReply(GroupMsg groupMsg, MsgSender msgSender, CQCodeUtil cqCodeUtil) throws IOException {
        if(groupMsg.getGroup().equals("709284916")) {
            CQCode em = cqCodeUtil.getCQCode_Emoji("128513");
//            msgSender.SENDER.sendGroupMsg(groupMsg.getGroup(), XiaoIApi.getReply(groupMsg.getMsg()));
            CQCode cqCode = cqCodeUtil.getCQCode_Image("1.jpg");
            msgSender.SENDER.sendGroupMsg(groupMsg.getGroup(),cqCode+"");
            System.out.println("结果111---------------"+cqCode.toString());


        }
    }

    //B站粉丝数监听
//    @Listen(MsgGetTypes.groupMsg)
//    public void getFollowers(GroupMsg groupMsg, MsgSender msgSender, CQCodeUtil cqCodeUtil) throws IOException {
//        if(groupMsg.getGroup().equals("709284916")) {
//            //get请求
//            String content = null;
//            URLConnection urlConnection = new URL("http://api.bilibili.com/archive_stat/stat?aid=82574994&type=jsonp").openConnection();
//            System.out.println("urlConnection=============="+urlConnection);
//            HttpURLConnection connection = (HttpURLConnection) urlConnection;
//            connection.setRequestMethod("GET");
//            //连接
//            connection.connect();
//            //得到响应码
//            int responseCode = connection.getResponseCode();
//            if (responseCode == HttpURLConnection.HTTP_OK) {
//                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader
//                        (connection.getInputStream(), StandardCharsets.UTF_8));
//                StringBuilder bs = new StringBuilder();
//                String l;
//                while ((l = bufferedReader.readLine()) != null) {
//                    bs.append(l).append("\n");
//                }
//                content = bs.toString();
//                System.out.println("content============"+content);
//                System.out.println("content============"+content.getClass().toString());
//            }
//        }
//    }


  //欢迎新人入群监听
    @Listen(MsgGetTypes.groupMemberIncrease)
    public void groupMemberIncrease(GroupMemberIncrease groupMemberIncrease, MsgSender msgSender, CQCodeUtil cqCodeUtil){
        if(groupMemberIncrease.getGroup().equals("709284916")) {
            CQCode sm = cqCodeUtil.getCQCode_Face("99");
            System.out.println("sm=================="+sm);
            CQCode em = cqCodeUtil.getCQCode_At(groupMemberIncrease.getBeOperatedQQ());
            msgSender.SENDER.sendGroupMsg(groupMemberIncrease.getGroup(),em+""+sm+" 欢迎新奶昔");
        }
    }

    //新人离群监听
    @Listen(MsgGetTypes.groupMemberReduce)
    public void groupMemberReduce(GroupMemberReduce groupMemberReduce, MsgSender msgSender, CQCodeUtil cqCodeUtil){
        if(groupMemberReduce.getGroup().equals("709284916")) {
            CQCode sm = cqCodeUtil.getCQCode_Face("99");
            System.out.println("sm=================="+sm);
            CQCode em = cqCodeUtil.getCQCode_At(groupMemberReduce.getBeOperatedQQ());
            msgSender.SENDER.sendGroupMsg(groupMemberReduce.getGroup(),em+""+sm+" 再见新奶昔");
        }
    }

    //群禁言事件
    @Listen(MsgGetTypes.groupBan)
    public void groupBan(GroupBan groupBan,MsgSender msgSender){
        System.out.print("被禁言了");
        if(groupBan.getGroup().equals("709284916")){
            //获取禁言类型 禁言/接触禁言
            GroupBanType groupBanType = groupBan.getBanType();
            System.out.print("groupBanType============================"+groupBanType);
            //群号
            String group = groupBan.getGroup();
            System.out.print("group============================"+group);
            //操作者的QQ号
            String operatorQQ = groupBan.getOperatorQQ();
            System.out.print("operatorQQ============================"+operatorQQ);
            //被操作者的QQ号
            String BeOperatedQQ = groupBan.getBeOperatedQQ();
            System.out.print("BeOperatedQQ============================"+BeOperatedQQ);
            Long time = groupBan.time();
            System.out.print("time============================"+time);
        }
    }

    //好友增加事件
    @Listen(MsgGetTypes.friendAdd)
    public void friendAdd(FriendAdd friendAdd,MsgSender msgSender){
        System.out.print("好友增加事件");
        String qqCode = friendAdd.getQQCode();
        System.out.print("qqCode=================================="+qqCode);
    }

    //管理员变动
    @Listen(MsgGetTypes.groupAdminChange)
    public void groupAdminChange(GroupAdminChange groupAdminChange,MsgSender msgSender){
        System.out.print("管理员变动");
        if(groupAdminChange.getGroup().equals("709284916")){
            //操作者的QQ号
            String operatorQQ = groupAdminChange.getOperatorQQ();
            System.out.print("operatorQQ============================"+operatorQQ);
            //被操作者的QQ号
            String BeOperatedQQ = groupAdminChange.getBeOperatedQQ();
            System.out.print("BeOperatedQQ============================"+BeOperatedQQ);

            GroupAdminChangeType type = groupAdminChange.getType();
            System.out.print("type=================================="+type);
        }
    }

    //请求-添加好友
    @Listen(MsgGetTypes.friendAddRequest)
    public void friendAddRequest(FriendAddRequest friendAddRequest,MsgSender msgSender){
        System.out.print("请求-添加好友");
        String qqCode = friendAddRequest.getQQ();
        String msg = friendAddRequest.getMsg();
        System.out.print("qqCode=================================="+qqCode);
        System.out.print("msg=================================="+msg);
    }

    //请求-群添加
    @Listen(MsgGetTypes.groupAddRequest)
    public void groupAddRequest(GroupAddRequest groupAddRequest,MsgSender msgSender){
        System.out.print("请求-群添加");
        if(groupAddRequest.getGroup().equals("709284916")){
            //请求者的QQ号
            String qq = groupAddRequest.getQQCode();
            System.out.print("qq============================"+qq);
            //请求者的入群消息
            String msg = groupAddRequest.getMsg();
            System.out.print("msg=================================="+msg);
            //加群类型
            GroupAddRequestType groupAddRequestType = groupAddRequest.getRequestType();
            System.out.print("groupAddRequestType=================================="+groupAddRequestType);
        }
    }

    //事件-群文件上传
    @Listen(MsgGetTypes.groupFileUpload)
    public void groupFileUpload(GroupFileUpload groupFileUpload,MsgSender msgSender){
        System.out.print("事件-群文件上传");
        if(groupFileUpload.getGroup().equals("709284916")){
            //上传者的QQ号
            String qq = groupFileUpload.getQQCode();
            System.out.print("qq============================"+qq);
            //文件名
            String file = groupFileUpload.getFileName();
            System.out.print("file=================================="+file);
            //文件大小
            Long fileSize = groupFileUpload.getFileSize();
            System.out.print("fileSize=================================="+fileSize);
            //文件Busid
            String fileBusid = groupFileUpload.getFileBusid();
            System.out.print("fileBusid================================="+fileBusid);
        }
    }
}
