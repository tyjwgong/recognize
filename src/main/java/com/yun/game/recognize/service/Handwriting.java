package com.yun.game.recognize.service;

import com.yun.game.recognize.utils.Base64Util;
import com.yun.game.recognize.utils.FileUtil;
import com.yun.game.recognize.utils.HttpUtil;

import java.net.URLEncoder;

/**
 * @version 1.0.0
 * @Description 手写文字识别
 * @author: gongjw1@lenovo.com
 * @create: 2020-04-06 20:42
 * @since 1.0.0
 **/
public class Handwriting {
    /**
     * 重要提示代码中所需工具类
     * FileUtil,Base64Util,HttpUtil,GsonUtils请从
     * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
     * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
     * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
     * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
     * 下载
     */
    public static String handwriting() {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/ocr/v1/handwriting";
        try {
            // 本地文件路径
            String filePath = "D:\\4c2dff68952baab7a2bdb8e9c339a4e.jpg";
            byte[] imgData = FileUtil.readFileByBytes(filePath);
            String imgStr = Base64Util.encode(imgData);
            String imgParam = URLEncoder.encode(imgStr, "UTF-8");

            String param = "image=" + imgParam;

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken = "24.a7400938d9826ed68075d78d9a13c5b7.2592000.1588760948.282335-19288575";

            String result = HttpUtil.post(url, accessToken, param);
            System.out.println(result);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Handwriting.handwriting();
    }
}
