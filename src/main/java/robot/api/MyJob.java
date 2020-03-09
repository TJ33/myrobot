package robot.api;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import robot.linstenner.MyGroupMsg;


import java.io.IOException;
public class MyJob implements Job {

    public void execute(JobExecutionContext arg0) throws JobExecutionException {
            MyGroupMsg myGroupMsg = new MyGroupMsg();
        try {
            myGroupMsg.getDaily();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
