package com.wavenet.ding.qpps.mvp.m;

import android.util.Log;

import com.wavenet.ding.qpps.db.WavenetCallBack;
import com.wavenet.ding.qpps.utils.AppConfig;

import java.util.HashMap;
import java.util.Map;

import static com.zhy.http.okhttp.OkHttpUtils.post;

public class MapTrackPlayRequestModel {
    public void requestTrack(String S_RECODE_ID, WavenetCallBack callback) {

//        String urlstr = AppConfig.BeasUrl+"2056/api/T_TRAJECTORY/GetTrajectoryByMan"+S_RECODE_ID ;
        String urlstr = String.format(AppConfig.TrackUrl,S_RECODE_ID) ;
//        Map<String, Object> headerMaps = new HashMap<>();
//        headerMaps.put("Accept", "application/json");
//
//        SingleRxHttp.getInstance().addHeaders(headerMaps).createSApi(ApiService.class)
//
//                .requestTrack(urlstr)
//                .compose(Transformer.switchSchedulers())
//                .subscribe(callback);
//

        String url = AppConfig.BeasUrl1+"/trajectory/getTrajectoryByRecodeId";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("sRecodeId",S_RECODE_ID);
        Log.e("MOD-requestTrack:",S_RECODE_ID);
        post()
                .url(url)
                .params(reqParams)
                .build()
                .execute(callback);
      /*  RxHttpUtils
                .createApi(ApiService.class)
                .requestTrack(urlstr)
                .compose(Transformer.switchSchedulers())
                .subscribe(callback);*/


    }
}