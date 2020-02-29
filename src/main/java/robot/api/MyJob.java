package robot.api;

import com.forte.qqrobot.anno.Filter;
import com.forte.qqrobot.anno.Listen;
import com.forte.qqrobot.beans.messages.msgget.GroupMsg;
import com.forte.qqrobot.beans.messages.types.GroupMsgType;
import com.forte.qqrobot.beans.messages.types.MsgGetTypes;
import com.forte.qqrobot.beans.types.KeywordMatchType;
import com.forte.qqrobot.beans.types.MostType;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import robot.linstenner.MyGroupMsg;


import java.io.IOException;
import java.util.Date;

public class MyJob implements Job {

    public void execute(JobExecutionContext arg0) throws JobExecutionException {
//        Date date = new Date();
////        System.out.println(date.toString());
            MyGroupMsg myGroupMsg = new MyGroupMsg();
        try {
            myGroupMsg.dynamicList();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
