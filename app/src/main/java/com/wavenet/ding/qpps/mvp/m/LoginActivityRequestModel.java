package com.wavenet.ding.qpps.mvp.m;


import android.content.Context;

import com.dereck.library.interceptor.Transformer;
import com.dereck.library.observer.CommonObserver;
import com.dereck.library.utils.RxHttpUtils;
import com.wavenet.ding.qpps.api.ApiService;
import com.wavenet.ding.qpps.db.WavenetCallBack;
import com.wavenet.ding.qpps.utils.AppConfig;
import com.wavenet.ding.qpps.utils.AppTool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.zhy.http.okhttp.OkHttpUtils.post;

public class LoginActivityRequestModel {

    public void request(String userName, String passWord, CommonObserver<Object> callback) {
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("userName", userName);
        reqParams.put("passWord", passWord);
        RxHttpUtils

                .createApi(ApiService.class)
//                .userLogin("http://222.66.154.70:2088/Account/CheckUserLogin", reqParams)
                .userLogin( AppConfig.BeasUrl+"2088/Account/CheckUserLogin",reqParams)
                .compose(Transformer.switchSchedulers())
                .subscribe(callback);
    }

    public void FileRequest(Context mContext, CommonObserver<Object> callback) {
        String url = AppConfig.BeasUrl+"2056/api/File/UploadFile";

        Map<String, Object> map = new HashMap<>();
        map.put("time",System.currentTimeMillis());
        ArrayList <String> arrayList= (ArrayList<String>) AppTool.getFilesAllPath(AppTool.getCrashLogFolder(mContext,""));
        RxHttpUtils.uploadImgsWithParams(url, "file", map, arrayList)
                .compose(Transformer.switchSchedulers())
                .subscribe(callback);

    }



}
