package robot;

import com.forte.qqrobot.component.forlemoc.LemocApp;

import com.forte.qqrobot.component.forlemoc.LemocApplication;
import com.forte.qqrobot.component.forlemoc.LinkConfiguration;
import com.forte.qqrobot.sender.MsgSender;
import com.forte.qqrobot.utils.CQCodeUtil;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import robot.api.MyJob;

import java.sql.*;


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

    public static void main(String[] args) throws SQLException, SchedulerException {
        new LemocApplication().run(new MyRobotApplication());
        //////////////////////////////////////////////////轮询使用//////////////////////////////////////////////////////
        //创建任务
        JobDetail jobDetail = JobBuilder.newJob(MyJob.class).withIdentity("job1", "group1").build();
        //创建触发器 每10秒钟执行一次
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "group3")
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever())
                .build();
        //创建调度器
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        //将任务及其触发器放入调度器
        scheduler.scheduleJob(jobDetail, trigger);
        //调度器开始调度任务
        scheduler.start();

    }

}
