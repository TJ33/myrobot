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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import robot.model.bilibili.UpUser;
import robot.services.bilibili.UpUserService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class MyGroupMsg {

    @Autowired
    private UpUserService upUserService;


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

    //动态监听
    public void dynamicList() throws IOException {
            JSONObject vedioResult = this.jsonObject("https://api.vc.bilibili.com/dynamic_svr/v1/dynamic_svr/space_history?visitor_uid=3805255&host_uid=364225566&offset_dynamic_id=0&need_top=1","");
            System.out.println("vedioResult================================"+vedioResult);
            JSONArray jsonArray = vedioResult.getJSONArray("cards");
            System.out.println("jsonArray================================"+jsonArray);
            for(int i = 0;i<1;i++){
                JSONObject extendJsonObject = jsonArray.getJSONObject(i);
                JSONObject cardObject = extendJsonObject.getJSONObject("card");
                System.out.println("cardObject=================================="+cardObject);
                JSONObject owner = cardObject.getJSONObject("owner");

                //区分是转载还是自己投稿
                if(owner!=null){
                    Long aid = cardObject.getLong("aid");
                    Long attribute = cardObject.getLong("attribute");
                    Long cid = cardObject.getLong("cid");
                    Integer copyright = cardObject.getInteger("copyright");
                    Long ctime = cardObject.getLong("ctime");
                    String desc = cardObject.getString("desc");
                    JSONObject dimension = cardObject.getJSONObject("dimension");
                    Integer duration = cardObject.getInteger("duration");
                    String dynamic = cardObject.getString("dynamic");
                    String jump_url = cardObject.getString("jump_url");
                    String pic = cardObject.getString("pic");
                    JSONObject player_info = cardObject.getJSONObject("player_info");
                    Long pubdate = cardObject.getLong("pubdate");
                    JSONObject rights = cardObject.getJSONObject("rights");
                    JSONObject stat = cardObject.getJSONObject("stat");
                    Integer state = cardObject.getInteger("state");
                    Integer tid = cardObject.getInteger("tid");
                    String title = cardObject.getString("title");
                    String tname = cardObject.getString("tname");
                    Integer videos = cardObject.getInteger("videos");
                    System.out.println("owner=================================="+owner);
                    System.out.println("aid=================================="+aid);
                    System.out.println("attribute=================================="+attribute);
                    System.out.println("cid=================================="+cid);
                    System.out.println("copyright=================================="+copyright);
                    System.out.println("ctime=================================="+ctime);
                    System.out.println("desc=================================="+desc);
                    System.out.println("dimension=================================="+dimension);
                    System.out.println("duration=================================="+duration);
                    System.out.println("dynamic=================================="+dynamic);
                    System.out.println("jump_url=================================="+jump_url);
                    System.out.println("pic=================================="+pic);
                    System.out.println("player_info=================================="+player_info);
                    System.out.println("pubdate=================================="+pubdate);
                    System.out.println("rights=================================="+rights);
                    System.out.println("stat=================================="+stat);
                    System.out.println("state=================================="+state);
                    System.out.println("tid=================================="+tid);
                    System.out.println("title=================================="+title);
                    System.out.println("tname=================================="+tname);
                    System.out.println("videos=================================="+videos);
                    System.out.println("------------------------------------------------------------------------自己投稿"+"\n");
                    System.out.println("------------------------------------------------------------------------自己投稿"+"\n");
                    String message = "啊啊啊啊啊这是小妹的视频:"+title+"\n"+"视频地址:"+"https://www.bilibili.com/video/av"+aid+"\n"+"封面图:"+pic;
                }else{
                    JSONObject item = cardObject.getJSONObject("item");
                    String content = item.getString("content");
                    JSONObject origin_extend_json = cardObject.getJSONObject("origin_extend_json");
                    JSONObject origin = cardObject.getJSONObject("origin");
                    JSONObject origin_user = cardObject.getJSONObject("origin_user");
                    JSONObject vip = cardObject.getJSONObject("vip");
                    JSONObject pendant = cardObject.getJSONObject("pendant");
                    JSONObject card = cardObject.getJSONObject("card");
                    JSONObject info = cardObject.getJSONObject("info");
                    JSONObject user = cardObject.getJSONObject("user");
                    System.out.println("item=================================="+item);
                    System.out.println("content=================================="+content);
                    System.out.println("origin_extend_json=================================="+origin_extend_json);
                    System.out.println("origin=================================="+origin);
                    System.out.println("origin_user=================================="+origin_user);
                    System.out.println("vip=================================="+vip);
                    System.out.println("pendant=================================="+pendant);
                    System.out.println("card=================================="+card);
                    System.out.println("info=================================="+info);
                    System.out.println("user=================================="+user);
                    System.out.println("------------------------------------------------------------------------自己转载"+"\n");
                    System.out.println("------------------------------------------------------------------------自己转载"+"\n");
                    String message = "啊啊啊啊啊这是小妹的动态:"+content;
                }
            }
    }



    //动态监听
    @Listen(MsgGetTypes.groupMsg)
    @Filter(value="动态",keywordMatchType = KeywordMatchType.CONTAINS,mostType = MostType.ANY_MATCH)
    public void dynamicHistory(GroupMsg groupMsg, MsgSender msgSender, CQCodeUtil cqCodeUtil) throws IOException {
        if(groupMsg.getGroup().equals("709284916")) {
            JSONObject vedioResult = this.jsonObject("https://api.vc.bilibili.com/dynamic_svr/v1/dynamic_svr/space_history?visitor_uid=3805255&host_uid=364225566&offset_dynamic_id=0&need_top=1","");
            System.out.println("vedioResult================================"+vedioResult);
            JSONArray jsonArray = vedioResult.getJSONArray("cards");
            System.out.println("jsonArray================================"+jsonArray);
            for(int i = 0;i<jsonArray.size();i++){
                JSONObject extendJsonObject = jsonArray.getJSONObject(i);
//                System.out.println("extendJsonObject=================================="+extendJsonObject);
                JSONObject cardObject = extendJsonObject.getJSONObject("card");
                System.out.println("cardObject=================================="+cardObject);
                JSONObject owner = cardObject.getJSONObject("owner");

                //区分是转载还是自己投稿
                if(owner!=null){
                    Long aid = cardObject.getLong("aid");
                    Long attribute = cardObject.getLong("attribute");
                    Long cid = cardObject.getLong("cid");
                    Integer copyright = cardObject.getInteger("copyright");
                    Long ctime = cardObject.getLong("ctime");
                    String desc = cardObject.getString("desc");
                    JSONObject dimension = cardObject.getJSONObject("dimension");
                    Integer duration = cardObject.getInteger("duration");
                    String dynamic = cardObject.getString("dynamic");
                    String jump_url = cardObject.getString("jump_url");
                    String pic = cardObject.getString("pic");
                    JSONObject player_info = cardObject.getJSONObject("player_info");
                    Long pubdate = cardObject.getLong("pubdate");
                    JSONObject rights = cardObject.getJSONObject("rights");
                    JSONObject stat = cardObject.getJSONObject("stat");
                    Integer state = cardObject.getInteger("state");
                    Integer tid = cardObject.getInteger("tid");
                    String title = cardObject.getString("title");
                    String tname = cardObject.getString("tname");
                    Integer videos = cardObject.getInteger("videos");
                    System.out.println("owner=================================="+owner);
                    System.out.println("aid=================================="+aid);
                    System.out.println("attribute=================================="+attribute);
                    System.out.println("cid=================================="+cid);
                    System.out.println("copyright=================================="+copyright);
                    System.out.println("ctime=================================="+ctime);
                    System.out.println("desc=================================="+desc);
                    System.out.println("dimension=================================="+dimension);
                    System.out.println("duration=================================="+duration);
                    System.out.println("dynamic=================================="+dynamic);
                    System.out.println("jump_url=================================="+jump_url);
                    System.out.println("pic=================================="+pic);
                    System.out.println("player_info=================================="+player_info);
                    System.out.println("pubdate=================================="+pubdate);
                    System.out.println("rights=================================="+rights);
                    System.out.println("stat=================================="+stat);
                    System.out.println("state=================================="+state);
                    System.out.println("tid=================================="+tid);
                    System.out.println("title=================================="+title);
                    System.out.println("tname=================================="+tname);
                    System.out.println("videos=================================="+videos);
                    System.out.println("------------------------------------------------------------------------自己投稿"+"\n");
                    System.out.println("------------------------------------------------------------------------自己投稿"+"\n");
                    String message = "啊啊啊啊啊这是小妹的视频:"+title+"\n"+"视频地址:"+"https://www.bilibili.com/video/av"+aid+"\n"+"封面图:"+pic;
                }else{
                    JSONObject item = cardObject.getJSONObject("item");
                    String content = item.getString("content");
                    JSONObject origin_extend_json = cardObject.getJSONObject("origin_extend_json");
                    JSONObject origin = cardObject.getJSONObject("origin");
                    JSONObject origin_user = cardObject.getJSONObject("origin_user");
                    JSONObject vip = cardObject.getJSONObject("vip");
                    JSONObject pendant = cardObject.getJSONObject("pendant");
                    JSONObject card = cardObject.getJSONObject("card");
                    JSONObject info = cardObject.getJSONObject("info");
                    JSONObject user = cardObject.getJSONObject("user");
                    System.out.println("item=================================="+item);
                    System.out.println("content=================================="+content);
                    System.out.println("origin_extend_json=================================="+origin_extend_json);
                    System.out.println("origin=================================="+origin);
                    System.out.println("origin_user=================================="+origin_user);
                    System.out.println("vip=================================="+vip);
                    System.out.println("pendant=================================="+pendant);
                    System.out.println("card=================================="+card);
                    System.out.println("info=================================="+info);
                    System.out.println("user=================================="+user);
                    System.out.println("------------------------------------------------------------------------自己转载"+"\n");
                    System.out.println("------------------------------------------------------------------------自己转载"+"\n");
                    String message = "啊啊啊啊啊这是小妹的动态:"+content;
                }



            }

//            JSONArray[] = vedioResult.getJSONArray("cards");
//            System.out.println("cardJsonObject================================"+cardJsonObject);
//            JSONObject jsonObjectData = vedioResult.getJSONObject("data");
//
//            System.out.println("jsonObjectData================================"+jsonObjectData);
        }
    }

    //关键字监听
    @Listen(MsgGetTypes.groupMsg)
    @Filter(value="老婆",keywordMatchType = KeywordMatchType.CONTAINS,mostType = MostType.ANY_MATCH)
    public void onGroupMsg(GroupMsg groupMsg, MsgSender msgSender, CQCodeUtil cqCodeUtil){
        if(groupMsg.getGroup().equals("709284916")) {
//            CQCode em = cqCodeUtil.getCQCode_Emoji("128513");
//            msgSender.SENDER.sendGroupMsg(groupMsg.getGroup(),em+" 你在想桃子");
//            CQCode cqCode = cqCodeUtil.getCQCode_Image("1.jpg");
//            msgSender.SENDER.sendGroupMsg(groupMsg.getGroup(),cqCode+"");
//            System.out.println("结果老婆111---------------"+cqCode);
            String test = upUserService.test();
            System.out.println("test==============================================="+test);
            List<UpUser> list = upUserService.findUpUserList();
            System.out.println("list==============================================="+list);
            for(int i = 0;i<list.size();i++){
                System.out.println("list i=========================="+list.get(i));
            }
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
        String aid = "";
        if(groupMsg.getGroup().equals("709284916")) {
            String msg = groupMsg.getMsg();
                System.out.println("视频===================");
                String[] indexArray = msg.split("视频");
                if(indexArray.length==2){
                    index = Integer.parseInt(indexArray[1]);
                }
                JSONObject vedioResult = this.jsonObject("https://api.bilibili.com/x/space/arc/search?mid=364225566&ps=30&tid=0&pn=1&keyword=&order=pubdate&jsonp=jsonp","视频");
                JSONObject resultList = vedioResult.getJSONObject("list");
                JSONArray vedioList = resultList.getJSONArray("vlist");
                aid = vedioList.getJSONObject(index-1).getString("aid");
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

    //B站视频相关
    @Listen(MsgGetTypes.groupMsg)
    @Filter(value="av",keywordMatchType = KeywordMatchType.CONTAINS,mostType = MostType.ANY_MATCH)
    public void getVedioAV(GroupMsg groupMsg, MsgSender msgSender, CQCodeUtil cqCodeUtil) throws IOException {
        Integer index = 1;
        String aid = "";
        if(groupMsg.getGroup().equals("709284916")) {
            String msg = groupMsg.getMsg();
            String[] indexArray = msg.split("v");
            aid = indexArray[1];
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

    //B站音频相关
    @Listen(MsgGetTypes.groupMsg)
    @Filter(value="音频",keywordMatchType = KeywordMatchType.CONTAINS,mostType = MostType.ANY_MATCH)
    public void getAudioAU(GroupMsg groupMsg, MsgSender msgSender, CQCodeUtil cqCodeUtil) throws IOException {
        Integer index = 1;
        if(groupMsg.getGroup().equals("709284916")) {
            String msg = groupMsg.getMsg();
            String[] indexArray = msg.split("u");
            String sid = indexArray[1];
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

    //B站专栏相关
    @Listen(MsgGetTypes.groupMsg)
    @Filter(value="专栏",keywordMatchType = KeywordMatchType.CONTAINS,mostType = MostType.ANY_MATCH)
    public void getArticleCV(GroupMsg groupMsg, MsgSender msgSender, CQCodeUtil cqCodeUtil) throws IOException {
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
            }else{
                JSONObject jsonObject = JSON.parseObject(content);
                data = jsonObject.getJSONObject("data");
            }
        }
        return data;
    }




    //B站专栏相关
//    @Listen(MsgGetTypes.groupMsg)
//    @Filter(value="每日任务",keywordMatchType = KeywordMatchType.CONTAINS,mostType = MostType.ANY_MATCH)
    public void getDaily() throws IOException {
        Date today = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String time = simpleDateFormat.format(today);
        if(time=="00:00:00"){
            for(int i = 1; i<7; i++){
                //签到
                JSONObject check = this.dailyTask("https://starmicro.happyelements.cn/v1/assist/check-in","idol_id="+i,"GET");
                //看视频
                JSONObject assistLook = this.dailyTask("https://starmicro.happyelements.cn/v1/assist/assist","idol_id="+i+"&type=2","GET");
                //点赞视频
                JSONObject praise = this.dailyTask("https://starmicro.happyelements.cn/v1/praise/praise","type=3&id=945&status=1&idol_id="+i,"POST");
                //评论视频 需要三次
                JSONObject commentOne = this.dailyTask("https://starmicro.happyelements.cn/v1/comment/comment","content=打卡&id=945&type=1&pid=0&idol_id="+i,"POST");
                JSONObject commentTwo = this.dailyTask("https://starmicro.happyelements.cn/v1/comment/comment","content=打卡&id=945&type=1&pid=0&idol_id="+i,"POST");
                JSONObject commentThree = this.dailyTask("https://starmicro.happyelements.cn/v1/comment/comment","content=打卡&id=945&type=1&pid=0&idol_id="+i,"POST");
                //分享视频
                JSONObject assistShare = this.dailyTask("https://starmicro.happyelements.cn/v1/assist/assist","idol_id="+i+"&type=5","GET");
                //点赞2个帖子 两次
                JSONObject praiseForumOne = this.dailyTask("https://starmicro.happyelements.cn/v2/praise/praise-forum","id=48434&status=1&idol_id="+i+"&is_mission=1","POST");
                JSONObject praiseForumTwo = this.dailyTask("https://starmicro.happyelements.cn/v2/praise/praise-forum","id=48434&status=1&idol_id="+i+"&is_mission=1","POST");
                //关注2个用户 四次
                JSONObject followUserOne = this.dailyTask("https://starmicro.happyelements.cn/v2/follow/follow-user","target_uid=17986&is_mission=1&idol_id="+i,"POST");
                JSONObject followUserTwo = this.dailyTask("https://starmicro.happyelements.cn/v2/follow/follow-user","target_uid=17986&is_mission=1&idol_id="+i,"POST");
                JSONObject followUserThree = this.dailyTask("https://starmicro.happyelements.cn/v2/follow/follow-user","target_uid=17986&is_mission=1&idol_id="+i,"POST");
                JSONObject followUserFour = this.dailyTask("https://starmicro.happyelements.cn/v2/follow/follow-user","target_uid=17986&is_mission=1&idol_id="+i,"POST");
                System.out.println("签到"+check+"歌姬id="+i);
                System.out.println("看视频"+assistLook+"歌姬id="+i);
                System.out.println("点赞视频"+praise+"歌姬id="+i);
                System.out.println("评论视频1"+commentOne+"歌姬id="+i);
                System.out.println("评论视频2"+commentTwo+"歌姬id="+i);
                System.out.println("评论视频3"+commentThree+"歌姬id="+i);
                System.out.println("分享视频"+assistShare+"歌姬id="+i);
                System.out.println("点赞2个帖子1"+praiseForumOne+"歌姬id="+i);
                System.out.println("点赞2个帖子2"+praiseForumTwo+"歌姬id="+i);
                System.out.println("关注2个用户1"+followUserOne+"歌姬id="+i);
                System.out.println("关注2个用户2"+followUserTwo+"歌姬id="+i);
                System.out.println("关注2个用户3"+followUserThree+"歌姬id="+i);
                System.out.println("关注2个用户4"+followUserFour+"歌姬id="+i);
            }
        }



        System.out.println("time======================="+time);
//        if(groupMsg.getGroup().equals("709284916")) {
//        }
    }

    //自动签到打卡
    public JSONObject dailyTask(String url,String param,String method) throws IOException {
        JSONObject data = new JSONObject();
        if(method=="GET"){
            String get=this.sendGet(url, param);
            System.out.println("get========================"+get);
        }else{
            String post = this.sendPost(url,param);
            System.out.println("post========================"+post);
        }

        return data;
    }
    //GET
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.setRequestProperty("authorization","Miinno bwn8I2SuG72FCXAzEAnCLYVof0qtn88A_1554773225");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    //POST
    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("authorization","Miinno bwn8I2SuG72FCXAzEAnCLYVof0qtn88A_1554773225");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！" + e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }
//        public static void main(String[] args) {
//            //发送 GET 请求
//            String s=this.sendGet("http://localhost:6144/Home/RequestString", "key=123&v=456");
//            System.out.println(s);
//
//            //发送 POST 请求
//            String sr=HttpRequest.sendPost("http://localhost:6144/Home/RequestPostString", "key=123&v=456");
//            System.out.println(sr);
//        }





    //监听B站动态
//    @Listen(MsgGetTypes.groupMsg)
//    @Filter(value="所有人",keywordMatchType = KeywordMatchType.CONTAINS,mostType = MostType.ANY_MATCH)
//    @ResponseBody
//    public void getDynamic(GroupMsg groupMsg, MsgSender msgSender, CQCodeUtil cqCodeUtil) throws IOException {
//        if(groupMsg.getGroup().equals("709284916")) {
//            List<UpUser> findUpUserList = upUserService.findUpUserList();
//            System.out.println("findUpUserList============================"+findUpUserList);
//            JSONObject jsonObject = this.jsonObject("https://api.vc.bilibili.com/dynamic_svr/v1/dynamic_svr/dynamic_num?uid=3805255&type=268435455&rsp_type=1&current_dynamic_id=346935900419269691&update_num_dy_id=346935900419269691","视频");
//            System.out.print("jsonObject=============================="+jsonObject+"\n");
//            String new_num = jsonObject.getString("new_num");
//            String update_num = jsonObject.getString("update_num");
//            JSONObject extra_flag  = jsonObject.getJSONObject("extra_flag");
//            String unlogin_dynamics = extra_flag.getString("unlogin_dynamics");
//            msgSender.SENDER.sendGroupMsg(groupMsg.getGroup(),"yooooo发布了一条新动态");
//        }
//    }
}
