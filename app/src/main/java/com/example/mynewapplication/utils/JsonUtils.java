package com.example.mynewapplication.utils;

import com.example.mynewapplication.bean.YiQingInfo;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author 沈宝铧
 * @date 2020/6/3
 * 解析json数据
 */
public class JsonUtils {
    public static YiQingInfo jsonParse(String data) throws JSONException {
        YiQingInfo result ;
        JSONObject object1 = new JSONObject(data);
        JSONObject object = object1.getJSONObject("data");
        JSONObject object2 = object.getJSONObject("add_daily");

        /**
         * 累计确诊
         * 累计死亡
         * 先有疑似
         * 累计治愈
         * 现有确诊
         * 境外输入
         */
        String gntotal = object.getString("gntotal");
        String deathtotal = object.getString("deathtotal");
        String sustotal = object.getString("sustotal");
        String curetotal = object.getString("curetotal");
        String econNum = object.getString("econNum");
        String jwsrNuml = object.getString("jwsrNum");
        String times = object.getString("times");

        /**
         * 新增病例
         * 新增死亡
         * 新增治愈
         * 新增疑似
         * 新增境外输入
         */
        String addcon = object2.getString("addcon_new");
        String adddeath = object2.getString("adddeath_new");
        String addcure = object2.getString("addcure_new");
        String addsus = object2.getString("wjw_addsus_new");
        String addjwsr = object2.getString("addjwsr");

        result = new YiQingInfo(gntotal, deathtotal, sustotal,
                curetotal, econNum, jwsrNuml, addcon, adddeath,
                addcure, addsus, addjwsr, times);

        return result;

    }
}
