package com.gyb.vip;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Hello world!
 *
 */
public class MovieDown {
    private static AtomicInteger i = new AtomicInteger(2);
    public static void main( String[] args ) throws Exception {
        String baseUri02 = "https://youku163.zuida-bofang.com/20190121/25904_75d346ab/800k/hls/9c0025fd61f";//02
        String baseUri03 = "https://youku163.zuida-bofang.com/20190121/25903_906d7c25/800k/hls/97fc781e38c";//03
        String baseUri04 = "https://youku163.zuida-bofang.com/20190121/25902_709b1d25/800k/hls/620f72b8abc";
        String baseUri05 = "https://sohu.zuida-163sina.com/20190121/wL0lnyWC/800kb/hls/h8Aa5591";
        String baseUri06 = "https://sohu.zuida-163sina.com/20190121/7IKS5jIE/800kb/hls/GJu9TEJ75827";
        String baseUri07 = "https://youku163.zuida-bofang.com/20190128/26966_dfdfa983/800k/hls/c2d69ae1d76";
        String baseUri08 = "https://youku163.zuida-bofang.com/20190128/26965_af003973/800k/hls/764f3912b66";
        String baseUri09 = "https://youku163.zuida-bofang.com/20190128/26964_7c798294/800k/hls/5981edcc117";
        String baseUri10 = "https://bili.meijuzuida.com/20190203/2155_1f3413df/800k/hls/75b83ed9ca7";
        String baseUri11 = "https://bili.meijuzuida.com/20190203/2154_aef6154e/800k/hls/b280e53d4d6";
        String baseUri12 = "https://bili.meijuzuida.com/20190203/2153_85b42054/800k/hls/73efd498aaa";
        String baseUri13 = "https://bili.meijuzuida.com/20190211/3253_95e4cfdd/800k/hls/62b8a379792";
        String baseUri14 = "https://bili.meijuzuida.com/20190211/3252_479065fa/800k/hls/113b15a9455";
        String baseUri15 = "https://bili.meijuzuida.com/20190211/3251_c40a4d76/800k/hls/1d45b951a11";
        System.out.println("开始批量下载......");
        /*new Thread(()->{
            DownUtil.loopDown(String.format("/root/%02d.mp4",4),baseUri04,"%06d.ts");
        }).start();
        new Thread(()->{
            DownUtil.loopDown(String.format("/root/%02d.mp4",i.getAndIncrement()),baseUri05,"%03d.ts");
        }).start();
        new Thread(()->{
            DownUtil.loopDown(String.format("/root/%02d.mp4",i.getAndIncrement()),baseUri06,"%03d.ts");
        }).start();
        new Thread(()->{
            DownUtil.loopDown(String.format("/root/%02d.mp4",7),baseUri07,"%06d.ts");
        }).start();*/

        new Thread(()->{
            DownUtil.loopDown(String.format("/root/%02d.mp4",8),baseUri08,"%06d.ts");
        }).start();/*
        new Thread(()->{
            DownUtil.loopDown(String.format("/root/%02d.mp4",i.getAndIncrement()),baseUri09,"%06d.ts");
        }).start();
        new Thread(()->{
            DownUtil.loopDown(String.format("/root/%02d.mp4",i.getAndIncrement()),baseUri10,"%06d.ts");
        }).start();
        new Thread(()->{
            DownUtil.loopDown(String.format("/root/%02d.mp4",i.getAndIncrement()),baseUri11,"%06d.ts");
        }).start();
        new Thread(()->{
            DownUtil.loopDown(String.format("/root/%02d.mp4",i.getAndIncrement()),baseUri12,"%06d.ts");
        }).start();
        new Thread(()->{
            DownUtil.loopDown(String.format("/root/%02d.mp4",i.getAndIncrement()),baseUri13,"%06d.ts");
        }).start();
        new Thread(()->{
            DownUtil.loopDown(String.format("/root/%02d.mp4",i.getAndIncrement()),baseUri14,"%06d.ts");
        }).start();
        new Thread(()->{
            DownUtil.loopDown(String.format("/root/%02d.mp4",i.getAndIncrement()),baseUri15,"%06d.ts");
        }).start();
*/
    }
}
