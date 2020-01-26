package robot.linstenner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;



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
    @Filter(value="老婆",keywordMatchType = KeywordMatchType.CONTAINS,mostType = MostType.ANY_MATCH)
    public void onGroupMsg(GroupMsg groupMsg, MsgSender msgSender, CQCodeUtil cqCodeUtil){
        if(groupMsg.getGroup().equals("709284916")) {
            CQCode em = cqCodeUtil.getCQCode_Emoji("128513");
            msgSender.SENDER.sendGroupMsg(groupMsg.getGroup(),em+" 你在想桃子");
            CQCode cqCode = cqCodeUtil.getCQCode_Image("1.jpg");
            msgSender.SENDER.sendGroupMsg(groupMsg.getGroup(),cqCode+"");
            System.out.println("结果老婆111---------------"+cqCode);
        }
    }

    //关键字监听 发送图片
    @Listen(MsgGetTypes.groupMsg)
    @Filter(value="墨汐图片",keywordMatchType = KeywordMatchType.CONTAINS,mostType = MostType.ANY_MATCH)
    public void onGroupRobotReply(GroupMsg groupMsg, MsgSender msgSender, CQCodeUtil cqCodeUtil) throws IOException {
        if(groupMsg.getGroup().equals("709284916")) {
            CQCode em = cqCodeUtil.getCQCode_Emoji("128513");
//            msgSender.SENDER.sendGroupMsg(groupMsg.getGroup(), XiaoIApi.getReply(groupMsg.getMsg()));  //复读机
            //发送图片
            CQCode cqCode = cqCodeUtil.getCQCode_Image("1.jpg");
            msgSender.SENDER.sendGroupMsg(groupMsg.getGroup(),cqCode+"");
            System.out.println("结果墨汐图片111---------------"+cqCode.toString());
        }
    }

    //关键字监听 发送语音
    @Listen(MsgGetTypes.groupMsg)
    @Filter(value="贝拉语音",keywordMatchType = KeywordMatchType.CONTAINS,mostType = MostType.ANY_MATCH)
    public void onGroupRobotReplyYY(GroupMsg groupMsg, MsgSender msgSender, CQCodeUtil cqCodeUtil) throws IOException {
        if(groupMsg.getGroup().equals("709284916")) {
//            CQCode em = cqCodeUtil.getCQCode_Emoji("128513");
//            msgSender.SENDER.sendGroupMsg(groupMsg.getGroup(), XiaoIApi.getReply(groupMsg.getMsg()));
            //发送语音
            CQCode cqCode = cqCodeUtil.getCQCode_Record("相信.mp3",false);
            msgSender.SENDER.sendGroupMsg(groupMsg.getGroup(),cqCode+"");
        }
    }

    //B站粉丝数监听
    @Listen(MsgGetTypes.groupMsg)
    @Filter(value="战斗吧歌姬",keywordMatchType = KeywordMatchType.CONTAINS,mostType = MostType.ANY_MATCH)
    public void getFollowers(GroupMsg groupMsg, MsgSender msgSender, CQCodeUtil cqCodeUtil) throws IOException {
        if(groupMsg.getGroup().equals("709284916")) {
            JSONObject jsonObject = this.jsonObject("https://api.bilibili.com/x/relation/stat?vmid=364225566&jsonp=jsonp","视频");
            String follower = jsonObject.getString("follower"); //粉丝数
            String following = jsonObject.getString("following");  //关注数
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String date = sdf.format(new Date());
            String message = "截止到"+date+"  战斗吧歌姬的粉丝数为"+follower;
            msgSender.SENDER.sendGroupMsg(groupMsg.getGroup(),message);
        }
    }

    //B站视频相关
    @Listen(MsgGetTypes.groupMsg)
    @Filter(value="视频",keywordMatchType = KeywordMatchType.CONTAINS,mostType = MostType.ANY_MATCH)
    public void getVedio(GroupMsg groupMsg, MsgSender msgSender, CQCodeUtil cqCodeUtil) throws IOException {
        Integer index = 1;
        if(groupMsg.getGroup().equals("709284916")) {
            String msg = groupMsg.getMsg();
            String[] indexArray = msg.split("视频");
            if(indexArray.length==2){
                index = Integer.parseInt(indexArray[1]);
            }
            JSONObject vedioResult = this.jsonObject("https://api.bilibili.com/x/space/arc/search?mid=364225566&ps=30&tid=0&pn=1&keyword=&order=pubdate&jsonp=jsonp","视频");
            JSONObject resultList = vedioResult.getJSONObject("list");
            JSONArray vedioList = resultList.getJSONArray("vlist");
            String aid = vedioList.getJSONObject(index-1).getString("aid");
            JSONObject jsonObject = this.jsonObject("https://api.bilibili.com/x/web-interface/view?aid="+aid,"视频");
            JSONObject stat = jsonObject.getJSONObject("stat"); //分区id
            String title = jsonObject.getString("title");  //视频标题
            String desc = jsonObject.getString("desc");    //视频简介
            String view = stat.getString("view");          //播放量
            String danmaku = stat.getString("danmaku");    //弹幕数
            String reply = stat.getString("reply");        //评论数
            String favorite = stat.getString("favorite");  //收藏数
            String coin = stat.getString("coin");           //硬币数
            String share = stat.getString("share");         //分享数
            String now_rank = stat.getString("now_rank");
            String his_rank = stat.getString("his_rank");
            String like = stat.getString("like");            //点赞数
            String dislike = stat.getString("dislike");
            String evaluation = stat.getString("evaluation");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String date = sdf.format(new Date());
            String message = "截止到"+date+"\n"+title+"\n"+"https://www.bilibili.com/video/av"+aid+"\n"+"播放量为  "+view+"\n"+"点赞数为  "+share+"\n"+"硬币数为  "+coin+"\n"+"收藏数为  "+favorite+"\n"+"分享数为  "+share+"\n"+"弹幕数为  "+danmaku+"\n"+"评论数为  "+reply;

//          String message = "截止到"+date+"\n"+title+":  "+desc+"\n"+"播放量为"+view+"\n"+"点赞数为"+share+"\n"+"硬币数为"+coin+"\n"+"收藏数为"+favorite+"\n"+"分享数为"+share+"\n"+"弹幕数为"+danmaku+"\n"+"评论数为"+reply;
            msgSender.SENDER.sendGroupMsg(groupMsg.getGroup(),message);
        }
    }

    //B站音频相关
    @Listen(MsgGetTypes.groupMsg)
    @Filter(value="音频",keywordMatchType = KeywordMatchType.CONTAINS,mostType = MostType.ANY_MATCH)
    public void getAudio(GroupMsg groupMsg, MsgSender msgSender, CQCodeUtil cqCodeUtil) throws IOException {
        Integer index = 1;
        if(groupMsg.getGroup().equals("709284916")) {
            String msg = groupMsg.getMsg();
            String[] indexArray = msg.split("音频");
            if(indexArray.length==2){
                index = Integer.parseInt(indexArray[1]);
            }
            JSONObject audioResult = this.jsonObject("https://api.bilibili.com/audio/music-service/web/song/upper?uid=364225566&pn=1&ps=30&order=1&jsonp=jsonp","音频1");
            JSONObject audioObjcet = audioResult.getJSONObject("data");
            JSONArray jsonArray = audioObjcet.getJSONArray("data");
            String sid = jsonArray.getJSONObject(index-1).getString("id");
//            JSONObject statistic = jsonArray.getJSONObject(1).getJSONObject("statistic");
//            String sid = statistic.getString("sid");
//            System.out.println("sid======================================="+sid);
            //118969
//            JSONObject jsonObject = this.jsonObject("https://www.bilibili.com/audio/music-service-c/web/song/info?sid="+sid,"音频2");
//            System.out.println("jsonObject======================================"+jsonObject);
            String message = "音频地址为"+"https://www.bilibili.com/audio/au"+sid+"?type=3";
            msgSender.SENDER.sendGroupMsg(groupMsg.getGroup(),message);
        }
    }

    //B站专栏相关
    @Listen(MsgGetTypes.groupMsg)
    @Filter(value="专栏",keywordMatchType = KeywordMatchType.CONTAINS,mostType = MostType.ANY_MATCH)
    public void getArticle(GroupMsg groupMsg, MsgSender msgSender, CQCodeUtil cqCodeUtil) throws IOException {
        Integer index = 1;
        if(groupMsg.getGroup().equals("709284916")) {
            String msg = groupMsg.getMsg();
            String[] indexArray = msg.split("专栏");
            if(indexArray.length==2){
                index = Integer.parseInt(indexArray[1]);
            }
            JSONObject vedioResult = this.jsonObject("https://api.bilibili.com/x/space/Article?mid=364225566&pn=1&ps=12&sort=publish_time&jsonp=jsonp","专栏");
            JSONArray jsonArray = vedioResult.getJSONArray("articles");
            String id = jsonArray.getJSONObject(index-1).getString("id");
            JSONObject jsonObject = this.jsonObject("https://api.bilibili.com/x/Article/viewinfo?id="+id+"&mobi_app=pc&jsonp=jsonp","专栏");

            String author_name = jsonObject.getString("author_name");   //发专栏UP
            String banner_url = jsonObject.getString("banner_url");     //封面图
            String title = jsonObject.getString("title");                //专栏标题
            JSONObject stats = jsonObject.getJSONObject("stats");             //统计数据相关
            String view = stats.getString("view");                       //阅读量
            String favorite = stats.getString("favorite");              //收藏
            String like = stats.getString("like");                      //点赞
            String dislike = stats.getString("dislike");
            String reply = stats.getString("reply");                    //评论
            String share = stats.getString("share");                    //分享
            String coin = stats.getString("coin");                      //硬币
            String dynamic = stats.getString("dynamic");

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String date = sdf.format(new Date());
            String message = "截止到"+date+"\n"+title+"\n"+"https://www.bilibili.com/read/cv"+id+"\n"+"阅读量为  "+view+"\n"+"点赞数为  "+like+"\n"+"硬币数为  "+coin+"\n"+"收藏数为  "+favorite+"\n"+"分享数为  "+share+"\n"+"评论数为  "+reply;
            msgSender.SENDER.sendGroupMsg(groupMsg.getGroup(),message);
        }
    }

    //B站相簿相关
    @Listen(MsgGetTypes.groupMsg)
    @Filter(value="相簿",keywordMatchType = KeywordMatchType.CONTAINS,mostType = MostType.ANY_MATCH)
    public void getDoc(GroupMsg groupMsg, MsgSender msgSender, CQCodeUtil cqCodeUtil) throws IOException {
        Integer index = 1;
        if(groupMsg.getGroup().equals("709284916")) {
            String msg = groupMsg.getMsg();
            String[] indexArray = msg.split("相簿");
            if(indexArray.length==2){
                index = Integer.parseInt(indexArray[1]);
            }
            JSONObject vedioResult = this.jsonObject("https://api.vc.bilibili.com/link_draw/v1/doc/doc_list?uid=364225566&page_num=0&page_size=30&biz=all","相簿");
            JSONArray jsonArray = vedioResult.getJSONArray("items");
            String doc_id = jsonArray.getJSONObject(index-1).getString("doc_id");
            JSONObject jsonObject = this.jsonObject("https://api.vc.bilibili.com/link_draw/v1/doc/detail?doc_id="+doc_id,"相簿");
            JSONObject itemJsonObject = jsonObject.getJSONObject("item");
            JSONArray picturesArray = itemJsonObject.getJSONArray("pictures");                 //图片
            String title = itemJsonObject.getString("title");                                  //标题
            String description = itemJsonObject.getString("description");                     //描述
            String view_count = itemJsonObject.getString("view_count");                       //阅读量
            String collect_count = itemJsonObject.getString("collect_count");                 //收藏
            String vote_count = itemJsonObject.getString("vote_count");                       //点赞
            String dislike = itemJsonObject.getString("dislike");
            String comment_count = itemJsonObject.getString("comment_count");                //评论
            String upload_time = itemJsonObject.getString("upload_time");                    //发出时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String date = sdf.format(new Date());
            String message = "";
            System.out.println("title----"+title);
            if(title.length()==0){
                message = "截止到"+date+"\n"+"https://h.bilibili.com/"+doc_id+"\n"+"阅读量为  "+view_count+"\n"+"点赞数为  "+vote_count+"\n"+"收藏数为  "+collect_count;
            }else{
                message = "截止到"+date+"\n"+title+"\n"+"https://h.bilibili.com/"+doc_id+"\n"+"阅读量为  "+view_count+"\n"+"点赞数为  "+vote_count+"\n"+"收藏数为  "+collect_count;
            }
            msgSender.SENDER.sendGroupMsg(groupMsg.getGroup(),message);
        }
    }


    //音频 https://api.bilibili.com/audio/music-service/web/song/upper?uid=364225566&pn=1&ps=30&order=1&jsonp=jsonp
    //详情 https://www.bilibili.com/audio/music-service-c/web/song/info?sid=1189888

    //专栏 https://api.bilibili.com/x/space/article?mid=364225566&pn=1&ps=12&sort=publish_time&jsonp=jsonp&callback=__jp7
    //详情 https://api.bilibili.com/x/article/viewinfo?id=4411335&mobi_app=pc&jsonp=jsonp


    //相簿 https://api.vc.bilibili.com/link_draw/v1/doc/doc_list?uid=364225566&page_num=0&page_size=30&biz=all
    //详情 https://api.vc.bilibili.com/link_draw/v1/doc/detail?doc_id=49448310





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

    //封装请求
    public JSONObject jsonObject(String url,String type) throws IOException {
        JSONObject data = new JSONObject();
        //get请求
        String content = "";
        URLConnection urlConnection = new URL(url).openConnection();
        HttpURLConnection connection = (HttpURLConnection) urlConnection;
        connection.setRequestMethod("GET");
        //连接
        connection.connect();
        //得到响应码
        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            if(type=="视频"||type=="专栏"||type=="相簿"||type=="音频1"){
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
                System.out.println("bufferedReader====================================="+bufferedReader);
                StringBuilder bs = new StringBuilder();
                String l;
                while ((l = bufferedReader.readLine()) != null) {
                    System.out.println("bufferedReader.readLine====================================="+bufferedReader.readLine());
                    bs.append(l).append("\n");
                }
                System.out.println("bs=================================="+bs);
                content = bs.toString();
            }else{
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
                System.out.println("bufferedReader111111====================================="+bufferedReader);
                StringBuilder bs = new StringBuilder();
                String l;
                while ((l = bufferedReader.readLine()) != null) {
                    System.out.println("bufferedReader.readLine111111====================================="+bufferedReader.readLine());
                    bs.append(l).append("\n");
                }
                System.out.println("bs=================================="+bs);
                content = bs.toString();
            }




            if(type=="视频"||type=="专栏"||type=="相簿"){
                JSONObject jsonObject = JSON.parseObject(content);
                data = jsonObject.getJSONObject("data");
            }else if(type=="音频1"){
                data = JSON.parseObject(content);
                System.out.println("音频1================================="+data);
            }else if(type=="音频2"){
                System.out.println("音频2================================="+content);
                JSONObject jsonObject = JSON.parseObject(content);
                System.out.println("音频2================================="+jsonObject);
                data = jsonObject.getJSONObject("data");
                System.out.println("音频2================================="+data);
            }
        }
        return data;
    }

    //监听B站动态
    @Listen(MsgGetTypes.groupMsg)
    @Filter(value="所有人",keywordMatchType = KeywordMatchType.CONTAINS,mostType = MostType.ANY_MATCH)
    public void getDynamic(GroupMsg groupMsg, MsgSender msgSender, CQCodeUtil cqCodeUtil) throws IOException {
        if(groupMsg.getGroup().equals("709284916")) {
            JSONObject jsonObject = this.jsonObject("https://api.vc.bilibili.com/dynamic_svr/v1/dynamic_svr/dynamic_num?uid=3805255&type=268435455&rsp_type=1&current_dynamic_id=346935900419269691&update_num_dy_id=346935900419269691","视频");
            System.out.print("jsonObject=============================="+jsonObject+"\n");
            String new_num = jsonObject.getString("new_num");
            String update_num = jsonObject.getString("update_num");
            JSONObject extra_flag  = jsonObject.getJSONObject("extra_flag");
            String unlogin_dynamics = extra_flag.getString("unlogin_dynamics");
//            msgSender.SENDER.sendGroupMsg(groupMsg.getGroup(),"yooooo发布了一条新动态");
        }
    }
}
