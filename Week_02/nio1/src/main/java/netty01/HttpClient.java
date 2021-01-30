package netty01;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpClient {

    public static void main(String[] args) {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpGet httpGet = new HttpGet("http://127.0.0.1:8808/");
        CloseableHttpResponse response = null;

        try {
            response = httpClient.execute(httpGet);

            HttpEntity responseEntity = response.getEntity();
            System.out.println("响应状态为："+response.getStatusLine());

            if(responseEntity != null){

                System.out.println("响应内容长度为："+responseEntity.getContentLength());
                System.out.println("响应内容为："+ EntityUtils.toString(responseEntity));

            }



        } catch (IOException e) {
            e.printStackTrace();
        }finally {

                try {
                    if(httpClient != null){
                        httpClient.close();
                    }

                    if(response != null){
                        response.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

        }
    }
}
