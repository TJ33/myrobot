package robot.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;

import java.io.IOException;

public class XiaoIApi {

    public static String getReply(String question) throws IOException {
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "question="+question+"&appkey=996d22c26fcc08aa");
        Request request = new Request.Builder()
                .url("https://api.jisuapi.com/iqa/query")
                .post(body)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addHeader("User-Agent", "PostmanRuntime/7.13.0")
                .addHeader("Accept", "*/*")
                .addHeader("Cache-Control", "no-cache")
                .addHeader("Postman-Token", "01935796-dd42-4924-9468-55e85896d901,0754e87c-b0d8-410a-acb8-9fb9cad1f51c")
                .addHeader("Host", "api.jisuapi.com")
//                .addHeader("accept-encoding", "gzip, deflate")
                .addHeader("content-length", "69")
                .addHeader("Connection", "keep-alive")
                .addHeader("cache-control", "no-cache")
                .build();

        Response response = client.newCall(request).execute();

        String result = response.body().string();
        //1.初始化json字符串
        //2.创建ObjectMapper对象
        ObjectMapper mapper = new ObjectMapper();
        //3.转换为JAVA对象
        Reply reply = mapper.readValue(result,Reply.class);
        String content = reply.getResult().getContent();
        return content;
    }
}
