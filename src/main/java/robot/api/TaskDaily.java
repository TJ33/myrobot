package robot.api;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import robot.mapper.UserConstantInterface;
import robot.utils.HttpClientUtil;
import robot.wx.model.User;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//@RestController
//@RequestMapping("/api")
@Controller
@RequestMapping("/api")
public class TaskDaily {

//        @PostMapping("/me/login")
//        public JsonResult user_login(
//                @RequestParam("code") String code,
//                @RequestParam("userHead") String userHead,
//                @RequestParam("userName") String userName,
//                @RequestParam("userGender") int userGender,
//                @RequestParam("userCity") String userCity,
//                @RequestParam("userProvince") String userProvince
//        ){
//            // 配置请求参数
//            Map<String, String> param = new HashMap<>();
//            param.put("appid", UserConstantInterface.WX_LOGIN_APPID);
//            param.put("secret", UserConstantInterface.WX_LOGIN_SECRET);
//            param.put("js_code", code);
//            param.put("grant_type", UserConstantInterface.WX_LOGIN_GRANT_TYPE);
//            // 发送请求
//            String wxResult = HttpClientUtil.doGet(UserConstantInterface.WX_LOGIN_URL, param);
//            JSONObject jsonObject = JSONObject.parseObject(wxResult);
//            // 获取参数返回的
//            String session_key = jsonObject.get("session_key").toString();
//            String open_id = jsonObject.get("openid").toString();
//            User user = new User();
//            user.setUserHead(userHead);
//            user.setUserName(userName);
//            user.setUserGender(userGender);
//            user.setUserName(userName);
//            user.setUserGender(userGender);
//            user.setUserNewLogin(new Date());
//            user.setCity(userCity);
//            user.setProvince(userProvince);
//            user.setOpenId(open_id);
//
////            根据返回的user实体类，判断用户是否是新用户，不是的话，更新最新登录时间，是的话，将用户信息存到数据库
////            User user = userService.selectByOpenId(open_id);
////            if(user != null){
////                user.setUserNewLogin(new Date());
////                userService.updateById(user);
////            }else{
////                User insert_user = new User();
////                insert_user.setUserHead(userHead);
////                insert_user.setUserName(userName);
////                insert_user.setUserGender(userGender);
////                insert_user.setUserNewLogin(new Date());
////                insert_user.setUserCity(userCity);
////                insert_user.setUserProvince(userProvince);
////                insert_user.setUserOpenid(open_id);
////                System.out.println("insert_user:"+insert_user.toString());
////                // 添加到数据库
////                Boolean flag = userService.insert(insert_user);
////                if(!flag){
////                    return new JsonResult(ResultCode.FAIL);
////                }
////            }
            // 封装返回小程序
//            Map<String, String> result = new HashMap<>();
//            result.put("session_key", session_key);
//            result.put("open_id", open_id);
//            return new JsonResult(ResultCode.SUCCESS, result);
//
//        }



}
