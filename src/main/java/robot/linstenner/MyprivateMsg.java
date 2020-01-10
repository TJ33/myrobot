package robot.linstenner;

import com.forte.qqrobot.anno.Filter;
import com.forte.qqrobot.anno.Listen;
import com.forte.qqrobot.beans.cqcode.CQCode;
import com.forte.qqrobot.beans.messages.msgget.PrivateMsg;
import com.forte.qqrobot.beans.messages.types.MsgGetTypes;
import com.forte.qqrobot.beans.types.KeywordMatchType;
import com.forte.qqrobot.sender.MsgSender;
import com.forte.qqrobot.utils.CQCodeUtil;

@Listen(MsgGetTypes.privateMsg)
public class MyprivateMsg {

    public void onPrivateMsg(PrivateMsg msg, MsgSender msgSender, CQCodeUtil cqCodeUtil){
        System.out.print("msg===================="+msg.getMsg()+"\n");
        CQCode getCQCode_Image = cqCodeUtil.getCQCode_Image("111.jpg");
        System.out.print("getCQCode_Image===================="+getCQCode_Image+"\n");
        msgSender.SENDER.sendPrivateMsg(msg.getQQ(),msg.getMsg());

    }

}
