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
 * @author gengyuanbo
 * 2019/02/18
 */
public class DownUtil {
    public static void loopDown(String saveFileName,String baseUri,String formatStr){
        try {
            HttpClient httpClient = HttpClientBuilder.create().build();
            FileOutputStream fos = new FileOutputStream(saveFileName);
            HttpGet httpGet = null;
            HttpResponse resp = null;
            StatusLine statusLine = null;
            int statusCode = 200;
            HttpEntity entity = null;
            InputStream is = null;
            int n = 0;
            int i = 0;
            String uri;
            while (true) {
                uri = baseUri + String.format(formatStr, i++);
                System.out.println("下载" + uri + "开始");
                httpGet = new HttpGet(uri);
                resp = httpClient.execute(httpGet);
                statusLine = resp.getStatusLine();
                statusCode = statusLine.getStatusCode();
                if (statusCode == 200) {
                    entity = resp.getEntity();
                    is = entity.getContent();
                    byte[] buff = new byte[512];
                    while ((n = is.read(buff)) != -1) {
                        fos.write(buff, 0, n);
                    }
                    System.out.println("成功！");
                } else {
                    if (i > 20)
                        System.out.println("下载完成！");
                    else {
                        System.out.println("可能下载失败！");
                        System.out.println("失败，状态码：" + statusCode);
                    }
                    System.out.println("下载结束！");
                    break;
                }
                httpGet.releaseConnection();
            }
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
