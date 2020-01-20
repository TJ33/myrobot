package robot;

import com.forte.qqrobot.component.forlemoc.LemocApp;

import com.forte.qqrobot.component.forlemoc.LemocApplication;
import com.forte.qqrobot.component.forlemoc.LinkConfiguration;
import com.forte.qqrobot.sender.MsgSender;
import com.forte.qqrobot.utils.CQCodeUtil;

public class MyRobotApplication implements LemocApp {
    public void before(LinkConfiguration linkConfiguration) {
        linkConfiguration.setLocalQQNick("直男77号");
        linkConfiguration.setLocalQQCode("2635195492");
//        linkConfiguration.setCqPath("F:\\酷Q\\酷Q Air\\酷Q Air");
        linkConfiguration.setCqPath("F:\\酷Q\\酷Q pro图灵版\\酷Q Pro");
    }

    public void after(CQCodeUtil cqCodeUtil, MsgSender sender) {

    }

    public String author() {
        return null;
    }

    public static void main(String[] args) {
        System.out.print("aaaa");
        new LemocApplication().run(new MyRobotApplication());
    }
}
