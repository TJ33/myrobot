package robot;

import com.forte.qqrobot.component.forlemoc.LemocApp;

import com.forte.qqrobot.component.forlemoc.LemocApplication;
import com.forte.qqrobot.component.forlemoc.LinkConfiguration;
import com.forte.qqrobot.sender.MsgSender;
import com.forte.qqrobot.utils.CQCodeUtil;

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

    public static void main(String[] args) throws SQLException {
        new LemocApplication().run(new MyRobotApplication());

        //JDBC驱动名
        String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

        //数据库URL：这里的tt是数据库名称
        String JDBC_URL = "jdbc:mysql://localhost:3306/robot?useSSL=false&serverTimezone=UTC";

//        数据库的用户名与密码
        String USER = "root";
        String PASS = "123456";

        //通过DriverManager类获得该连接对象才能访问数据库
        Connection connection = null;

//        通过Connection获得该结果对象用于执行静态的SQL语句
        Statement statement = null;

        try {
//            注册JDBC驱动
            Class.forName(JDBC_DRIVER);

//            数据库的连接：通过DriverManager类的getConnection方法，传入三个参数：数据库URL、用户名、用户密码，实例化connection对象
            connection = DriverManager.getConnection(JDBC_URL,USER,PASS);

//            实例化statement对象
            statement = (Statement) connection.createStatement();

//            定义数据库查询语句：查询aa表中的name、sex两列数据
            String sql = "SELECT name FROM user";
//            执行查询语句
            ResultSet rSet = statement.executeQuery(sql);

//            展开查询到的数据
            while(rSet.next()) {

//                这里getString()方法中的参数对应的是数据库表中的列名
                String get_name = rSet.getString("name");


//                输出数据
                System.out.println("名字:"+get_name);


            }

//            依次关闭对象
            rSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
