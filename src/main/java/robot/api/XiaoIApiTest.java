package robot.api;

import java.io.IOException;


public class XiaoIApiTest {

    public static void main(String[] args) throws IOException {
        String t = XiaoIApi.getReply("早餐好吃");
        System.out.print("t======================"+t);
    }

}