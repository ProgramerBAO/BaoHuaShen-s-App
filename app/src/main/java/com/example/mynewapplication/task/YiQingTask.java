package com.example.mynewapplication.task;

import android.os.AsyncTask;

import com.example.mynewapplication.bean.YiQingInfo;
import com.example.mynewapplication.utils.JsonUtils;

import org.json.JSONException;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author 沈宝铧
 * @date 2020/6/3
 * 不需要了 因为不是列表
 */
public class YiQingTask extends AsyncTask<String, Void, YiQingInfo> {

    private CallBack back;

    public YiQingTask(CallBack back) {
        this.back = back;
    }

    @Override
    protected YiQingInfo doInBackground(String... params) {
        YiQingInfo yiQingInfo = null;
        /**
         * 创建连接对象
         * data 已经是数据了
         */
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(String.valueOf(params[0])).build();

        try {
            Response response = client.newCall(request).execute();
            String data = response.body().string();
            //解析数据
            yiQingInfo = JsonUtils.jsonParse(data);
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }

        return yiQingInfo;
    }

    @Override
    protected void onPostExecute(YiQingInfo yiQingInfo) {
        super.onPostExecute(yiQingInfo);
        //传回到主活动
        if (back != null) {
            back.getResult(yiQingInfo);
        }
    }



    public interface CallBack {
        /**
         * @param result 接口
         */
        void getResult(YiQingInfo result);
    }
}
