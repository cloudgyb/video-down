package com.gyb.vip;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws Exception {
        HttpClient httpClient = HttpClientBuilder.create().build();
        //FileOutputStream fos = new FileOutputStream("D:/流浪地球.mp4");
        FileOutputStream fos = new FileOutputStream("D:/新喜剧之王.mp4");
        HttpGet httpGet = null;
        HttpResponse resp = null;
        StatusLine statusLine = null;
        int statusCode = 200;
        HttpEntity entity = null;
        InputStream is = null;
        int n = 0;
       // String baseUri = "https://youku.com-l-youku.com/20190207/20335_d1f19bfb/1000k/hls/284e2012ca2";
       // String baseUri = "https://youku.com-l-youku.com/20190207/20332_cdc7792b/1000k/hls/157ad3c5231";
        String baseUri = "https://sohu.zuida-163sina.com/20190206/wc41sbsu/800kb/hls/0c2W4xly1207";

        int i=0;
        String uri;
        while(true) {
            uri = baseUri+String.format("%03d.ts",i++);
            System.out.println("下载"+uri+"开始");
            httpGet = new HttpGet(uri);
            resp = httpClient.execute(httpGet);
            statusLine = resp.getStatusLine();
            statusCode = statusLine.getStatusCode();
            if(statusCode == 200) {
                entity = resp.getEntity();
                is = entity.getContent();
                byte[] buff = new byte[512];
                while ((n = is.read(buff)) != -1) {
                    fos.write(buff, 0, n);
                }
                System.out.println("成功！");
            }else{
                System.out.println("失败，状态码："+statusCode);
                System.out.println("下载结束！");
                break;
            }
            httpGet.releaseConnection();
        }
        fos.close();
    }
}
